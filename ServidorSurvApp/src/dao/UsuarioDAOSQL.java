/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import modelo.Sesion;
import modelo.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ConfiguracionServidor;

/**
 *
 * @author chorat
 */
public class UsuarioDAOSQL implements UsuarioDAO {
    
    ConfiguracionServidor confBD;
    Connection conexion = null;

    public UsuarioDAOSQL(){
        confBD = new ConfiguracionServidor();
    }

    @Override
    public boolean comprobarDatosUsuario(Sesion sesion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean comprobarCorreoUsuario(String correo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean comprobarNombreUsuario(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario comprobarUsuario(Sesion sesion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean altaUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
