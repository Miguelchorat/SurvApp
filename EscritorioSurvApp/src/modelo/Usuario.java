package modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author chorat
 */
public class Usuario implements Serializable{
    
    private int id;
    private int avatar;
    private String nombre;
    private String pass;
    private String correo;
    private int administrar;
    private Date fecha_alta;

    public Usuario(){
        this.avatar = 0;
        this.nombre = "";
        this.pass = "";
        this.correo = "";
        this.administrar = 0;
        this.fecha_alta = new Date();
    }
    
    public Usuario(String nombre) {
        this.nombre = nombre;
    }
    
    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public Usuario(int avatar, String nombre, String pass, String correo, int administrar, Date fecha_alta) {
        this.id = id;
        this.avatar = avatar;
        this.nombre = nombre;
        this.pass = pass;
        this.correo = correo;
        this.administrar = administrar;
        this.fecha_alta = fecha_alta;
    }
    
    public Usuario(int id,int avatar, String nombre, String pass, String correo, int administrar, Date fecha_alta) {
        this.id = id;
        this.avatar = avatar;
        this.nombre = nombre;
        this.pass = pass;
        this.correo = correo;
        this.administrar = administrar;
        this.fecha_alta = fecha_alta;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int isAdministrar() {
        return administrar;
    }

    public void setAdministrar(int administrar) {
        this.administrar = administrar;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
