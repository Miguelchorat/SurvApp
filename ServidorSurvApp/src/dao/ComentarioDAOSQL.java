package dao;

import java.util.List;
import modelo.Comentario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import modelo.Usuario;
import util.ConfiguracionBD;
/**
 *
 * @author chorat
 */
public class ComentarioDAOSQL implements ComentarioDAO{
    
    ConfiguracionBD confBD;
    Connection conexion = null;

    public ComentarioDAOSQL() {
        confBD = new ConfiguracionBD();
    }
    
    @Override
    public List<Comentario> listarComentario(int id,int numero) {
        PreparedStatement sentencia = null;
        ResultSet result = null;
        List<Comentario> listaComentarios = new ArrayList<Comentario>();
        
        try {
            conexion = confBD.iniciarConexion();
            sentencia = this.conexion.prepareStatement(
                    "SELECT c.id,c.descripcion,c.fecha_creacion,u.nombre,u.imagen "
                            + "FROM comentario c,usuario u "
                            + "WHERE u.id=c.id_usuario AND c.id_idea=? "
                            + "ORDER BY c.fecha_creacion ASC "
                            + "LIMIT ?,?");

            sentencia.setInt(1,id);
            sentencia.setInt(2,numero-7);
            sentencia.setInt(3,numero);
            result = sentencia.executeQuery();

            while (result.next()) {
                Date fecha;
                fecha = result.getDate(3);
                Usuario u = new Usuario(result.getInt(5),result.getString(4),null,null,0,null);
                Comentario c = new Comentario(result.getInt(1),result.getString(2),fecha,u);
                listaComentarios.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (sentencia != null) {
                    sentencia.close();
                }
                if (result != null) {
                    result.close();
                }
                if (conexion != null) {
                    confBD.cerrarConexion();
                    conexion = null;
                }
            } catch (SQLException ex) {
                ex.getMessage();
            }
        }
        return listaComentarios;
    }

    @Override
    public boolean eliminarComentario(int id) {
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        boolean eliminar = false;

        try {
            conexion = confBD.iniciarConexion();            
            this.conexion.setAutoCommit(false);
            sentencia = this.conexion.prepareStatement(
                    "DELETE FROM comentario WHERE id = ? ");
            
            sentencia.setInt(1, id);
            
            int filasAfectadas = sentencia.executeUpdate();

            if (filasAfectadas == 0) {
                throw new SQLException("No se encontro ningun comentario con ese id");
            }
            this.conexion.commit();
            eliminar = true;
        } catch (SQLException e) {
            try {
                this.conexion.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                e.printStackTrace();
            }
        } finally {
            try {
                if (sentencia != null) {
                    sentencia.close();
                }
                if (resultado != null) {
                    resultado.close();
                }
                if (conexion != null) {
                    confBD.cerrarConexion();
                    conexion = null;
                }
            } catch (SQLException ex) {
                ex.getMessage();
            }
        }
        return eliminar;
    }
    
}
