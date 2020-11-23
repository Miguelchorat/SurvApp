package com.example.survapp.viewmodels;

import com.example.survapp.models.Usuario;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<Usuario> usuario = new MutableLiveData<Usuario>();

    public MutableLiveData<Usuario> getUsuario() {
        if (usuario == null) {
            usuario = new MutableLiveData<Usuario>();
        }
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario.setValue(usuario);
    }
}
