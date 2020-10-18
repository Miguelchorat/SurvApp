package main;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import util.ConfiguracionServidor;

/**
 *
 * @author chorat
 */
public class Servidor {
    
    private ServerSocket servidor;
    private ExecutorService servicios;
    
    public Servidor(){
        ConfiguracionServidor serverConf = new ConfiguracionServidor();
        this.servicios = Executors.newCachedThreadPool();
        
        try{            
            this.servidor = new ServerSocket(serverConf.getPuerto());  
        } catch(IOException ioe){
            System.out.println("Error en la entrada/salida del servidor");
            System.exit(1);
        }
    }
    
    private void listen(){     
        Socket cliente = null;
        while(true){      
            try {
                cliente = this.servidor.accept();
                
                //QUEDA POR EMPEZAR EL HILO PRINCIPAL
                
            } catch (IOException ex) {
                System.out.println("Fallo con la conexión del cliente");
            }
            
        }
    }
    
    public static void main(String[] args) {
        new Servidor().listen();
    }
    
}
