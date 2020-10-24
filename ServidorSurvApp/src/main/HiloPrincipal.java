package main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.Socket;
import modelo.Sesion;
import modelo.Usuario;
import util.JavaMail;
import util.Protocolo;

/**
 *
 * @author chorat
 */
public class HiloPrincipal extends Thread implements Protocolo{
    
    private DataOutputStream salida;
    private DataInputStream entrada;
    private Integer estadoHilo;
    private Controlador controlador;
    private Gson gson;
    private Usuario usuario;
    
    public HiloPrincipal(Socket socket){
        try {
            this.salida = new DataOutputStream(socket.getOutputStream());
            this.entrada = new DataInputStream(socket.getInputStream());
            this.estadoHilo= SIN_SESION;
            this.controlador = new Controlador();
            this.gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
        } catch (IOException ex) {
            System.out.println("Problema en la entrada/salida del hilo principal del servidor");
        }     
    }

    @Override
    public void run() {
        try {
            estadoHilo = entrada.readInt();
            System.out.println("Estado hilo : " + estadoHilo);
            
            switch(estadoHilo){
                case INICIAR_SESION:
                    iniciarSesion();
                    break;
                case CERRAR_SESION:
                    cerrarSesion();
                    break;
                case REGISTRARSE:
                    registrarse();
                    break;
                case RECUPERAR_CUENTA:
                    recuperarCuenta();
                    break;
            }
        } catch (IOException ex) {
            System.out.println("Error en la E/S del hilo");
        }
    }
    
    private void iniciarSesion(){
        try {                                                                                        
            Sesion sesion = gson.fromJson((String)entrada.readUTF(), Sesion.class);
            this.usuario = (Usuario) controlador.getUsuario().comprobarUsuario(sesion);
            System.out.println(usuario);
            if(usuario != null ){
                estadoHilo = SESION_INICIADA;
                controlador.getUsuario().abrirSesion(usuario);
            }
            else{
                estadoHilo = SESION_ERRONEA;
            }
            salida.writeInt(estadoHilo);
            if(usuario != null ){
                salida.writeUTF(gson.toJson(usuario));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private void cerrarSesion(){
        try {
            Usuario usuario = gson.fromJson((String)entrada.readUTF(), Usuario.class);
            controlador.getUsuario().cerrarSesion(usuario);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private void registrarse(){
        try {
            Usuario user = gson.fromJson((String)entrada.readUTF(), Usuario.class);
            if(controlador.getUsuario().comprobarCorreoUsuario(user.getCorreo())){
                estadoHilo = REGISTRARSE_CORREO_ERROR;
            }
            else if(controlador.getUsuario().comprobarNombreUsuario(user.getNombre())){
                estadoHilo = REGISTRARSE_NOMBRE_CUENTA_ERROR;
            }
            else if(controlador.getUsuario().altaUsuario(user)){
              
                estadoHilo = REGISTRARSE_EXITOSO;
            }
            else{
                estadoHilo = REGISTRARSE_FALLIDO;
            }
            salida.writeInt(estadoHilo);
        } catch (IOException ex) {
           ex.printStackTrace(); 
        }
    }
    
    private void recuperarCuenta(){
        try {
            Sesion sesion = gson.fromJson((String)entrada.readUTF(), Sesion.class);
            if(controlador.getUsuario().comprobarDatosUsuario(sesion)){
                estadoHilo = RECUPERAR_CUENTA_EXITOSO;
                JavaMail mail = new JavaMail();
                mail.enviarPass(sesion.getCorreo());
                controlador.getUsuario().actualizarPass(sesion.getCorreo(), mail.getPass());
            }
            else{
                estadoHilo = RECUPERAR_CUENTA_FALLIDO;
            }
            salida.writeInt(estadoHilo);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
