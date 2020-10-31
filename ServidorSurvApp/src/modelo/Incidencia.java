package modelo;

import java.io.Serializable;
import java.util.Date;
import util.EstadoIncidencia;

/**
 *
 * @author chorat
 */
public class Incidencia implements Serializable{
    
    private int id;
    private String nombreUsuario;
    private String nombreAdministrador;
    private String titulo;
    private String descripcion;
    private Date fecha;
    private EstadoIncidencia estado;

    public Incidencia() {
    }

    public Incidencia(int id, String nombreUsuario, String nombreAdministrador, String titulo, String descripcion, Date fecha, EstadoIncidencia estado) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.nombreAdministrador = nombreAdministrador;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreAdministrador() {
        return nombreAdministrador;
    }

    public void setNombreAdministrador(String nombreAdministrador) {
        this.nombreAdministrador = nombreAdministrador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public EstadoIncidencia getEstado() {
        return estado;
    }

    public void setEstado(EstadoIncidencia estado) {
        this.estado = estado;
    }
    
    
}
