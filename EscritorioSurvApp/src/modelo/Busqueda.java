package modelo;

import java.io.Serializable;

/**
 *
 * @author chorat
 */
public class Busqueda implements Serializable{
    
    private int numero;
    private String filtro;
    private boolean tipo;
    
    public Busqueda(){
    
    }

    public Busqueda(int numero, String filtro) {
        this.numero = numero;
        this.filtro = filtro;
    }

    public Busqueda(int numero, String filtro, boolean tipo) {
        this.numero = numero;
        this.filtro = filtro;
        this.tipo = tipo;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFiltro() {
        return filtro;
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }
}
