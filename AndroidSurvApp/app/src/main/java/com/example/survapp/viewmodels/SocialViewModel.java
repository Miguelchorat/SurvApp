package com.example.survapp.viewmodels;

import android.os.Looper;

import com.example.survapp.R;
import com.example.survapp.models.Usuario;
import com.example.survapp.util.ConexionServidor;
import com.example.survapp.util.Protocolo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.List;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class SocialViewModel extends ViewModel {

    private MutableLiveData<List<Usuario>> usuarios = new MutableLiveData<List<Usuario>>();
    private Gson gson;
    private Protocolo protocolo;

    public SocialViewModel(){
        this.gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
    }

    public MutableLiveData<List<Usuario>> getUsuarios() {
        if (usuarios == null) {
            usuarios = new MutableLiveData<List<Usuario>>();
        }
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuariosAux) {
        this.usuarios.postValue(usuariosAux);
    }

    public void recibirListaSeguidos(Usuario usuario){
        Thread thread = new Thread() {
            public void run() {
                try {
                    Looper.prepare();
                    ConexionServidor.abrirSocket();
                    ConexionServidor.getSalida().writeInt(protocolo.LISTAR_SEGUIDOS);
                    ConexionServidor.getSalida().writeUTF(gson.toJson(usuario));
                    TypeToken<List<Usuario>> token = new TypeToken<List<Usuario>>() {};
                    List<Usuario> usuariosAux;
                    usuariosAux = gson.fromJson((String)ConexionServidor.getEntrada().readUTF(),token.getType());
                    setUsuarios(usuariosAux);
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

    public void eliminarSeguidor(Usuario usuario,Usuario follow){
        Thread thread = new Thread() {
            public void run() {
                try {
                    Looper.prepare();
                    ConexionServidor.abrirSocket();
                    ConexionServidor.getSalida().writeInt(protocolo.ELIMINAR_SEGUIDOR);
                    ConexionServidor.getSalida().writeUTF(gson.toJson(usuario));
                    ConexionServidor.getSalida().writeUTF(gson.toJson(follow));
                    int result = ConexionServidor.getEntrada().readInt();
                    if(result == Protocolo.ELIMINAR_SEGUIDOR){
                        recibirListaSeguidos(usuario);
                    }
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

    public void reset(MutableLiveData<List<Usuario>> follows){
        this.usuarios=follows;
    }
}
