package com.example.survapp.models;

import android.util.Patterns;
import android.widget.TextView;

import com.example.survapp.R;
import com.example.survapp.util.ConexionServidor;
import com.example.survapp.util.Protocolo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

public class Recuperar {

    private TextView info;
    private String email;
    private String accountName;
    private Protocolo protocolo;
    private Gson gson;

    public Recuperar(TextView info, String email, String accountName){
        this.info = info;
        this.email = email;
        this.gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
        this.accountName = accountName;
    }

    public boolean iniciarRecuperacion(){
        boolean iniciar = false;

        if(comprobarCampos()){
            try {
                ConexionServidor.abrirSocket();
                ConexionServidor.getSalida().writeInt(protocolo.RECUPERAR_CUENTA);
                Sesion sesion = new Sesion(email,accountName);
                ConexionServidor.getSalida().writeUTF(gson.toJson(sesion));
                int estado = ConexionServidor.getEntrada().readInt();
                if(estado==protocolo.RECUPERAR_CUENTA_EXITOSO){
                    iniciar = true;
                }
                else if(estado==protocolo.RECUPERAR_CUENTA_FALLIDO){
                    info.setText(R.string.error_login);
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
}
