package main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Busqueda;
import modelo.Comentario;
import modelo.Denuncia;
import modelo.EstadoAdmin;
import modelo.Idea;
import modelo.Incidencia;
import modelo.Respuesta;
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
    private Integer mensajeCliente;
    private Controlador controlador;
    private Gson gson;
    private Usuario usuario;
    
    public HiloPrincipal(Socket socket){
        try {
            this.salida = new DataOutputStream(socket.getOutputStream());
            this.entrada = new DataInputStream(socket.getInputStream());
            this.mensajeCliente= SIN_SESION;
            this.controlador = new Controlador();
            this.gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
            System.out.println("creo1");
        } catch (IOException ex) {
            System.out.println("Problema en la entrada/salida del hilo principal del servidor");
        }     
    }

    @Override
    public void run() {
        try {
            mensajeCliente = entrada.readInt();
            System.out.println("Estado hilo : " + mensajeCliente);
            
            if(mensajeCliente==INICIAR_SESION){
                iniciarSesion();
                
                if(mensajeCliente==SESION_INICIADA) {  
                    
                    while(mensajeCliente!=CERRAR_SESION){
                        mensajeCliente = entrada.readInt();
                        System.out.println("Estado hilo : " + mensajeCliente);
                        switch(mensajeCliente){
                            case CERRAR_SESION:
                                cerrarSesion();
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
                            case COMPROBAR_NOMBRE_CUENTA:
                                comprobarNombreCuenta();
                                break;
                            case COMPROBAR_CORREO:
                                comprobarCorreo();
                                break;               
                            case LISTAR_INCIDENCIAS:
                                listarIncidencias();
                                break;
                            case ELIMINAR_INCIDENCIA:
                                eliminarIncidencia();
                                break;
                            case CAMBIAR_ESTADO_INCIDENCIA:
                                cambiarEstadoIncidencia();
                                break;
                            case LISTAR_IDEAS:
                                listarIdeas();
                                break;
                            case LISTAR_DENUNCIAS:
                                listarDenuncias();
                                break;
                            case ELIMINAR_DENUNCIA:
                                eliminarDenuncia();
                                break;
                            case CAMBIAR_ESTADO_DENUNCIA:
                                cambiarEstadoDenuncia();
                                break;
                            case ELIMINAR_IDEA:
                                eliminarIdea();
                                break;
                            case BUSCAR_INFORMACION_IDEA:
                                buscarIdea();
                                break;
                            case CONTAR_RESPUESTAS:
                                contarRespuestas();
                                break;
                            case MODIFICAR_IDEA:
                                modificarIdea();
                                break;
                            case LISTAR_COMENTARIOS:
                                listarComentario();
                                break;
                            case ELIMINAR_COMENTARIO:
                                eliminarComentario();
                                break;
                            case ALTA_INCIDENCIA:
                                altaIncidencia();
                                break;
                            case AÑADIR_SEGUIDOR:
                                añadirSeguidor();
                                break;
                            case LISTAR_SEGUIDOS:
                                listarSeguidos();
                                break;
                            case ELIMINAR_SEGUIDOR:
                                eliminarSeguidor();
                                break;
                            case ALTA_IDEA:
                                altaIdea();
                                break;
                            case LISTAR_IDEAS_USUARIO:
                                listarIdeasUsuario();
                                break;
                            case LISTAR_COMENTARIO_IDEA:
                                listarComentarioIdea();
                                break;
                            case RECIBIR_IDEA:
                                recibirIdea();
                                break;
                            case RESPONDER_PREGUNTA:
                                responderPregunta();
                                break;
                            case ALTA_COMENTARIO:
                                altaComentario();
                                break;
                            case ALTA_DENUNCIA:
                                altaDenuncia();
                                break;
                            case COMPROBAR_RESPUESTA_USUARIO:
                                comprobarRespuestaUsuario();
                                break;
                        }                       
                    }
                    cerrarSesion();
                }
            }
            else if(mensajeCliente==REGISTRARSE){
                registrarse();
            }
            else if(mensajeCliente==RECUPERAR_CUENTA){
                recuperarCuenta();
            }
            
        } catch (IOException ex) {
            cerrarSesion();
        }
    }
    
    private void iniciarSesion(){
        try {                                                                                        
            Sesion sesion = gson.fromJson((String)entrada.readUTF(), Sesion.class);
            this.usuario = (Usuario) controlador.getUsuario().comprobarUsuario(sesion);
            System.out.println(usuario);
            if(usuario != null ){
                if(!controlador.getUsuario().comprobarSesion(usuario)){
                    mensajeCliente = SESION_INICIADA;
                    controlador.getUsuario().abrirSesion(usuario);
                }else{
                    mensajeCliente = SESION_ERRONEA;
                }               
            }
            else{
                mensajeCliente = INICIAR_SESION_FALLIDO;
            }
            salida.writeInt(mensajeCliente);
            if(usuario != null ){
                salida.writeUTF(gson.toJson(usuario));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private void cerrarSesion(){
        controlador.getUsuario().cerrarSesion(usuario); 
    }
    
    private void registrarse(){
        try {
            Usuario user = gson.fromJson((String)entrada.readUTF(), Usuario.class);
            if(controlador.getUsuario().comprobarCorreoUsuario(user.getCorreo())){
                mensajeCliente = CORREO_ERROR;
            }
            else if(controlador.getUsuario().comprobarNombreUsuario(user.getNombre())){
                mensajeCliente = NOMBRE_CUENTA_ERROR;
            }
            else if(controlador.getUsuario().altaUsuario(user)){
              
                mensajeCliente = REGISTRARSE_EXITOSO;
            }
            else{
                mensajeCliente = REGISTRARSE_FALLIDO;
            }
            salida.writeInt(mensajeCliente);
        } catch (IOException ex) {
           ex.printStackTrace(); 
        }
    }
    
    private void comprobarCorreo(){
        try {
            String correo = gson.fromJson((String)entrada.readUTF(), String.class);
            if(controlador.getUsuario().comprobarCorreoUsuario(correo)){
                mensajeCliente = CORREO_ERROR;
            }
            salida.writeInt(mensajeCliente);
        } catch (IOException ex) {
           ex.printStackTrace(); 
        }
    }
    
    private void comprobarNombreCuenta(){
        try {
            String nombre = gson.fromJson((String)entrada.readUTF(), String.class);
            if(controlador.getUsuario().comprobarNombreUsuario(nombre)){
                mensajeCliente = NOMBRE_CUENTA_ERROR;
            }
            salida.writeInt(mensajeCliente);
        } catch (IOException ex) {
           ex.printStackTrace(); 
        }
    }
    
    private void recuperarCuenta(){
        try {
            Sesion sesion = gson.fromJson((String)entrada.readUTF(), Sesion.class);
            if(controlador.getUsuario().comprobarDatosUsuario(sesion)){
                mensajeCliente = RECUPERAR_CUENTA_EXITOSO;
                JavaMail mail = new JavaMail();
                mail.enviarPass(sesion.getCorreo());
                controlador.getUsuario().actualizarPass(sesion.getCorreo(), mail.getPass());
            }
            else{
                mensajeCliente = RECUPERAR_CUENTA_FALLIDO;
            }
            salida.writeInt(mensajeCliente);
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
                mensajeCliente = CUENTA_CAMBIAR_NOMBRE_EXISTE;
            }else{
                controlador.getUsuario().cambiarNombre(user.getNombre(), user.getCorreo());
                mensajeCliente = CUENTA_CAMBIAR_NOMBRE_EXITO;
            }
            salida.writeInt(mensajeCliente);
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cambiarPass(){
        try {
            Sesion sesion = gson.fromJson((String)entrada.readUTF(), Sesion.class);
            if(controlador.getUsuario().comprobarCorreoUsuario(sesion.getCorreo())){
                mensajeCliente = CUENTA_CAMBIAR_PASSWORD_EXITO;
                controlador.getUsuario().actualizarPass(sesion.getCorreo(), sesion.getPass());
            }
            else{
                mensajeCliente = CUENTA_CAMBIAR_PASSWORD_FALLIDO;
            }
            salida.writeInt(mensajeCliente);
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
                mensajeCliente = COMPROBAR_SESION_FALLIDO;
            }else{
                mensajeCliente = COMPROBAR_SESION_EXITO;
            }
            salida.writeInt(mensajeCliente);
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void modificarUsuario() {
        try {
            Usuario user = gson.fromJson((String)entrada.readUTF(), Usuario.class);
            controlador.getUsuario().modificarUsuario(user);
            mensajeCliente = MODIFICAR_USUARIO_EXITO;
            salida.writeInt(mensajeCliente);
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
                mensajeCliente=ELIMINAR_INCIDENCIA_EXITOSA;
            salida.writeInt(mensajeCliente);
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cambiarEstadoIncidencia(){
        try {
            EstadoAdmin estadoAdmin = gson.fromJson((String)entrada.readUTF(), EstadoAdmin.class);
            boolean resultado = controlador.getIncidencia().cambiarEstado(estadoAdmin.getId(),estadoAdmin.getEstado().name(),estadoAdmin.getAdmin());            
            if(resultado)
                mensajeCliente=CAMBIAR_ESTADO_INCIDENCIA_EXITOSA;
            salida.writeInt(mensajeCliente);
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void listarIdeas(){
        try {
            Busqueda busqueda = gson.fromJson((String)entrada.readUTF(), Busqueda.class);
            List<Idea> listaIdeas;
            listaIdeas = controlador.getIdea().listarIdea(busqueda.getNumero(),busqueda.getFiltro());
            salida.writeUTF(gson.toJson(listaIdeas));            
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void listarDenuncias(){
        try {
            Busqueda busqueda = gson.fromJson((String)entrada.readUTF(), Busqueda.class);
            List<Denuncia> listaDenuncias;
            listaDenuncias = controlador.getDenuncia().listarDenuncia(busqueda.getNumero(),busqueda.getFiltro());
            salida.writeUTF(gson.toJson(listaDenuncias));            
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarDenuncia(){
        try {
            int id = entrada.readInt();
            boolean resultado = controlador.getDenuncia().eliminarDenuncia(id);            
            if(resultado)
                mensajeCliente=ELIMINAR_DENUNCIA_EXITOSA;
            salida.writeInt(mensajeCliente);
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cambiarEstadoDenuncia(){
        try {
            EstadoAdmin estadoAdmin = gson.fromJson((String)entrada.readUTF(), EstadoAdmin.class);
            boolean resultado = controlador.getDenuncia().cambiarEstado(estadoAdmin.getId(),estadoAdmin.getEstado().name(),estadoAdmin.getAdmin());            
            if(resultado)
                mensajeCliente=CAMBIAR_ESTADO_DENUNCIA_EXITOSA;
            salida.writeInt(mensajeCliente);
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarIdea(){
        try {
            int id = entrada.readInt();
            boolean resultado = controlador.getIdea().eliminarIdea(id);            
            if(resultado)
                mensajeCliente=ELIMINAR_IDEA_EXITOSA;
            salida.writeInt(mensajeCliente);
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void buscarIdea(){
        try {
            int id = entrada.readInt();
            Idea idea;
            idea = controlador.getIdea().informacionIdea(id);
            salida.writeUTF(gson.toJson(idea));    
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void contarRespuestas(){
        try {
            List<Integer> cuenta = new ArrayList<>();
            Idea idea = gson.fromJson((String)entrada.readUTF(), Idea.class);
            cuenta = controlador.getIdea().contarRespuestas(idea.getRespuestas());
            salida.writeUTF(gson.toJson(cuenta));    
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarIdea(){
        try {
            Idea idea = gson.fromJson((String)entrada.readUTF(), Idea.class);            
            controlador.getIdea().modificarIdea(idea);
            mensajeCliente = MODIFICAR_IDEA_EXITOSA;
            salida.writeInt(mensajeCliente);
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void listarComentario(){
        try {
            Busqueda busqueda = gson.fromJson((String)entrada.readUTF(), Busqueda.class);
            List<Comentario> listaComentario;
            listaComentario = controlador.getComentario().listarComentario(busqueda.getNumero(),Integer.parseInt(busqueda.getFiltro()));
            salida.writeUTF(gson.toJson(listaComentario));            
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarComentario(){
        try {
            int id = entrada.readInt();
            boolean resultado = controlador.getComentario().eliminarComentario(id);            
            if(resultado)
                mensajeCliente=ELIMINAR_COMENTARIO_EXITOSO;
            salida.writeInt(mensajeCliente);
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void altaIncidencia() {
        try {
            Incidencia incidencia = gson.fromJson((String)entrada.readUTF(), Incidencia.class);
            controlador.getIncidencia().altaIncidencia(incidencia);            
        } catch (IOException ex) {
           ex.printStackTrace(); 
        }
    }

    private void añadirSeguidor() {
        try {
            Usuario user = gson.fromJson((String)entrada.readUTF(), Usuario.class);
            Usuario seguidor = gson.fromJson((String)entrada.readUTF(), Usuario.class);
            seguidor = controlador.getUsuario().encontrarUsuario(seguidor);
            
            if(seguidor != null){
                if(controlador.getUsuario().añadirSeguidor(user,seguidor))
                    mensajeCliente = AÑADIR_SEGUIDOR;
                else
                    mensajeCliente = AÑADIR_SEGUIDOR_FALLIDO;
            }
            else{
                mensajeCliente = AÑADIR_SEGUIDOR_NO_EXISTE;
            }
            salida.writeInt(mensajeCliente);
        } catch (IOException ex) {
           ex.printStackTrace(); 
        }
    }
    
    private void eliminarSeguidor() {
        try {
            Usuario user = gson.fromJson((String)entrada.readUTF(), Usuario.class);
            Usuario seguidor = gson.fromJson((String)entrada.readUTF(), Usuario.class);
            seguidor = controlador.getUsuario().encontrarUsuario(seguidor);
           
            if(controlador.getUsuario().eliminarSeguidor(user,seguidor))
                mensajeCliente = ELIMINAR_SEGUIDOR;
            else
                mensajeCliente = ELIMINAR_SEGUIDOR_FALLIDO;
            
            salida.writeInt(mensajeCliente);
        } catch (IOException ex) {
           ex.printStackTrace(); 
        }
    }
    
    private void listarSeguidos() {
        try {
            Usuario user = gson.fromJson((String)entrada.readUTF(), Usuario.class);
            List<Usuario> listaUsuarios;
            listaUsuarios = controlador.getUsuario().listarSeguidos(user);
            salida.writeUTF(gson.toJson(listaUsuarios));            
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void altaIdea() {
        try {
            Idea idea = gson.fromJson((String)entrada.readUTF(), Idea.class);
            controlador.getIdea().altaIdea(idea);            
        } catch (IOException ex) {
           ex.printStackTrace(); 
        }
    }

    private void listarIdeasUsuario() {
        try {
            Usuario user = gson.fromJson((String)entrada.readUTF(), Usuario.class);
            List<Idea> listaIdeas;
            listaIdeas = controlador.getIdea().listarIdeaUsuario(user);
            salida.writeUTF(gson.toJson(listaIdeas));            
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void listarComentarioIdea() {
        try {
            Idea idea = gson.fromJson((String)entrada.readUTF(), Idea.class);
            List<Comentario> listaComentario;
            listaComentario = controlador.getComentario().listarComentario(idea.getId());
            salida.writeUTF(gson.toJson(listaComentario));            
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void recibirIdea() {
        try {
            Usuario user = gson.fromJson((String)entrada.readUTF(), Usuario.class);
            Idea idea = controlador.getIdea().recibirIdea(user);                 
            salida.writeUTF(gson.toJson(idea));  
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void responderPregunta(){
        try {
            Usuario user = gson.fromJson((String)entrada.readUTF(), Usuario.class);
            Respuesta respuesta = gson.fromJson((String)entrada.readUTF(), Respuesta.class);
            controlador.getIdea().responderIdea(user.getId(),respuesta.getId());
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void altaComentario() {
        try {
            Comentario comentario = gson.fromJson((String)entrada.readUTF(), Comentario.class);          
            Idea idea = gson.fromJson((String)entrada.readUTF(), Idea.class);
            controlador.getComentario().altaComentario(comentario,idea);
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void altaDenuncia() {
        try {
            Denuncia denuncia = gson.fromJson((String)entrada.readUTF(), Denuncia.class);    
            controlador.getIdea().altaDenuncia(denuncia);
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void comprobarRespuestaUsuario() {
         try {
            Usuario user = gson.fromJson((String)entrada.readUTF(), Usuario.class);          
            Idea idea = gson.fromJson((String)entrada.readUTF(), Idea.class);
            boolean resultado = controlador.getIdea().comprobarRespuestaUsuario(idea,user);
            
            if(resultado){              
                mensajeCliente = COMPROBAR_RESPUESTA_USUARIO_FALLIDO;               
            }
            else{
                mensajeCliente = COMPROBAR_RESPUESTA_USUARIO;
            }
            salida.writeInt(mensajeCliente);
        } catch (IOException ex) {
            Logger.getLogger(HiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
