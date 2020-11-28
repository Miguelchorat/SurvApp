package com.example.survapp.models;

import com.example.survapp.util.EstadoIncidencia;

import java.io.Serializable;
import java.util.Date;

public class Denuncia implements Serializable {

    private int id;
    private String titulo;
    private String descripcion;
    private EstadoIncidencia estado;
    private Date fecha_creacion;
    private Usuario usuario;
    private Idea idea;
    private Usuario administrador;

    public Denuncia(){}

    public Denuncia(int id, String titulo, String descripcion, EstadoIncidencia estado, Date fecha_creacion, Usuario usuario, Idea idea, Usuario administrador) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fecha_creacion = fecha_creacion;
        this.usuario = usuario;
        this.idea = idea;
        this.administrador = administrador;
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

    public EstadoIncidencia getEstado() {
        return estado;
    }

    public void setEstado(EstadoIncidencia estado) {
        this.estado = estado;
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

    public Idea getIdea() {
        return idea;
    }

    public void setIdea(Idea idea) {
        this.idea = idea;
    }

    public Usuario getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Usuario administrador) {
        this.administrador = administrador;
    }
}

