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
    
    private String ip;   //IP usada por el servidor
    private int puerto;  //Puerto usado por el servidor
    
    /**
     * Empty constructor

     */
    public ConfiguracionServidor(){
        this.importarDatos();
    }
    
    /**
     * Responsable de rescatar los datos iniciales del servidor.
     * 
     */
    public void importarDatos(){
        
        Properties importar = new Properties();
        
        try{
            importar.load(new FileInputStream("servidor.props"));
            this.puerto = Integer.parseInt(importar.getProperty("puerto_servidor"));
            this.ip = importar.getProperty("ip_servidor");            
        } catch(FileNotFoundException fnfe){
            System.out.println("Archivo no encontrado en la configuración inicial del servidor");
        } catch(IOException ioe){
            System.out.println("Problemas en la entrada/salida de la configuración inicial del servidor");
        } 
    }

    /**
     * Retorna la ip del servidor
     * @return IP del servidor
     */
    public String getIp() {
        return ip;
    }
    
    /**
     * Retorna el puerto del servidor
     * @return El puerto del servidor
     */
    public int getPuerto() {
        return puerto;
    }
    
}
