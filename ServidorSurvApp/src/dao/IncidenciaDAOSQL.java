package dao;

import java.sql.Connection;
import java.util.List;
import modelo.Incidencia;
import util.ConfiguracionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import modelo.Usuario;
import util.EstadoIncidencia;
/**
 *
 * @author chorat
 */
public class IncidenciaDAOSQL implements IncidenciaDAO{
    
    ConfiguracionBD confBD;
    Connection conexion = null;

    public IncidenciaDAOSQL() {
        confBD = new ConfiguracionBD();
    }
    
    
    @Override
    public List<Incidencia> listarIncidencias(int numero,String filtro) {
        PreparedStatement sentencia = null;
        ResultSet result = null;
        List<Incidencia> listaIncidencias = new ArrayList<Incidencia>();
        if(filtro.equals("")){
            filtro = " ";
        }
        try {
            conexion = confBD.iniciarConexion();
            sentencia = this.conexion.prepareStatement(
                    "SELECT incidencia.id,u1.nombre,u2.nombre,titulo,descripcion,fecha,estado "
                            + "FROM incidencia "
                            + "LEFT JOIN usuario u2 ON u2.id = incidencia.id_administrador "
                            + "JOIN usuario u1 ON u1.id = incidencia.id_usuario "
                            + "WHERE titulo LIKE ? OR descripcion LIKE ? OR CAST(incidencia.id AS CHAR) LIKE ? "
                            + "ORDER BY fecha ASC "
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
             
                Incidencia incidencia = new Incidencia(result.getInt(1),new Usuario(result.getString(2)),
                        new Usuario(result.getString(3)),
                        result.getString(4),
                        result.getString(5),
                        fecha,
                        EstadoIncidencia.valueOf(result.getString(7)));

                listaIncidencias.add(incidencia);
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
        return listaIncidencias;
    }

    @Override
    public boolean eliminarIncidencia(int id) {
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        boolean eliminar = false;

        try {
            conexion = confBD.iniciarConexion();            
            this.conexion.setAutoCommit(false);
            sentencia = this.conexion.prepareStatement(
                    "DELETE FROM incidencia WHERE id = ? ");
            
            sentencia.setInt(1, id);
            
            int filasAfectadas = sentencia.executeUpdate();

            if (filasAfectadas == 0) {
                throw new SQLException("No se encontro ninguna incidencia con esa id");
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
                    "UPDATE incidencia SET id_administrador = ?,estado = ? WHERE id = ? ");
                sentencia.setInt(1, admin);
                sentencia.setString(2, estado);
                sentencia.setInt(3, id);
            }
            else{
                sentencia = this.conexion.prepareStatement(
                    "UPDATE incidencia SET id_administrador = null, estado = ? WHERE id = ? ");
                sentencia.setString(1, estado);
                sentencia.setInt(2, id);
            }
            
            int filasAfectadas = sentencia.executeUpdate();

            if (filasAfectadas == 0) {
                throw new SQLException("No se encontro ninguna incidencia con esa id");
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

    @Override
    public boolean altaIncidencia(Incidencia incidencia) {
        PreparedStatement statement = null;
        ResultSet result = null;
        boolean alta = false;

        try {
            conexion = confBD.iniciarConexion();
            statement = conexion.prepareStatement(
                    "INSERT INTO incidencia (titulo,descripcion,fecha,estado,id_usuario,id_administrador) "
                    + "VALUES (?, ?, ?,'ESPERANDO', ?,null)");

            statement.setString(1, incidencia.getTitulo());
            statement.setString(2, incidencia.getDescripcion());
            statement.setDate(3, java.sql.Date.valueOf(incidencia.getFecha().toInstant()
      .atZone(ZoneId.systemDefault())
      .toLocalDate()));
            statement.setInt(4, incidencia.getNombreUsuario().getId());

            int filas = statement.executeUpdate();

            if (filas == 0) {
                throw new SQLException("Algun dato es erroneo");
            }
            alta = true;
        } catch (SQLException e) {
            e.printStackTrace();
            alta = false;
        } finally {
            try {
                if (conexion != null) {
                    confBD.cerrarConexion();
                    conexion = null;
                }
                if (statement != null) {
                    statement.close();
                }
                if (result != null) {
                    result.close();
                }
            } catch (SQLException ex) {
                ex.getMessage();
            }
        }
        return alta;
    }
    
    
}
