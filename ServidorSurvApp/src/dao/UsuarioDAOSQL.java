package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Sesion;
import modelo.Usuario;
import util.ConfiguracionBD;

/**
 *
 * @author chorat
 */
public class UsuarioDAOSQL implements UsuarioDAO {
    
    private ConfiguracionBD confBD;
    private Connection conexion = null;

    public UsuarioDAOSQL(){
        confBD = new ConfiguracionBD();
    }
    
    @Override
    public boolean altaUsuario(Usuario usuario) {
        PreparedStatement statement = null;
        ResultSet result = null;
        boolean alta = false;

        try {
            conexion = confBD.iniciarConexion();
            statement = conexion.prepareStatement(
                    "INSERT INTO usuario (correo,nombre,password,imagen,fecha_alta,administrar,sesion) "
                    + "VALUES (?, ?, ?, ?, ?, ?,0)");

            statement.setString(1, usuario.getCorreo());
            statement.setString(2, usuario.getNombre());
            statement.setString(3, usuario.getPass());
            statement.setInt(4, usuario.getAvatar());
            statement.setDate(5, java.sql.Date.valueOf(usuario.getFecha_alta().toInstant()
      .atZone(ZoneId.systemDefault())
      .toLocalDate()));
            statement.setInt(6, usuario.isAdministrar());

            int filas = statement.executeUpdate();

            if (filas == 0) {
                throw new SQLException("Algun dato erroneo");
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
    
    @Override
    public boolean comprobarCorreoUsuario(String correo) {
        PreparedStatement statement = null;
        ResultSet result = null;
        boolean comprobacion = false;

        try {
            conexion = confBD.iniciarConexion();
            statement = this.conexion.prepareStatement(
                    "SELECT correo "
                    + "FROM usuario "
                    + "WHERE correo=? "
                    + " ");
            statement.setString(1, correo);
            result = statement.executeQuery();

            while (result.next()) {
                comprobacion = true;
            } 
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conexion != null) {
                    confBD.cerrarConexion();
                    conexion = null;
                }
                if (result != null) {
                    result.close();
                }
                if (statement != null) {
                    statement.close();
                }  
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return comprobacion;
    }

    @Override
    public boolean comprobarNombreUsuario(String nombre) {
        PreparedStatement statement = null;
        ResultSet result = null;
        boolean comprobacion = false;

        try {
            conexion = confBD.iniciarConexion();            
            statement = this.conexion.prepareStatement(
                    "SELECT nombre "
                    + "FROM usuario "
                    + "WHERE nombre=? "
                    + " ");

            statement.setString(1, nombre);
            result = statement.executeQuery();

            while (result.next()) {
                comprobacion = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conexion != null) {
                    confBD.cerrarConexion();
                    conexion = null;
                }
                if (result != null) {
                    result.close();
                }
                if (statement != null) {
                    statement.close();
                }                
            } catch (SQLException ex) {
                ex.getMessage();
            }
        }

        return comprobacion;
    }

    @Override
    public Usuario comprobarUsuario(Sesion sesion) {
        PreparedStatement statement = null;
        ResultSet result = null;
        Usuario user = null;
        try {
            conexion = confBD.iniciarConexion();         
            statement = this.conexion.prepareStatement(
                    "SELECT id,correo,nombre,password,imagen,fecha_alta,administrar "
                            + "FROM usuario "
                            + "WHERE correo=? AND password=? AND sesion=0");
            
            statement.setString(1, sesion.getCorreo());
            statement.setString(2, sesion.getPass());
            result = statement.executeQuery();
            while (result.next()) {
                String formato = "dd-MM-yyyy";
                SimpleDateFormat formatoFecha = new SimpleDateFormat(formato);                
                Date fecha_alta = formatoFecha.parse(result.getDate(6).toString());
                user = new Usuario(result.getInt(1),result.getInt(5),
                        result.getString(3),
                        result.getString(4),
                        result.getString(2),
                        result.getInt(7),
                        fecha_alta);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        catch (ParseException ex) {
            Logger.getLogger(UsuarioDAOSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                if (conexion != null) {
                    confBD.cerrarConexion();
                    conexion = null;
                }
                if (result != null) {
                    result.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                ex.getMessage();
            }
        }
        return user;
    }

    @Override
    public boolean comprobarDatosUsuario(Sesion sesion) {
        PreparedStatement statement = null;
        ResultSet result = null;
        boolean comprobacion = false;

        try {
            conexion = confBD.iniciarConexion();            
            statement = this.conexion.prepareStatement(
                    "SELECT nombre,correo "
                    + "FROM usuario "
                    + "WHERE nombre=? "
                    + "AND correo=? ");

            statement.setString(2, sesion.getCorreo());
            statement.setString(1, sesion.getPass());
            result = statement.executeQuery();

            while (result.next()) {
                comprobacion = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conexion != null) {
                    confBD.cerrarConexion();
                    conexion = null;
                }
                if (result != null) {
                    result.close();
                }
                if (statement != null) {
                    statement.close();
                }                
            } catch (SQLException ex) {
                ex.getMessage();
            }
        }

        return comprobacion;
    }

    @Override
    public boolean actualizarPass(String correo,String pass) {
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        boolean actualizar = false;

        try {
            conexion = confBD.iniciarConexion();            
            this.conexion.setAutoCommit(false);
            sentencia = this.conexion.prepareStatement(
                    "UPDATE usuario SET password = ?"
                    + "WHERE correo = ? ");

            sentencia.setString(1, pass);
            sentencia.setString(2, correo);
            
            int filasAfectadas = sentencia.executeUpdate();

            if (filasAfectadas == 0) {
                throw new SQLException("No se encontro ningun usuario con ese correo");
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
    public boolean cambiarAvatar(int avatarNuevo,String correo) {
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        boolean actualizar = false;

        try {
            conexion = confBD.iniciarConexion();            
            this.conexion.setAutoCommit(false);
            sentencia = this.conexion.prepareStatement(
                    "UPDATE usuario SET imagen = ? WHERE correo = ? ");
            sentencia.setString(2, correo);
            sentencia.setInt(1, avatarNuevo);
            
            int filasAfectadas = sentencia.executeUpdate();

            if (filasAfectadas == 0) {
                throw new SQLException("No se encontro ningun usuario con ese correo");
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
    public boolean cambiarNombre(String nombre, String correo) {
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        boolean actualizar = false;

        try {
            conexion = confBD.iniciarConexion();            
            this.conexion.setAutoCommit(false);
            sentencia = this.conexion.prepareStatement(
                    "UPDATE usuario SET nombre = ? WHERE correo = ? ");
            sentencia.setString(2, correo);
            sentencia.setString(1, nombre);
            
            int filasAfectadas = sentencia.executeUpdate();

            if (filasAfectadas == 0) {
                throw new SQLException("No se encontro ningun usuario con ese correo");
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
    public List<Usuario> listarUsuarios(int numero,String filtro) {
        PreparedStatement sentencia = null;
        ResultSet result = null;
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        
        try {

            conexion = confBD.iniciarConexion();
            sentencia = this.conexion.prepareStatement(
                    "SELECT id,correo,nombre,password,imagen,fecha_alta,administrar "
                            + "FROM usuario "
                            + "WHERE nombre LIKE ? OR correo LIKE ? OR CAST(usuario.id AS CHAR) LIKE ? "
                            + "ORDER BY nombre ASC "
                            + "LIMIT ?,?");

            sentencia.setString(1,"%"+filtro+"%");
            sentencia.setString(2,"%"+filtro+"%");
            sentencia.setString(3,"%"+filtro+"%");
            sentencia.setInt(4,numero-25);
            sentencia.setInt(5,numero);
            
            result = sentencia.executeQuery();

            while (result.next()) {
                
                Date fecha_alta;
                
                    fecha_alta = result.getDate(6);
                
                Usuario user = new Usuario(result.getInt(1),result.getInt(5),
                        result.getString(3),
                        result.getString(4),
                        result.getString(2),
                        result.getInt(7),
                        fecha_alta);

                listaUsuarios.add(user);
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
        return listaUsuarios;
    }

    @Override
    public boolean abrirSesion(Usuario usuario) {
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        boolean abrir = false;

        try {
            conexion = confBD.iniciarConexion();            
            this.conexion.setAutoCommit(false);
            sentencia = this.conexion.prepareStatement(
                    "UPDATE usuario SET sesion = 1 "
                    + "WHERE correo = ? ");

            sentencia.setString(1, usuario.getCorreo());
            
            int filasAfectadas = sentencia.executeUpdate();

            if (filasAfectadas == 0) {
                throw new SQLException("No se encontro ningun usuario con ese correo");
            }
            this.conexion.commit();
            abrir = true;
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
        return abrir;
    }

    @Override
    public boolean cerrarSesion(Usuario usuario) {
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        boolean cerrar = false;

        try {
            conexion = confBD.iniciarConexion();            
            this.conexion.setAutoCommit(false);
            sentencia = this.conexion.prepareStatement(
                    "UPDATE usuario SET sesion = 0 "
                    + "WHERE correo = ? ");

            sentencia.setString(1, usuario.getCorreo());
            
            int filasAfectadas = sentencia.executeUpdate();

            if (filasAfectadas == 0) {
                throw new SQLException("No se encontro ningun usuario con ese correo");
            }
            this.conexion.commit();
            cerrar = true;
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
        return cerrar;
    }

    @Override
    public boolean comprobarSesion(Usuario usuario) {
        PreparedStatement statement = null;
        ResultSet result = null;
        boolean comprobacion = false;

        try {
            conexion = confBD.iniciarConexion();            
            statement = this.conexion.prepareStatement(
                    "SELECT nombre "
                    + "FROM usuario "
                    + "WHERE correo=? "
                    + "AND sesion=1");

            statement.setString(1, usuario.getCorreo());
            result = statement.executeQuery();

            while (result.next()) {
                comprobacion = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conexion != null) {
                    confBD.cerrarConexion();
                    conexion = null;
                }
                if (result != null) {
                    result.close();
                }
                if (statement != null) {
                    statement.close();
                }                
            } catch (SQLException ex) {
                ex.getMessage();
            }
        }
        return comprobacion;
    }

    @Override
    public boolean modificarUsuario(Usuario usuario) {
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        boolean modificar = false;

        try {
            conexion = confBD.iniciarConexion();            
            this.conexion.setAutoCommit(false);
            sentencia = this.conexion.prepareStatement(
                    "UPDATE usuario SET correo = ? , nombre = ? , imagen = ? , administrar = ? "
                    + "WHERE correo = ? ");

            sentencia.setString(1, usuario.getCorreo());
            sentencia.setString(2, usuario.getNombre());
            sentencia.setInt(3, usuario.getAvatar());
            sentencia.setInt(4, usuario.isAdministrar());
            sentencia.setString(5, usuario.getCorreo());
            int filasAfectadas = sentencia.executeUpdate();

            if (filasAfectadas == 0) {
                throw new SQLException("No se encontro ningun usuario con ese correo");
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
}
