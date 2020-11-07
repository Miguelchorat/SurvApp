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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarIdea(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
