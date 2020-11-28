package com.example.survapp.viewmodels;

import android.os.Looper;

import com.example.survapp.models.Idea;
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

public class HomeViewModel extends ViewModel {

    private MutableLiveData<Usuario> usuario = new MutableLiveData<Usuario>();
    private MutableLiveData<List<Idea>> ideas = new MutableLiveData<List<Idea>>();
    private Gson gson;
    private Protocolo protocolo;

    public HomeViewModel(){
        this.gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
    }

    public MutableLiveData<Usuario> getUsuario() {
        if (usuario == null) {
            usuario = new MutableLiveData<Usuario>();
        }
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario.setValue(usuario);
    }

    public MutableLiveData<List<Idea>> getIdeas() {
        if (ideas == null) {
            ideas = new MutableLiveData<List<Idea>>();
        }
        return ideas;
    }

    public void setIdeas(List<Idea> ideas) {
        this.ideas.postValue(ideas);
    }

    public void reset(MutableLiveData<List<Idea>> ideas){
        this.ideas=ideas;
    }

    public void recibirListaIdeas(){
        Thread thread = new Thread() {
            public void run() {
                try {
                    Looper.prepare();
                    ConexionServidor.abrirSocket();
                    ConexionServidor.getSalida().writeInt(protocolo.LISTAR_IDEAS_USUARIO);
                    ConexionServidor.getSalida().writeUTF(gson.toJson(usuario.getValue()));
                    TypeToken<List<Idea>> token = new TypeToken<List<Idea>>() {};
                    List<Idea> ideasAux;
                    ideasAux = gson.fromJson((String)ConexionServidor.getEntrada().readUTF(),token.getType());
                    setIdeas(ideasAux);
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

    public void eliminarIdea(Idea idea){
        Thread thread = new Thread() {
            public void run() {
                try {
                    Looper.prepare();
                    ConexionServidor.abrirSocket();
                    ConexionServidor.getSalida().writeInt(protocolo.ELIMINAR_IDEA);
                    ConexionServidor.getSalida().writeInt(idea.getId());
                    int result = ConexionServidor.getEntrada().readInt();
                    if(result == Protocolo.ELIMINAR_IDEA_EXITOSA){
                        recibirListaIdeas();
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
}
