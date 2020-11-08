package com.example.survapp.models;

import android.util.Patterns;
import android.widget.TextView;
import com.example.survapp.R;
import com.example.survapp.activities.LoginActivity;
import com.example.survapp.util.ConexionServidor;
import com.example.survapp.util.Protocolo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.apache.commons.codec.binary.Hex;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Registrar {

    private Usuario usuario;
    private MessageDigest md;
    private Gson gson;
    private Protocolo protocolo;
    private TextView info;
    private String email;
    private String password;
    private String passwordConfirm;
    private String accountName;

    public Registrar(TextView info, String email, String password, String passwordConfirm, String accountName){
        usuario = new Usuario();
        this.gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
        this.info = info;
        this.email = email;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
        this.accountName = accountName;
    }

    public boolean iniciarRegistro(){
        boolean iniciar = false;

        if(comprobarCampos()){
            try {
                String passEncriptada = encriptar(password);
                ConexionServidor.abrirSocket();
                ConexionServidor.getSalida().writeInt(protocolo.REGISTRARSE);
                Date fecha_alta = Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());
                usuario = new Usuario(0,accountName,passEncriptada,email,0,fecha_alta);
                ConexionServidor.getSalida().writeUTF(gson.toJson(usuario));
                int estado = ConexionServidor.getEntrada().readInt();
                if(estado==protocolo.CORREO_ERROR){
                    info.setText(R.string.email_register);
                }
                else if(estado==protocolo.NOMBRE_CUENTA_ERROR){
                    info.setText(R.string.accountName_register);
                }
                else if(estado == protocolo.REGISTRARSE_EXITOSO)
                    iniciar = true;
                else if(estado==protocolo.REGISTRARSE_FALLIDO){
                    info.setText(R.string.register_error);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NullPointerException npe) {
                npe.printStackTrace();
            }
        }

        return iniciar;
    }

    public boolean comprobarCampos(){
        boolean comprobacion = false;
        if(accountName.isEmpty()){
            info.setText(R.string.accountName_empty);
        }
        else if(accountName.length()<3){
            info.setText(R.string.accountName_short);
        }
        else if(password.length()<6){
            info.setText(R.string.password_short);
        }
        else if(!password.equals(passwordConfirm)){
            info.setText(R.string.password_match);
        }
        else if(!comprobarCorreo(email)){
            info.setText(R.string.error_email);
        }
        else
            comprobacion = true;

        return comprobacion;
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
