package com.example.survapp.fragments;

import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.survapp.R;
import com.example.survapp.models.Registrar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class RegistrarFragment extends Fragment {

    private ImageView atras;
    private EditText nombreCuenta;
    private EditText password;
    private EditText passwordConfirmar;
    private EditText correo;
    private Button bRegistrar;
    private TextView info;
    private Registrar registrar;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register, container, false);
        atras = view.findViewById(R.id.img_register_back);
        nombreCuenta = view.findViewById(R.id.et_register_account_name);
        password = view.findViewById(R.id.et_register_password);
        passwordConfirmar = view.findViewById(R.id.et_register_password2);
        correo = view.findViewById(R.id.et_register_email);
        bRegistrar = view.findViewById(R.id.b_register);
        info = view.findViewById(R.id.register_label_info);


        atras.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                LoginFragment loginFragment = new LoginFragment();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.login,loginFragment)
                        .addToBackStack(null).commit();
            }
        });

        bRegistrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                registrar = new Registrar(info, correo.getText().toString(),password.getText().toString(),
                        passwordConfirmar.getText().toString(), nombreCuenta.getText().toString());
                Thread thread = new Thread() {
                    public void run() {
                        Looper.prepare();
                        boolean iniciarRegistro = registrar.iniciarRegistro();
                        if(iniciarRegistro){
                            LoginFragment loginFragment = new LoginFragment();
                            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.login,loginFragment)
                                    .addToBackStack(null).commit();
                        }

                        Looper.myLooper().quit();
                    }
                };
                thread.start();
            }
        });

        return view;
    }
}
