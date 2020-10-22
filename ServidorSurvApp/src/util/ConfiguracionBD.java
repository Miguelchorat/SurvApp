/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author chorat
 */
public class ConfiguracionBD {
    
    private String url;
    private String puerto;
    private String host;
    private String nombreBD;
    private String usuario;
    private String pass;
    private Connection conexion;
    
    public ConfiguracionBD(){
        this.importar();
    }
    
    public void importar() {

        Properties importar = new Properties();
        try {
            importar.load(new FileInputStream("bbdd.props"));
            this.puerto = importar.getProperty("puerto");
            this.host = importar.getProperty("host");
            this.nombreBD = importar.getProperty("nombre");
            this.usuario = importar.getProperty("usuario");
            this.pass = importar.getProperty("pass");
            this.url = "jdbc:mariadb://" + this.host + ":" + this.puerto + "/" + this.nombreBD;
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
    public Connection iniciarConexion() {

        try {
            this.conexion = DriverManager.getConnection(this.url, this.usuario, this.pass);
        } catch (SQLException e) {
            System.out.println("Error al conectar con el servidor.");
        }

        return this.conexion;
    }
    
    public void cerrarConexion() {
        try {
            this.conexion.close();
        } catch (SQLException e) {
            System.out.println("No se puede cerrar la conexión a la base de datos.");
        }
    }
    
    public String getPuerto() {
        return puerto;
    }

    public String getHost() {
        return host;
    }

    public String getNombreBD() {
        return nombreBD;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPass() {
        return pass;
    }

    public Connection getConexion() {
        return conexion;
    }    
}
