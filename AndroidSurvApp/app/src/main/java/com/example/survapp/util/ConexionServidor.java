package com.example.survapp.util;

import android.content.Context;
import android.widget.Toast;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ConexionServidor {

    private static Socket socket;
    private static DataOutputStream salida;
    private static DataInputStream entrada;
    static Context context;


    public static void abrirSocket(){
        try {
            //ConfServidor c = new ConfServidor(context);
            socket = new Socket("192.168.1.232",8036);//c.getIp(),Integer.parseInt(c.getPuerto()));
            salida = new DataOutputStream(socket.getOutputStream());
            entrada = new DataInputStream(socket.getInputStream());
        } catch (IOException e) {
            Toast.makeText(context, "Problemas al intentar conectar con el servidor", Toast.LENGTH_SHORT).show();
        }
    }

    public static void cerrarSocket(){
        try {
            if(salida!=null)
                salida.close();
            if(entrada!=null)
                entrada.close();
            if(socket!=null)
                socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Socket getSocket() {
        return socket;
    }

    public static void setSocket(Socket socket) {
        ConexionServidor.socket = socket;
    }

    public static DataOutputStream getSalida() {
        return salida;
    }

    public static void setSalida(DataOutputStream salida) {
        ConexionServidor.salida = salida;
    }

    public static DataInputStream getEntrada() {
        return entrada;
    }

    public static void setEntrada(DataInputStream entrada) {
        ConexionServidor.entrada = entrada;
    }

    public static void setContext(Context context) {
        ConexionServidor.context = context;
    }
}
