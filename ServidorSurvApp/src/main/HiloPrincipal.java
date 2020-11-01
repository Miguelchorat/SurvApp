package main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Busqueda;
import modelo.EstadoAdmin;
import modelo.Incidencia;
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
                case LISTAR_USUARIOS:
                    listarUsuarios();
                    break;
                case COMPROBAR_SESION:
                    comprobarSesion();
                    break;
                case MODIFICAR_USUARIO:
                    modificarUsuario();
                    break;
            }
        } catch (IOException ex) {
            System.out.println("Error en la E/S del hilo");
        }
    }
    
    private void iniciarSesion(){
        try {                                                                                        
            Sesion sesion = gson.fromJson((String)entrada.readUTF(), Sesion.class);
            System.out.println(sesion.getCorreo() + " " + sesion.getPass());
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
            System.out.println("llego");
            Sesion sesion = gson.fromJson((String)entrada.readUTF(), Sesion.class);
            if(controlador.getUsuario().comprobarDatosUsuario(sesion)){
                estadoHilo = RECUPERAR_CUENTA_EXITOSO;
                JavaMail mail = new JavaMail();
                mail.enviarPass(sesion.getCorreo());
                controlador.getUsuario().actualizarPass(sesion.getCorreo(), mail.getPass());
            }
            else{
                System.out.println("fallo");
                estadoHilo = RECUPERAR_CUENTA_FALLIDO;
            }
            salida.writeInt(estadoHilo);
            System.out.println("envio");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void cambiarAvatar(){
        try {
            Usuario user = gson.fromJson((String)entrada.readUTF(), Usuario.class);
            controlador.getUsuario().cambiarAvatar(user.getAvatar(), user.getCorreo());
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cambiarNombre(){
        try {
            Usuario user = gson.fromJson((String)entrada.readUTF(), Usuario.class);
            if(controlador.getUsuario().comprobarNombreUsuario(user.getNombre())){
                estadoHilo = CUENTA_CAMBIAR_NOMBRE_EXISTE;
            }else{
                controlador.getUsuario().cambiarNombre(user.getNombre(), user.getCorreo());
                estadoHilo = CUENTA_CAMBIAR_NOMBRE_EXITO;
            }
            salida.writeInt(estadoHilo);
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cambiarPass(){
        try {
            Sesion sesion = gson.fromJson((String)entrada.readUTF(), Sesion.class);
            if(controlador.getUsuario().comprobarCorreoUsuario(sesion.getCorreo())){
                estadoHilo = CUENTA_CAMBIAR_PASSWORD_EXITO;
                controlador.getUsuario().actualizarPass(sesion.getCorreo(), sesion.getPass());
            }
            else{
                estadoHilo = CUENTA_CAMBIAR_PASSWORD_FALLIDO;
            }
            salida.writeInt(estadoHilo);
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void listarUsuarios(){
        try {
            Busqueda busqueda = gson.fromJson((String)entrada.readUTF(), Busqueda.class);
            List<Usuario> listaUsuarios;
            listaUsuarios = controlador.getUsuario().listarUsuarios(busqueda.getNumero(),busqueda.getFiltro());
            salida.writeUTF(gson.toJson(listaUsuarios));            
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void comprobarSesion() {
        try {
            Usuario user = gson.fromJson((String)entrada.readUTF(), Usuario.class);
            if(controlador.getUsuario().comprobarSesion(user)){
                estadoHilo = COMPROBAR_SESION_FALLIDO;
            }else{
                estadoHilo = COMPROBAR_SESION_EXITO;
            }
            salida.writeInt(estadoHilo);
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void modificarUsuario() {
        try {
            Usuario user = gson.fromJson((String)entrada.readUTF(), Usuario.class);
            controlador.getUsuario().modificarUsuario(user);
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void listarIncidencias(){
        try {
            Busqueda busqueda = gson.fromJson((String)entrada.readUTF(), Busqueda.class);
            List<Incidencia> listaIncidencias;
            listaIncidencias = controlador.getIncidencia().listarIncidencias(busqueda.getNumero(),busqueda.getFiltro());
            salida.writeUTF(gson.toJson(listaIncidencias));            
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarIncidencia(){
        try {
            int id = entrada.readInt();
            boolean resultado = controlador.getIncidencia().eliminarIncidencia(id);            
            if(resultado)
                estadoHilo=ELIMINAR_INCIDENCIA_EXITOSA;
            salida.writeInt(estadoHilo);
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cambiarEstado(){
        try {
            EstadoAdmin estadoAdmin = gson.fromJson((String)entrada.readUTF(), EstadoAdmin.class);
            boolean resultado = controlador.getIncidencia().cambiarEstado(estadoAdmin.getId(),estadoAdmin.getEstado().name(),estadoAdmin.getAdmin());            
            if(resultado)
                estadoHilo=CAMBIAR_ESTADO_EXITOSA;
            salida.writeInt(estadoHilo);
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
