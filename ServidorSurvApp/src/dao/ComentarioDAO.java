package dao;

import java.util.List;
import modelo.Comentario;
import modelo.Idea;
import modelo.Usuario;

/**
 *
 * @author chorat
 */
public interface ComentarioDAO {
    
    public List<Comentario> listarComentario(int id,int numero);
    public List<Comentario> listarComentario(int id);
    public boolean eliminarComentario(int id);
    public boolean altaComentario(Comentario comentario,Idea idea);
}
