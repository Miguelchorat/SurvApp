package modelo;

import java.io.Serializable;

/**
 *
 * @author chorat
 */
public class Tema implements Serializable{
    
    private int id;
    private String nombre;
    private String descripcion;

    public Tema() {
    }        
    
    public Tema(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public Tema(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
