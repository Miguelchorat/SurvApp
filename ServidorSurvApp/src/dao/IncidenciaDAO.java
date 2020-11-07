package dao;

import java.util.List;
import modelo.Incidencia;

/**
 *
 * @author chorat
 */
public interface IncidenciaDAO {
    
    public List<Incidencia> listarIncidencias(int numero,String filtro);
    public boolean eliminarIncidencia(int id);
    public boolean cambiarEstado(int id,String estado, int admin);
}
