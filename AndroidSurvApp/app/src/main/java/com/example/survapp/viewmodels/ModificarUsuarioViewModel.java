package com.example.survapp.viewmodels;

import android.os.Looper;

import com.example.survapp.models.Usuario;
import com.example.survapp.util.ConexionServidor;
import com.example.survapp.util.Protocolo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ModificarUsuarioViewModel extends ViewModel {

    private MutableLiveData<Usuario> usuarioModificado = new MutableLiveData<Usuario>();
    private Gson gson;
    private Protocolo protocolo;

    public ModificarUsuarioViewModel(){
        this.gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
    }

    public MutableLiveData<Usuario> getUsuarioModificado() {
        if (usuarioModificado == null) {
            usuarioModificado = new MutableLiveData<Usuario>();
        }
        return usuarioModificado;
    }

    public void enviarUsuarioModificado(){
        Thread thread = new Thread() {
            public void run() {
                try {
                    Looper.prepare();
                    ConexionServidor.getSalida().writeInt(protocolo.MODIFICAR_USUARIO);
                    ConexionServidor.getSalida().writeUTF(gson.toJson(usuarioModificado.getValue()));
                    ConexionServidor.getEntrada().readInt();
                    Looper.myLooper().quit();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (NullPointerException npe) {
                    npe.printStackTrace();
                }
            }
        };
        thread.start();
    }

    public void setUsuarioModificado(Usuario usuario) {
        this.usuarioModificado.setValue(usuario);
    }
}
