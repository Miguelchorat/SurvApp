package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.Denuncia;
import modelo.Idea;
import modelo.Usuario;
import util.ConfiguracionBD;
import util.EstadoIncidencia;

/**
 *
 * @author chorat
 */
public class DenunciaDAOSQL implements DenunciaDAO{
    
    ConfiguracionBD confBD;
    Connection conexion = null;

    public DenunciaDAOSQL() {
        confBD = new ConfiguracionBD();
    }
    
    @Override
    public List<Denuncia> listarDenuncia(int numero, String filtro) {
        PreparedStatement sentencia = null;
        ResultSet result = null;
        List<Denuncia> listaDenuncias = new ArrayList<Denuncia>();
        
        try {
            conexion = confBD.iniciarConexion();
            sentencia = this.conexion.prepareStatement(
                    "SELECT denuncia.id,u1.nombre,u2.nombre,denuncia.titulo,denuncia.descripcion,denuncia.fecha_creacion,denuncia.estado,denuncia.id_idea "
                            + "FROM denuncia "
                            + "LEFT JOIN usuario u2 ON u2.id = denuncia.id_administrador "
                            + "JOIN usuario u1 ON u1.id = denuncia.id_usuario "
                            + "WHERE denuncia.titulo LIKE ? OR denuncia.descripcion LIKE ? OR CAST(denuncia.id AS CHAR) LIKE ? "
                            + "ORDER BY denuncia.fecha_creacion ASC "
                            + "LIMIT ?,?");

            sentencia.setString(1,"%"+filtro+"%");
            sentencia.setString(2,"%"+filtro+"%");
            sentencia.setString(3,"%"+filtro+"%");
            sentencia.setInt(4,numero-7);
            sentencia.setInt(5,numero);
            
            result = sentencia.executeQuery();

            while (result.next()) {

                Date fecha;
                fecha = result.getDate(6);
                Usuario usuario = new Usuario(result.getString(2));
                Usuario admin = new Usuario(result.getString(3));
                Idea idea = new Idea(result.getInt(8));
                
                Denuncia denuncia = new Denuncia(result.getInt(1),
                        result.getString(4),
                        result.getString(5),
                        EstadoIncidencia.valueOf(result.getString(7)),
                        fecha,
                        usuario,
                        idea,
                        admin);

                listaDenuncias.add(denuncia);
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
        return listaDenuncias;
    }

    @Override
    public boolean eliminarDenuncia(int id) {
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        boolean eliminar = false;

        try {
            conexion = confBD.iniciarConexion();            
            this.conexion.setAutoCommit(false);
            sentencia = this.conexion.prepareStatement(
                    "DELETE FROM denuncia WHERE id = ? ");
            
            sentencia.setInt(1, id);
            
            int filasAfectadas = sentencia.executeUpdate();

            if (filasAfectadas == 0) {
                throw new SQLException("No se encontro ninguna denuncia con esa id");
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

    @Override
    public boolean cambiarEstado(int id, String estado, int admin) {
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        boolean actualizar = false;

        try {
            conexion = confBD.iniciarConexion();            
            this.conexion.setAutoCommit(false);
            if(admin!=-1){
                sentencia = this.conexion.prepareStatement(
                    "UPDATE denuncia SET id_administrador = ?,estado = ? WHERE id = ? ");
                sentencia.setInt(1, admin);
                sentencia.setString(2, estado);
                sentencia.setInt(3, id);
            }
            else{
                sentencia = this.conexion.prepareStatement(
                    "UPDATE denuncia SET id_administrador = null, estado = ? WHERE id = ? ");
                sentencia.setString(1, estado);
                sentencia.setInt(2, id);
            }
            
            int filasAfectadas = sentencia.executeUpdate();

            if (filasAfectadas == 0) {
                throw new SQLException("No se encontro ninguna denuncia con esa id");
            }
            this.conexion.commit();
            actualizar = true;
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
        return actualizar;
    }
}
