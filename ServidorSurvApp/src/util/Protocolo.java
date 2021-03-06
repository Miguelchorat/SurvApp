package util;

/**
 *
 * @author chorat
 */
public interface Protocolo {
   
    public static final int SIN_SESION = 0;
    public static final int INICIAR_SESION = 1;
    public static final int REGISTRARSE = 2;
    public static final int CERRAR_SESION = 3;
    public static final int INICIAR_SESION_EXITOSO = 4;
    public static final int INICIAR_SESION_FALLIDO = 5;
    public static final int REGISTRARSE_EXITOSO= 6;
    public static final int REGISTRARSE_FALLIDO = 7;
    public static final int CORREO_ERROR = 8;
    public static final int NOMBRE_CUENTA_ERROR = 9;
    public static final int RECUPERAR_CUENTA = 10;
    public static final int RECUPERAR_CUENTA_EXITOSO = 11;
    public static final int RECUPERAR_CUENTA_FALLIDO = 12;    
    public static final int SESION_INICIADA = 13;
    public static final int SESION_ERRONEA = 14;
    public static final int CUENTA_CAMBIAR_AVATAR = 15;
    public static final int CUENTA_CAMBIAR_NOMBRE = 16;
    public static final int CUENTA_CAMBIAR_NOMBRE_EXISTE = 17;
    public static final int CUENTA_CAMBIAR_NOMBRE_EXITO = 18;
    public static final int CUENTA_CAMBIAR_PASSWORD = 19;
    public static final int CUENTA_CAMBIAR_PASSWORD_EXITO = 20;
    public static final int CUENTA_CAMBIAR_PASSWORD_FALLIDO = 21;
    public static final int LISTAR_USUARIOS = 22;
    public static final int COMPROBAR_SESION = 23;
    public static final int COMPROBAR_SESION_EXITO = 24;
    public static final int COMPROBAR_SESION_FALLIDO = 25;
    public static final int MODIFICAR_USUARIO = 26;
    public static final int MODIFICAR_USUARIO_EXITO = 27;
    public static final int LISTAR_INCIDENCIAS = 28;
    public static final int ELIMINAR_INCIDENCIA = 29;
    public static final int ELIMINAR_INCIDENCIA_EXITOSA = 30;
    public static final int CAMBIAR_ESTADO_INCIDENCIA = 31;
    public static final int CAMBIAR_ESTADO_INCIDENCIA_EXITOSA = 32;
    public static final int COMPROBAR_NOMBRE_CUENTA = 33;
    public static final int COMPROBAR_CORREO = 34;
    public static final int LISTAR_IDEAS = 35;
    public static final int LISTAR_DENUNCIAS = 36;
    public static final int ELIMINAR_DENUNCIA = 37;
    public static final int ELIMINAR_DENUNCIA_EXITOSA = 38;
    public static final int CAMBIAR_ESTADO_DENUNCIA = 39;
    public static final int CAMBIAR_ESTADO_DENUNCIA_EXITOSA = 40;
    public static final int ELIMINAR_IDEA = 41;
    public static final int ELIMINAR_IDEA_EXITOSA = 42;
    public static final int BUSCAR_INFORMACION_IDEA = 43;
    public static final int CONTAR_RESPUESTAS = 44;
    public static final int MODIFICAR_IDEA = 45;
    public static final int MODIFICAR_IDEA_EXITOSA = 46;
    public static final int LISTAR_COMENTARIOS = 47;
    public static final int ELIMINAR_COMENTARIO = 48;
    public static final int ELIMINAR_COMENTARIO_EXITOSO = 49;
    public static final int ALTA_INCIDENCIA = 50;
    public static final int AÑADIR_SEGUIDOR = 51;
    public static final int AÑADIR_SEGUIDOR_NO_EXISTE = 52;
    public static final int AÑADIR_SEGUIDOR_FALLIDO = 53;
    public static final int LISTAR_SEGUIDOS = 54;
    public static final int ELIMINAR_SEGUIDOR = 55;
    public static final int ELIMINAR_SEGUIDOR_FALLIDO = 56;
    public static final int ALTA_IDEA = 57;
    public static final int ALTA_DENUNCIA = 58;
    public static final int LISTAR_IDEAS_USUARIO = 59;
    public static final int LISTAR_COMENTARIO_IDEA = 60;
    public static final int RECIBIR_IDEA = 61;
    public static final int ALTA_COMENTARIO = 62;
    public static final int RESPONDER_PREGUNTA = 63;
    public static final int COMPROBAR_RESPUESTA_USUARIO = 64;
    public static final int COMPROBAR_RESPUESTA_USUARIO_FALLIDO = 65;
}
