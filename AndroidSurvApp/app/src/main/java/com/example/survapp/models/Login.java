package com.example.survapp.models;

import android.util.Patterns;

import com.example.survapp.activities.LoginActivity;
import com.example.survapp.util.ConexionServidor;
import com.example.survapp.util.Protocolo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.apache.commons.codec.binary.Hex;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login {

    private Usuario usuario;
    private MessageDigest md;
    private Gson gson;
    private Protocolo protocolo;

    public Login(){
        usuario = new Usuario();
        this.gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
    }

    public boolean iniciarLogin(String correo, String password){
        boolean iniciar = false;
        try {
            String passEncriptada = encriptar(password);
            ConexionServidor.abrirSocket();
            ConexionServidor.getSalida().writeInt(protocolo.INICIAR_SESION);
            Sesion sesion = new Sesion(correo,passEncriptada);
            ConexionServidor.getSalida().writeUTF(gson.toJson(sesion));
            if(ConexionServidor.getEntrada().readInt()==protocolo.SESION_INICIADA){
                usuario = gson.fromJson(ConexionServidor.getEntrada().readUTF(),Usuario.class);
                iniciar = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException npe) {
            npe.printStackTrace();
        }

        return iniciar;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public boolean comprobarCorreo(String correo){
        if(correo == null)
            return false;
        if(correo.isEmpty() || correo.length()<6){
            return false;
        }
        if(Patterns.EMAIL_ADDRESS.matcher(correo).matches())
            return true;
        return false;
    }

    public boolean comprobarPassword(String password){
        if(password == null){
            return false;
        }
        if(password.isEmpty())
            return false;
        if(password.length()<6){
            return false;
        }
        return true;
    }

    public String encriptar(String password) {

        String passEncriptada = "";
        try {
            this.md = MessageDigest.getInstance("SHA-512");
            this.md.update(password.getBytes());
            byte[] bytes = md.digest();
            passEncriptada = String.copyValueOf(Hex.encodeHex(bytes));
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(LoginActivity.class.getName()).log(Level.SEVERE, null, ex);
        }
        return passEncriptada;
    }

}
