/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author chorat
 */
public interface Protocolo {
   
    public static final Integer SIN_SESION = 0;
    public static final Integer INICIAR_SESION = 1;
    public static final Integer REGISTRARSE = 2;
    public static final Integer CERRAR_SESION = 3;
    public static final Integer SESION_ERRONEA = 4;
    public static final Integer SESION_INICIADA = 5;
    public static final Integer REGISTRARSE_EXITOSO = 6;
    public static final Integer REGISTRARSE_CORREO_EXISTENTE = 7;
    public static final Integer REGISTRARSE_NOMBRE_EXISTENTE = 8;
    public static final Integer REGISTRARSE_FALLIDO = 9;
    public static final Integer RECUPERAR_CUENTA = 10;
    public static final Integer RECUPERAR_CUENTA_FALLIDO = 11;
    public static final Integer RECUPERAR_CUENTA_EXITOSO = 12;
    public static final Integer CUENTA_CAMBIAR_AVATAR = 13;
    public static final Integer CUENTA_CAMBIAR_NOMBRE = 14;
    public static final Integer CUENTA_CAMBIAR_NOMBRE_EXISTE = 15;
    public static final Integer CUENTA_CAMBIAR_NOMBRE_EXITO = 16;
    public static final Integer CUENTA_CAMBIAR_PASSWORD = 17;
    public static final Integer CUENTA_CAMBIAR_PASSWORD_EXITO = 18;
    public static final Integer CUENTA_CAMBIAR_PASSWORD_FALLIDO = 19;
    public static final Integer LISTAR_USUARIOS = 20;
    public static final Integer COMPROBAR_SESION = 21;
    public static final Integer COMPROBAR_SESION_EXITO = 22;
    public static final Integer COMPROBAR_SESION_FALLIDO = 23;
    public static final Integer MODIFICAR_USUARIO = 24;
    public static final Integer LISTAR_INCIDENCIAS = 25;
    public static final Integer ELIMINAR_INCIDENCIA = 26;
    public static final Integer ELIMINAR_INCIDENCIA_EXITOSA = 26;
    public static final Integer CAMBIAR_ESTADO = 27;
    public static final Integer CAMBIAR_ESTADO_EXITOSA = 28;
    public static final Integer NUEVA_PREGUNTA = 29;
    public static final Integer NUEVA_PREGUNTA_EXITOSA = 30;
    public static final Integer LISTAR_PREGUNTAS = 31;
    public static final Integer ELIMINAR_PREGUNTA = 32;
    public static final Integer ELIMINAR_PREGUNTA_EXITOSA = 33;
    public static final Integer VALIDAR_PREGUNTA = 34;
    public static final Integer VALIDAR_PREGUNTA_EXITOSO = 35;
    public static final Integer MODIFICAR_PREGUNTA = 36;
    public static final Integer MODIFICAR_PREGUNTA_EXITOSO = 37;
   
}
