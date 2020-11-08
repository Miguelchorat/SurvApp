package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.Idea;
import modelo.Respuesta;
import modelo.Tema;
import modelo.Usuario;
import util.ConfiguracionBD;

/**
 *
 * @author chorat
 */
public class IdeaDAOSQL implements IdeaDAO{
    
    ConfiguracionBD confBD;
    Connection conexion = null;

    public IdeaDAOSQL() {
        confBD = new ConfiguracionBD();
    }

    @Override
    public List<Idea> listarIdea(int numero, String filtro) {
        PreparedStatement sentencia = null;
        ResultSet result = null;
        ResultSet result2 = null;
        List<Idea> listaIdeas = new ArrayList<Idea>();
        
        try {
            conexion = confBD.iniciarConexion();
            sentencia = this.conexion.prepareStatement(
                    "SELECT i.id,i.titulo,i.descripcion,i.fecha_creacion,u.id,u.nombre,t.id,t.nombre "
                            + "FROM idea i,usuario u,tema t "
                            + "WHERE i.id_usuario=u.id AND t.id=i.id_tema "
                            + "AND (i.titulo LIKE ? OR i.descripcion LIKE ?) OR CAST(i.id AS CHAR) LIKE ? "
                            + "GROUP BY i.id "
                            + "ORDER BY i.fecha_creacion ASC "
                            + "LIMIT ?,?");

            sentencia.setString(1,"%"+filtro+"%");
            sentencia.setString(2,"%"+filtro+"%");
            sentencia.setString(3,"%"+filtro+"%");
            sentencia.setInt(4,numero-7);
            sentencia.setInt(5,numero);
            
            result = sentencia.executeQuery();

            while (result.next()) {

                Date fecha;
                fecha = result.getDate(4);
                Tema tema = new Tema(result.getInt(7),result.getString(8));
                Usuario usuario = new Usuario(result.getInt(5),result.getString(6));
                Idea idea = new Idea(result.getInt(1),result.getString(2),result.getString(3),
                        fecha,tema,usuario);                                                     
                
                sentencia = this.conexion.prepareStatement(
                    "SELECT r.id,r.descripcion "
                            + "FROM idea i,respuesta r "
                            + "WHERE r.id_idea=?");
                sentencia.setInt(1,idea.getId());
                result2 = sentencia.executeQuery();
                
                List<Respuesta> respuestas = new ArrayList<>();
                
                while (result2.next()) {
                    Respuesta respuesta = new Respuesta(result2.getInt(1),result2.getString(2));
                    respuestas.add(respuesta);
                }
                idea.setRespuestas(respuestas);
                listaIdeas.add(idea);
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
        return listaIdeas;
    }

    @Override
    public Idea informacionIdea(int id) {
        PreparedStatement sentencia = null;
        ResultSet result = null;
        ResultSet result2 = null;
        Idea idea = null;
        
        try {
            conexion = confBD.iniciarConexion();
            sentencia = this.conexion.prepareStatement(
                    "SELECT i.id,i.titulo,i.descripcion,t.id,t.nombre "
                            + "from idea i,tema t "
                            + "WHERE i.id_tema=t.id AND i.id=?");
            
            sentencia.setInt(1,id);            
            
            result = sentencia.executeQuery();

            while (result.next()) {
                Tema tema = new Tema(result.getInt(4),result.getString(5));
                idea = new Idea(result.getInt(1),result.getString(2),result.getString(3),tema);                                                     
                
                sentencia = this.conexion.prepareStatement(
                    "SELECT r.id,r.descripcion "
                            + "FROM idea i,respuesta r "
                            + "WHERE r.id_idea=?");
                sentencia.setInt(1,idea.getId());
                result2 = sentencia.executeQuery();
                
                List<Respuesta> respuestas = new ArrayList<>();
                
                while (result2.next()) {
                    Respuesta respuesta = new Respuesta(result2.getInt(1),result2.getString(2));
                    respuestas.add(respuesta);
                }
                idea.setRespuestas(respuestas);
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
        return idea;
    }

    @Override
    public boolean eliminarIdea(int id) {
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        boolean eliminar = false;

        try {
            conexion = confBD.iniciarConexion();            
            this.conexion.setAutoCommit(false);
            sentencia = this.conexion.prepareStatement(
                    "DELETE FROM idea WHERE id = ? ");
            
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
    public List<Integer> contarRespuestas(List<Respuesta> respuestas) {
        PreparedStatement sentencia = null;
        ResultSet result = null;
        List<Integer> cuenta = new ArrayList<>();
        
        try {
            conexion = confBD.iniciarConexion();
            
            for(int i=0;i<respuestas.size();i++){
                sentencia = this.conexion.prepareStatement(
                    "SELECT count(id_respuesta) "
                            + "from respuesta_usuario "
                            + "WHERE id_respuesta=?");
                
                sentencia.setInt(1,respuestas.get(i).getId());            
                result = sentencia.executeQuery();
                
                while (result.next()) {
                    cuenta.add(result.getInt(1));
                }
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
        return cuenta;
    }
    
    
    
}
