package main;

import dao.UsuarioDAOSQL;

/**
 *
 * @author chorat
 */
public class Controlador {
    
    private UsuarioDAOSQL usuario;
    
    
    public Controlador(){
        this.usuario = new UsuarioDAOSQL();
        
    }

    public UsuarioDAOSQL getUsuario() {
        return usuario;
    }    
}
