package com.example.survapp.util;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfServidor {

    private String ip;   //IP que usara el servidor
    private String puerto;  //Puerto que usara el servidor
    private Context context;

    public ConfServidor(Context context){
        this.context = context;
        this.importarDatos();
    }

    /**
     * Se encarga de cargar los datos de un archivo de configuración
     * necesarios para el servidor.
     */
    public void importarDatos(){

        Properties importar = new Properties();

        try{
            AssetManager assetManager = context.getAssets();
            InputStream inputStream = assetManager.open("servidor.props");
            importar.load(inputStream);
            this.puerto = importar.getProperty("puerto_servidor");
            this.ip = importar.getProperty("ip_servidor");
        } catch(FileNotFoundException fnfe){
            System.out.println("Archivo no encontrado.");
        } catch(IOException ioe){
            System.out.println("Problema en la ENTRADA/SALIDA");
        }
    }

    /**
     * Devuelve la ip del servidor.
     * @return IP del servidor
     */
    public String getIp() {
        return ip;
    }

    /**
     * Devuelve el puerto del servidor.
     * @return Puerto del servidor
     */
    public String getPuerto() {
        return puerto;
    }

}
