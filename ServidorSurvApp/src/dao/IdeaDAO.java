package dao;

import java.util.List;
import modelo.Idea;
import modelo.Respuesta;
import modelo.Usuario;

/**
 *
 * @author chorat
 */
public interface IdeaDAO {
    
    public List<Idea> listarIdea(int numero,String filtro);
    public List<Idea> listarIdeaUsuario(Usuario usuario);
    public Idea informacionIdea(int id);
    public boolean eliminarIdea(int id);
    public List<Integer> contarRespuestas(List<Respuesta> respuestas);
    public boolean modificarIdea(Idea idea);
    public boolean altaIdea(Idea idea);
}
