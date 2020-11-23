package com.example.survapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.widget.Toast;

import com.example.survapp.R;
import com.example.survapp.models.Login;
import com.example.survapp.models.Usuario;
import com.example.survapp.viewmodels.HomeViewModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(navView, navController);

        usuario = (Usuario) getIntent().getSerializableExtra("usuario");
        HomeViewModel model = new ViewModelProvider(this).get(HomeViewModel.class);
        model.setUsuario(usuario);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        final Intent intentMain = new Intent(this, LoginActivity.class);

        Thread thread = new Thread() {
            public void run() {
                Looper.prepare();
                Login login = new Login();
                boolean result = login.iniciarLoginNoEncrypt(usuario.getCorreo(),usuario.getPass());
                if(!result) {
                    startActivity(intentMain);
                }
                Looper.myLooper().quit();
            }
        };
        thread.start();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Thread thread = new Thread() {
            public void run() {
                Looper.prepare();
                Login login = new Login();
                login.cerrarSesion(usuario);
                Looper.myLooper().quit();
            }
        };
        thread.start();
    }
}
