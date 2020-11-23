package dao;

import java.util.List;
import modelo.Sesion;
import modelo.Usuario;

/**
 *
 * @author chorat
 */
public interface UsuarioDAO {
    
    public boolean comprobarDatosUsuario(Sesion sesion);
    public boolean comprobarCorreoUsuario(String correo);
    public boolean comprobarNombreUsuario(String nombre);
    public Usuario comprobarUsuario(Sesion sesion);
    public Usuario encontrarUsuario(Usuario usuario);
    public boolean abrirSesion(Usuario usuario);
    public boolean cerrarSesion(Usuario usuario);
    public boolean comprobarSesion(Usuario usuario);
    public boolean altaUsuario(Usuario usuario);
    public boolean actualizarPass(String correo,String pass);
    public boolean cambiarAvatar(int avatarNuevo,String correo);
    public boolean cambiarNombre(String nombre,String correo);
    public List<Usuario> listarUsuarios(int numero,String filtro);
    public boolean modificarUsuario(Usuario usuario);
    public boolean añadirSeguidor(Usuario usuario,Usuario seguidor);
    public boolean eliminarSeguidor(Usuario usuario,Usuario seguidor);
    public List<Usuario> listarSeguidos(Usuario usuario);
}
