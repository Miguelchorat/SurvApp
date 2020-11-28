package modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author chorat
 */
public class Comentario implements Serializable{
    
    private int id;
    private String descripcion;
    private Date fecha_creacion;
    private Usuario usuario;

    public Comentario() {
    }

    public Comentario(int id, String descripcion, Date fecha_creacion, Usuario usuario) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha_creacion = fecha_creacion;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
