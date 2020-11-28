package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author chorat
 */
public class Idea implements Serializable{
    
    private int id;
    private String titulo;
    private String descripcion;
    private Date fecha_creacion;
    private Tema tema;
    private Usuario usuario;
    private List<Respuesta> respuestas;
    private List<Comentario> comentarios;

    public Idea() {
    }
    
    public Idea(int id) {
        this.id = id;
    }
    
    public Idea(int id, String titulo, String descripcion, Tema tema) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tema = tema;
    }
    
    public Idea(int id, String titulo, String descripcion, Date fecha_creacion, Tema tema, Usuario usuario) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha_creacion = fecha_creacion;
        this.tema = tema;
        this.usuario = usuario;
    }
    
    public Idea(int id, String titulo, String descripcion, Date fecha_creacion, Tema tema, Usuario usuario, List<Respuesta> respuestas, List<Comentario> comentarios) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha_creacion = fecha_creacion;
        this.tema = tema;
        this.usuario = usuario;
        this.respuestas = respuestas;
        this.comentarios = comentarios;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Respuesta> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
}
