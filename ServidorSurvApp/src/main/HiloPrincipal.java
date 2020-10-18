package main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import util.Protocol;

/**
 *
 * @author chorat
 */
public class HiloPrincipal extends Thread implements Protocol{
    
    private DataOutputStream salida;
    private DataInputStream entrada;
    private Integer estadoHilo;

    public HiloPrincipal(Socket socket){
        try {
            this.salida = new DataOutputStream(socket.getOutputStream());
            this.entrada = new DataInputStream(socket.getInputStream());
            this.estadoHilo= SIN_SESION;
        } catch (IOException ex) {
            System.out.println("Problema en la entrada/salida del hilo principal del servidor");
        }     
    }

    @Override
    public void run() {
        super.run();
    }
    
    
}
