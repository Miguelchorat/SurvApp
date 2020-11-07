package dao;

import java.util.List;
import modelo.Idea;

/**
 *
 * @author chorat
 */
public interface IdeaDAO {
    
    public List<Idea> listarIdea(int numero,String filtro);
    public Idea informacionIdea(int id);
    public boolean eliminarIdea(int id);
}
