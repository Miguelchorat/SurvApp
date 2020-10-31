package main;

import dao.IncidenciaDAOSQL;
import dao.UsuarioDAOSQL;

/**
 *
 * @author chorat
 */
public class Controlador {
    
    private UsuarioDAOSQL usuario;
    private IncidenciaDAOSQL incidencia;
    
    public Controlador(){
        this.usuario = new UsuarioDAOSQL();
        this.incidencia = new IncidenciaDAOSQL();
    }

    public UsuarioDAOSQL getUsuario() {
        return usuario;
    }    

    public IncidenciaDAOSQL getIncidencia() {
        return incidencia;
    }
    
    
}
