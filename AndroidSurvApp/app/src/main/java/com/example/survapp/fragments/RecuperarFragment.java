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
import com.example.survapp.models.Recuperar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class RecuperarFragment extends Fragment {

    private ImageView atras;
    private EditText correo;
    private EditText nombreCuenta;
    private Button enviar;
    private TextView info;
    private Recuperar recuperar;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recover, container, false);
        atras = view.findViewById(R.id.img_recover_back);
        correo = view.findViewById(R.id.et_recover_email);
        nombreCuenta = view.findViewById(R.id.et_recover_account_name);
        enviar = view.findViewById(R.id.b_recover);
        info = view.findViewById(R.id.label_recover_info);

        atras.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                LoginFragment loginFragment = new LoginFragment();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.login,loginFragment)
                        .addToBackStack(null).commit();
            }
        });

        enviar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                recuperar = new Recuperar(info, correo.getText().toString(), nombreCuenta.getText().toString());
                Thread thread = new Thread() {
                    public void run() {
                        Looper.prepare();
                        boolean iniciarRecuperacion = recuperar.iniciarRecuperacion();
                        if(iniciarRecuperacion){
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
