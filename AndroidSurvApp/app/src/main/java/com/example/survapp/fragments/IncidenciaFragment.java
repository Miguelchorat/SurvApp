package com.example.survapp.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.survapp.R;
import com.example.survapp.activities.MainActivity;
import com.example.survapp.models.Incidencia;
import com.example.survapp.models.Usuario;
import com.example.survapp.viewmodels.HomeViewModel;
import com.example.survapp.viewmodels.IncidenciaViewModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class IncidenciaFragment extends Fragment {

    private ImageView back;
    private Usuario usuario;
    private FloatingActionButton fab_send;
    private EditText descripcion;
    private EditText titulo;
    private TextView info_titulo;
    private TextView info_descripcion;

    private LinearLayout aux;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_incidencia, container, false);

        back = view.findViewById(R.id.back_send_incident);
        fab_send = view.findViewById(R.id.fab_send_incident);
        descripcion = view.findViewById(R.id.description_incident);
        titulo = view.findViewById(R.id.title_incident);
        info_descripcion = view.findViewById(R.id.incident_description_info);
        info_titulo = view.findViewById(R.id.incident_title_info);
        aux = view.findViewById(R.id.container);
        HomeViewModel model = new ViewModelProvider(requireActivity()).get(HomeViewModel.class);
        usuario = model.getUsuario().getValue();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opcionAtras();
            }
        });

        fab_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                limpiarCampos();
                if(comprobarCampos()){
                    IncidenciaViewModel model = new IncidenciaViewModel();
                    Date fecha_alta = Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());
                    Incidencia incidencia = new Incidencia(0,usuario,null,titulo.getText().toString(),descripcion.getText().toString(),fecha_alta,null);
                    model.setIncidencia(incidencia);
                    model.enviarIncidencia();
                    opcionAtras();
                }
            }
        });

        return view;
    }

    public void limpiar(){
        limpiarCampos();
        titulo.setText("");
        descripcion.setText("");
    }

    public void limpiarCampos(){
        info_titulo.setText(getResources().getString(R.string.title_incident));
        info_titulo.setTextColor(getResources().getColor(R.color.colorPrimary));
        info_descripcion.setText(getResources().getString(R.string.description_incident));
        info_descripcion.setTextColor(getResources().getColor(R.color.colorPrimary));
    }

    private void opcionAtras(){
        BottomNavigationView navBar = getActivity().findViewById(R.id.nav_view);
        navBar.setVisibility(View.VISIBLE);
        HomeFragment fr= new HomeFragment();
        FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
        ft.addToBackStack(null);
        ft.replace(R.id.fragment_home, fr);
        ft.commit();
        limpiar();
    }

    public boolean comprobarCampos(){
        boolean comprobacion = false;

        if(titulo.getText().length()<4){
            info_titulo.setText(getResources().getString(R.string.title_incident)+" - "+getResources().getString(R.string.title_short));
            info_titulo.setTextColor(getResources().getColor(R.color.red));
        }
        else if(titulo.getText().length()==0){
            info_titulo.setText(getResources().getString(R.string.title_incident)+" - "+getResources().getString(R.string.title_empty));
            info_titulo.setTextColor(getResources().getColor(R.color.red));
        }
        else if(descripcion.getText().length()<12){
            info_descripcion.setText(getResources().getString(R.string.description_incident)+" - "+getResources().getString(R.string.description_short));
            info_descripcion.setTextColor(getResources().getColor(R.color.red));
        }
        else if(descripcion.getText().length()==0){
            info_descripcion.setText(getResources().getString(R.string.description_incident)+" - "+getResources().getString(R.string.description_empty));
            info_descripcion.setTextColor(getResources().getColor(R.color.red));
        }
        else {
            comprobacion = true;
        }
        System.out.println(comprobacion);
        return comprobacion;
    }
}