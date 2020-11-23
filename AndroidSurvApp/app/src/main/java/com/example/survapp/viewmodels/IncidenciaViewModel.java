package com.example.survapp.viewmodels;

import android.os.Looper;

import com.example.survapp.R;
import com.example.survapp.models.Incidencia;
import com.example.survapp.models.Login;
import com.example.survapp.models.Sesion;
import com.example.survapp.models.Usuario;
import com.example.survapp.util.ConexionServidor;
import com.example.survapp.util.Protocolo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class IncidenciaViewModel extends ViewModel {

    private MutableLiveData<Incidencia> incidencia = new MutableLiveData<Incidencia>();
    private Gson gson;
    private Protocolo protocolo;

    public IncidenciaViewModel(){
        this.gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
    }

    public MutableLiveData<Incidencia> getIncidencia() {
        if (incidencia == null) {
            incidencia = new MutableLiveData<Incidencia>();
        }
        return incidencia;
    }

    public void enviarIncidencia(){
            Thread thread = new Thread() {
                public void run() {
                    try {
                        Looper.prepare();
                        ConexionServidor.abrirSocket();
                        ConexionServidor.getSalida().writeInt(protocolo.ALTA_INCIDENCIA);
                        ConexionServidor.getSalida().writeUTF(gson.toJson(incidencia.getValue()));
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

    public void setIncidencia(Incidencia incidencia) {
        this.incidencia.setValue(incidencia);
    }

}
