package util;

/**
 *
 * @author chorat
 */
public interface Protocol {
   
    public static final Integer SIN_SESION = 0;
    public static final Integer INICIAR_SESION = 1;
    public static final Integer REGISTRARSE = 2;
    public static final Integer CERRAR_SESION = 3;
    public static final Integer INICIAR_SESION_EXITOSO = 4;
    public static final Integer INICIAR_SESION_FALLIDO = 5;
    public static final Integer REGISTRARSE_EXITOSO= 6;
    public static final Integer REGISTRARSE_FALLIDO = 7;
    public static final Integer REGISTRARSE_CORREO_ERROR = 8;
    public static final Integer REGISTRARSE_NOMBRE_CUENTA_ERROR = 9;
    public static final Integer RECUPERAR_CUENTA = 10;
    public static final Integer RECUPERAR_CUENTA_EXITOSO = 11;
    public static final Integer RECUPERAR_CUENTA_FALLIDO = 12;    
}
