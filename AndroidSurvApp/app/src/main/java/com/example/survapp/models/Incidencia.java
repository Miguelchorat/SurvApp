package com.example.survapp.models;

import com.example.survapp.util.EstadoIncidencia;

import java.io.Serializable;
import java.util.Date;

public class Incidencia implements Serializable {

    private int id;
    private Usuario nombreUsuario;
    private Usuario nombreAdministrador;
    private String titulo;
    private String descripcion;
    private Date fecha;
    private EstadoIncidencia estado;

    public Incidencia() {
    }

    public Incidencia(int id, Usuario nombreUsuario, Usuario nombreAdministrador, String titulo, String descripcion, Date fecha, EstadoIncidencia estado) {
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

    public Usuario getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(Usuario nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Usuario getNombreAdministrador() {
        return nombreAdministrador;
    }

    public void setNombreAdministrador(Usuario nombreAdministrador) {
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
