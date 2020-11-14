package main;

import dao.ComentarioDAOSQL;
import dao.DenunciaDAOSQL;
import dao.IdeaDAOSQL;
import dao.IncidenciaDAOSQL;
import dao.UsuarioDAOSQL;

/**
 *
 * @author chorat
 */
public class Controlador {
    
    private UsuarioDAOSQL usuario;
    private IncidenciaDAOSQL incidencia;
    private IdeaDAOSQL idea;
    private DenunciaDAOSQL denuncia;
    private ComentarioDAOSQL comentario;
    
    public Controlador(){
        this.usuario = new UsuarioDAOSQL();
        this.incidencia = new IncidenciaDAOSQL();
        this.idea = new IdeaDAOSQL();
        this.denuncia = new DenunciaDAOSQL();
        this.comentario = new ComentarioDAOSQL();
    }

    public UsuarioDAOSQL getUsuario() {
        return usuario;
    }    

    public IncidenciaDAOSQL getIncidencia() {
        return incidencia;
    }

    public IdeaDAOSQL getIdea() {
        return idea;
    }

    public DenunciaDAOSQL getDenuncia() {
        return denuncia;
    }

    public ComentarioDAOSQL getComentario() {
        return comentario;
    }      
}
