/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    public boolean altaUsuario(Usuario usuario);
}
