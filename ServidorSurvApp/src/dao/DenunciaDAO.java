package dao;

import java.util.List;
import modelo.Denuncia;

/**
 *
 * @author chorat
 */
public interface DenunciaDAO {
    
    public List<Denuncia> listarDenuncia(int numero,String filtro);
    public boolean eliminarDenuncia(int id);
    public boolean cambiarEstado(int id,String estado, int admin);
    
}
