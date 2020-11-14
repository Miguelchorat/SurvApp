package dao;

import java.util.List;
import modelo.Comentario;

/**
 *
 * @author chorat
 */
public interface ComentarioDAO {
    
    public List<Comentario> listarComentario(int id,int numero);
    public boolean eliminarComentario(int id);
}
