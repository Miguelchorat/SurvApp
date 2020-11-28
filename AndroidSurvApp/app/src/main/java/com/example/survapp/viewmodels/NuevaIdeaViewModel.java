package com.example.survapp.viewmodels;

import android.os.Looper;

import com.example.survapp.models.Idea;
import com.example.survapp.models.Usuario;
import com.example.survapp.util.ConexionServidor;
import com.example.survapp.util.Protocolo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

import androidx.lifecycle.MutableLiveData;

public class NuevaIdeaViewModel {

    private MutableLiveData<Idea> idea = new MutableLiveData<Idea>();
    private Gson gson;
    private Protocolo protocolo;

    public NuevaIdeaViewModel(){
        this.gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
    }

    public MutableLiveData<Idea> getIdea() {
        if (idea == null) {
            idea = new MutableLiveData<Idea>();
        }
        return idea;
    }

    public void enviarIdea(){
        Thread thread = new Thread() {
            public void run() {
                try {
                    Looper.prepare();
                    ConexionServidor.abrirSocket();
                    ConexionServidor.getSalida().writeInt(protocolo.ALTA_IDEA);
                    ConexionServidor.getSalida().writeUTF(gson.toJson(idea.getValue()));
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

    public void setIdea(Idea idea) {
        this.idea.setValue(idea);
    }

}
