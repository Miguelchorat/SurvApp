package util;

import java.io.Serializable;
import util.EstadoIncidencia;

/**
 *
 * @author chorat
 */
public class EstadoAdmin implements Serializable{
    
    private int idAdmin;
    private int id;
    private EstadoIncidencia estado;

    public EstadoAdmin(int idAdmin, int id, EstadoIncidencia estado) {
        this.idAdmin = idAdmin;
        this.id = id;
        this.estado = estado;
    }

    public int getAdmin() {
        return idAdmin;
    }

    public void setAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EstadoIncidencia getEstado() {
        return estado;
    }

    public void setEstado(EstadoIncidencia estado) {
        this.estado = estado;
    }
}
