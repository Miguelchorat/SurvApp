package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Configuración inicial del servidor.
 * 
 * @author chorat
 */
public class ConfiguracionServidor {
    
    private String ip;   //IP que usara el servidor
    private int puerto;  //Puerto que usara el servidor
    
    /**
     * Constructor vacio
     */
    public ConfiguracionServidor(){
        this.importarDatos();
    }
    
    /**
     * Se encarga de cargar los datos de un archivo de configuración
     * necesarios para el servidor.
     */
    public void importarDatos(){
        
        Properties importar = new Properties();
        
        try{
            importar.load(new FileInputStream("servidor.props"));
            this.puerto = Integer.parseInt(importar.getProperty("puerto_servidor"));
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
    public int getPuerto() {
        return puerto;
    }
    
}
