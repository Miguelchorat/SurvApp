package com.example.survapp.models;

import java.io.Serializable;

public class Sesion implements Serializable {

    private String correo;
    private String pass;

    public Sesion(String correo,String pass){
        this.correo = correo;
        this.pass = pass;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}
