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
    public static final int REGISTRARSE_CORREO_ERROR = 8;
    public static final int REGISTRARSE_NOMBRE_CUENTA_ERROR = 9;
    public static final int RECUPERAR_CUENTA = 10;
    public static final int RECUPERAR_CUENTA_EXITOSO = 11;
    public static final int RECUPERAR_CUENTA_FALLIDO = 12;    
    public static final int SESION_INICIADA = 13;
    public static final int SESION_ERRONEA = 14;
}
