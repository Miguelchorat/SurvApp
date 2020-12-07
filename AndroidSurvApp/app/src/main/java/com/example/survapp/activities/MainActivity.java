package com.example.survapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.Toast;

import com.example.survapp.R;
import com.example.survapp.models.Login;
import com.example.survapp.models.Usuario;
import com.example.survapp.viewmodels.HomeViewModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private Usuario usuario;
    private Boolean iniciar;
    private BottomNavigationView navView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navView = findViewById(R.id.nav_view);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(navView, navController);

        iniciar=false;
        usuario = (Usuario) getIntent().getSerializableExtra("usuario");
        HomeViewModel model = new ViewModelProvider(this).get(HomeViewModel.class);
        model.setUsuario(usuario);
    }

    @Override
    public void onBackPressed (){

    }

    public Boolean getIniciar() {
        return iniciar;
    }

    public void setIniciar(Boolean iniciar) {
        this.iniciar = iniciar;
    }
}
