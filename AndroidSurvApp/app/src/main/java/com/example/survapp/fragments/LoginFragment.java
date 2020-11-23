package com.example.survapp.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.survapp.R;
import com.example.survapp.activities.MainActivity;
import com.example.survapp.models.Login;
import com.example.survapp.util.ConexionServidor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LoginFragment extends Fragment {

    private Login login;
    private TextView correo;
    private TextView password;
    private TextView info;
    private Button enviar;
    private TextView recuperar;
    private TextView registrar;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        login = new Login();
        ConexionServidor.setContext(getContext());
        correo = view.findViewById(R.id.et_login_email);
        password = view.findViewById(R.id.et_login_password);
        enviar = view.findViewById(R.id.b_login);
        info = view.findViewById(R.id.label_info);
        recuperar = view.findViewById(R.id.forgot_pass);
        registrar = view.findViewById(R.id.not_account);

        final Intent intentMain = new Intent(getActivity(), MainActivity.class);

        enviar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(final View view) {
            Thread thread = new Thread() {
                public void run() {
                    Looper.prepare();
                    if(login.comprobarCorreo(correo.getText().toString())){
                        if(login.comprobarPassword(password.getText().toString())){
                            boolean iniciarSesion = login.iniciarLogin(correo.getText().toString(),password.getText().toString());
                            if(iniciarSesion == false){
                                info.setText(R.string.error_login);
                            }else {
                                intentMain.putExtra("usuario",login.getUsuario());
                                startActivity(intentMain);
                                correo.setText("");
                                password.setText("");
                            }
                        }
                        else{
                            info.setText(R.string.error_pass);
                        }
                    } else{
                        info.setText(R.string.error_email);
                    }
                    Looper.myLooper().quit();

                }
            };
            thread.start();
            }
        });

        recuperar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                RecuperarFragment recoverFragment = new RecuperarFragment();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.login,recoverFragment)
                        .addToBackStack(null).commit();
            }
        });

        registrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                RegistrarFragment registerFragment = new RegistrarFragment();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.login,registerFragment)
                        .addToBackStack(null).commit();
            }
        });

        return view;
    }
}
