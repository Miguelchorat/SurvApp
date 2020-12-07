package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.Denuncia;
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
        if(filtro.equals("")){
            filtro = " ";
        }
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
                    "SELECT DISTINCT r.id,r.descripcion "
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
                throw new SQLException("No se encontro ninguna idea con esa id");
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

    @Override
    public boolean modificarIdea(Idea idea) {
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        boolean modificar = false;

        try {
            conexion = confBD.iniciarConexion();            
            this.conexion.setAutoCommit(false);
            sentencia = this.conexion.prepareStatement(
                    "UPDATE idea SET titulo = ? , descripcion = ? , id_tema = ? "
                    + "WHERE id = ? ");

            sentencia.setString(1, idea.getTitulo());
            sentencia.setString(2, idea.getDescripcion());
            sentencia.setInt(3, idea.getTema().getId());
            sentencia.setInt(4, idea.getId());
            
            int filasAfectadas = sentencia.executeUpdate();

            if (filasAfectadas == 0) {
                throw new SQLException("No se encontro ninguna idea con ese id");
            }
            
            for(int i=0;i<idea.getRespuestas().size();i++){
                sentencia = this.conexion.prepareStatement(
                    "UPDATE respuesta SET descripcion = ? "
                    + "WHERE id = ? ");
                
                sentencia.setString(1, idea.getRespuestas().get(i).getDescripcion());
                sentencia.setInt(2, idea.getRespuestas().get(i).getId());
                filasAfectadas = sentencia.executeUpdate();

                if (filasAfectadas == 0) {
                    throw new SQLException("No se encontro ninguna respuesta con ese id");
                }
            }
            this.conexion.commit();
            modificar = true;
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
        return modificar;
    }

    @Override
    public boolean altaIdea(Idea idea) {
        PreparedStatement statement = null;
        ResultSet result = null;
        boolean alta = false;

        try {
            conexion = confBD.iniciarConexion();
            this.conexion.commit();
            this.conexion.setAutoCommit(false);
            statement = conexion.prepareStatement(
                    "INSERT INTO idea (titulo,descripcion,fecha_creacion,id_usuario,id_tema) "
                    + "VALUES (?, ?, ?, ?, ?)",statement.RETURN_GENERATED_KEYS);

            statement.setString(1, idea.getTitulo());
            statement.setString(2, idea.getDescripcion());
            statement.setDate(3, java.sql.Date.valueOf(idea.getFecha_creacion().toInstant()
                            .atZone(ZoneId.systemDefault())
                            .toLocalDate()));
            statement.setInt(4, idea.getUsuario().getId());
            statement.setInt(5, idea.getTema().getId());
            
            int filas = statement.executeUpdate();                      
            
            if (filas == 0) {
                throw new SQLException("Algun dato erroneo");
            }
            
            String id = "";
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()){
                id=rs.getString(1);
            }
            
            for(Respuesta r : idea.getRespuestas()){
                statement = conexion.prepareStatement(
                    "INSERT INTO respuesta (descripcion,id_idea) "
                    + "VALUES (?, ?)");

                statement.setString(1, r.getDescripcion());
                statement.setInt(2, Integer.parseInt(id));  
                
                filas = statement.executeUpdate();  
                
                if (filas == 0) {
                    throw new SQLException("Algun dato erroneo");
                }
            }
            this.conexion.commit();
            alta = true;
        } catch (SQLException e) {
            try {
                this.conexion.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                e.printStackTrace();
            }
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

    @Override
    public List<Idea> listarIdeaUsuario(Usuario usuario) {
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
                            + "AND u.id = ? "
                            + "ORDER BY i.fecha_creacion ASC");

            
            sentencia.setInt(1,usuario.getId());
            
            result = sentencia.executeQuery();

            while (result.next()) {

                Date fecha;
                fecha = result.getDate(4);
                Tema tema = new Tema(result.getInt(7),result.getString(8));
                Idea idea = new Idea(result.getInt(1),result.getString(2),result.getString(3),
                        fecha,tema,usuario);                                                     
                
                sentencia = this.conexion.prepareStatement(
                    "SELECT DISTINCT r.id,r.descripcion "
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
                if (result2 != null) {
                    result2.close();
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
    public Idea recibirIdea(Usuario usuario) {
        PreparedStatement sentencia = null;
        ResultSet result = null;
        ResultSet result2 = null;
        Idea idea= null;
        
        try {
            conexion = confBD.iniciarConexion();
            sentencia = this.conexion.prepareStatement(
                    "SELECT i.id,i.titulo,i.descripcion,i.fecha_creacion,u.id,u.nombre,t.id,t.nombre "
                            + "FROM idea i,usuario u,tema t "
                            + "WHERE i.id_usuario=u.id AND t.id=i.id_tema "
                            + "AND i.id NOT IN(" 
                            + "SELECT respuesta.id_idea " 
                            + "FROM respuesta_usuario,respuesta "
                            + "WHERE respuesta_usuario.id_usuario=? AND respuesta_usuario.id_respuesta=respuesta.id) "
                            + "GROUP BY i.id "
                            + "ORDER BY rand() "
                            + "LIMIT 1");
            
            sentencia.setInt(1,usuario.getId());
            result = sentencia.executeQuery();
            
            while (result.next()) {

                Date fecha;
                fecha = result.getDate(4);
                Tema tema = new Tema(result.getInt(7),result.getString(8));
                Usuario user = new Usuario(result.getInt(5),result.getString(6));
                idea = new Idea(result.getInt(1),result.getString(2),result.getString(3),
                        fecha,tema,user);                                                     
                
                sentencia = this.conexion.prepareStatement(
                    "SELECT DISTINCT r.id,r.descripcion "
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
    public boolean responderIdea(int id_usuario, int id_respuesta) {
        PreparedStatement statement = null;
        ResultSet result = null;
        boolean alta = false;

        try {
            conexion = confBD.iniciarConexion();
            this.conexion.commit();
            this.conexion.setAutoCommit(false);
            statement = conexion.prepareStatement(
                    "INSERT INTO respuesta_usuario (id_usuario,id_respuesta) "
                    + "VALUES (?, ?)");

            statement.setInt(1, id_usuario);
            statement.setInt(2, id_respuesta); 
            
            int filas = statement.executeUpdate();                      
            
            if (filas == 0) {
                throw new SQLException("Algun dato erroneo");
            }           
            this.conexion.commit();
            alta = true;
        } catch (SQLException e) {
            try {
                this.conexion.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                e.printStackTrace();
            }
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

    @Override
    public boolean altaDenuncia(Denuncia denuncia) {
        PreparedStatement statement = null;
        ResultSet result = null;
        boolean alta = false;

        try {
            conexion = confBD.iniciarConexion();
            this.conexion.commit();
            this.conexion.setAutoCommit(false);
            statement = conexion.prepareStatement(
                    "INSERT INTO denuncia (titulo,descripcion,estado,fecha_creacion,id_usuario,id_idea) "
                    + "VALUES (?, ?, ?, ?, ?, ?)");

            statement.setString(1, denuncia.getTitulo());
            statement.setString(2, denuncia.getDescripcion());
            statement.setString(3, "ESPERANDO"); 
            statement.setDate(4, java.sql.Date.valueOf(denuncia.getFecha_creacion().toInstant()
                            .atZone(ZoneId.systemDefault())
                            .toLocalDate()));
            statement.setInt(5, denuncia.getUsuario().getId());
            statement.setInt(6, denuncia.getIdea().getId());
            
            
            int filas = statement.executeUpdate();                      
            
            if (filas == 0) {
                throw new SQLException("Algun dato erroneo");
            }           
            this.conexion.commit();
            alta = true;
        } catch (SQLException e) {
            try {
                this.conexion.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                e.printStackTrace();
            }
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

    @Override
    public boolean comprobarRespuestaUsuario(Idea idea, Usuario usuario) {
        PreparedStatement sentencia = null;
        ResultSet result = null;
        boolean resultado = false;
        
        try {
            conexion = confBD.iniciarConexion();
            
            
            sentencia = this.conexion.prepareStatement(
                "SELECT i.id "
                        + "FROM respuesta r,idea i,respuesta_usuario ru "
                        + "WHERE i.id=r.id_idea AND r.id=ru.id_respuesta "
                        + "AND ru.id_usuario=? AND i.id=? ");

            sentencia.setInt(1,usuario.getId());
            sentencia.setInt(2,idea.getId());
            result = sentencia.executeQuery();

            while (result.next()) {
                resultado=true;
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
        return resultado;
    }
}
