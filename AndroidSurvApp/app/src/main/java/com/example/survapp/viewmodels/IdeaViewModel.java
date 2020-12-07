package com.example.survapp.viewmodels;

import android.os.Looper;

import com.example.survapp.models.Idea;
import com.example.survapp.models.Respuesta;
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

public class IdeaViewModel  extends ViewModel {

    private MutableLiveData<Idea> idea = new MutableLiveData<Idea>();
    private Gson gson;
    private Protocolo protocolo;
    private HomeViewModel modelHome;

    public IdeaViewModel(){
        this.gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
    }

    public MutableLiveData<Idea> getIdea() {
        if (idea == null) {
            idea = new MutableLiveData<Idea>();
        }
        return idea;
    }

    public void setIdea(Idea idea) {
        this.idea.postValue(idea);
    }

    public void reset(){
        this.idea=new MutableLiveData<Idea>();
    }

    public void recibirIdea(Usuario usuario){
        Thread thread = new Thread() {
            public void run() {
                try {
                    Looper.prepare();
                    ConexionServidor.getSalida().writeInt(protocolo.RECIBIR_IDEA);
                    ConexionServidor.getSalida().writeUTF(gson.toJson(usuario));
                    Idea i = gson.fromJson((String)ConexionServidor.getEntrada().readUTF(), Idea.class);
                    setIdea(i);
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

    public void mandarRespuesta(Usuario usuario, Respuesta respuesta){
        Thread thread = new Thread() {
            public void run() {
                try {
                    Looper.prepare();
                    ConexionServidor.getSalida().writeInt(protocolo.RESPONDER_PREGUNTA);
                    ConexionServidor.getSalida().writeUTF(gson.toJson(usuario));
                    ConexionServidor.getSalida().writeUTF(gson.toJson(respuesta));
                    recibirIdea(usuario);
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
