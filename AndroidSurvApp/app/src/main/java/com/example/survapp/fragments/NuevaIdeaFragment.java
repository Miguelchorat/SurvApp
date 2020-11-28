package com.example.survapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.survapp.R;
import com.example.survapp.models.Idea;
import com.example.survapp.models.Respuesta;
import com.example.survapp.models.Tema;
import com.example.survapp.models.Usuario;
import com.example.survapp.util.TemaIdea;
import com.example.survapp.util.TipoAvatar;
import com.example.survapp.viewmodels.HomeViewModel;
import com.example.survapp.viewmodels.ModificarUsuarioViewModel;
import com.example.survapp.viewmodels.NuevaIdeaViewModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.security.MessageDigest;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class NuevaIdeaFragment extends Fragment {

    private ImageView back;
    private FloatingActionButton fab_send;
    private EditText titulo;
    private TextView info_titulo;
    private EditText descripcion;
    private TextView info_descripcion;
    private EditText respuesta1;
    private TextView info_respuesta1;
    private EditText respuesta2;
    private TextView info_respuesta2;
    private EditText respuesta3;
    private TextView info_respuesta3;
    private EditText respuesta4;
    private TextView info_respuesta4;
    private Spinner spinnerTema;
    private TextView info_tema;
    private Usuario usuario;

    public NuevaIdeaFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nueva_idea, container, false);

        back = view.findViewById(R.id.back_send_new_idea);
        fab_send = view.findViewById(R.id.fab_send_new_idea);
        titulo = view.findViewById(R.id.et_new_idea_title);
        info_titulo = view.findViewById(R.id.new_idea_title);
        descripcion = view.findViewById(R.id.et_new_idea_description);
        info_descripcion = view.findViewById(R.id.new_idea_description);
        respuesta1 = view.findViewById(R.id.et_new_idea_answer_1);
        respuesta2 = view.findViewById(R.id.et_new_idea_answer_2);
        respuesta3 = view.findViewById(R.id.et_new_idea_answer_3);
        respuesta4 = view.findViewById(R.id.et_new_idea_answer_4);
        info_respuesta1 = view.findViewById(R.id.new_idea_answer_1);
        info_respuesta2 = view.findViewById(R.id.new_idea_answer_2);
        info_respuesta3 = view.findViewById(R.id.new_idea_answer_3);
        info_respuesta4 = view.findViewById(R.id.new_idea_answer_4);
        spinnerTema = view.findViewById(R.id.new_idea_spinner_theme);
        info_tema = view.findViewById(R.id.new_idea_theme);

        HomeViewModel model = new ViewModelProvider(requireActivity()).get(HomeViewModel.class);
        usuario = model.getUsuario().getValue();
        cargarDatos();

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
                    NuevaIdeaViewModel model1 = new NuevaIdeaViewModel();
                    Tema tema = new Tema(spinnerTema.getSelectedItemPosition()+1,TemaIdea.values()[spinnerTema.getSelectedItemPosition()].name());
                    Date fecha_alta = Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());
                    Idea idea = new Idea(0,titulo.getText().toString(),descripcion.getText().toString(),
                            fecha_alta,tema,usuario);

                    List<Respuesta> respuestas = new ArrayList<>();
                    respuestas.add(new Respuesta(0,respuesta1.getText().toString()));
                    respuestas.add(new Respuesta(0,respuesta2.getText().toString()));

                    if(respuesta3.getText().toString().length()!=0)
                        respuestas.add(new Respuesta(0,respuesta3.getText().toString()));
                    if(respuesta4.getText().toString().length()!=0)
                        respuestas.add(new Respuesta(0,respuesta4.getText().toString()));

                    idea.setRespuestas(respuestas);
                    model1.setIdea(idea);
                    model1.enviarIdea();
                    opcionAtras();
                }
            }
        });

        return view;
    }

    public void cargarDatos(){
        List<TemaIdea> ideas = new ArrayList<TemaIdea>();
        for(TemaIdea i : TemaIdea.values()){
            ideas.add(i);
        }
        ArrayAdapter<TemaIdea> comboAdapter = new ArrayAdapter<TemaIdea>(getContext(),android.R.layout.simple_spinner_item, ideas);
        spinnerTema.setAdapter(comboAdapter);
        spinnerTema.setSelection(0);
    }

    public boolean comprobarCampos(){
        boolean comprobacion = false;
        if(titulo.getText().toString().length()==0){
            info_titulo.setText(getResources().getString(R.string.title)+" - "+getResources().getString(R.string.title_empty));
            info_titulo.setTextColor(getResources().getColor(R.color.red));
        }
        else if(titulo.getText().toString().length()<3){
            info_titulo.setText(getResources().getString(R.string.title)+" - "+getResources().getString(R.string.title_short));
            info_titulo.setTextColor(getResources().getColor(R.color.red));
        }
        if(descripcion.getText().toString().length()==0){
            info_descripcion.setText(getResources().getString(R.string.description)+" - "+getResources().getString(R.string.description_empty));
            info_descripcion.setTextColor(getResources().getColor(R.color.red));
        }
        else if(descripcion.getText().toString().length()<3){
            info_descripcion.setText(getResources().getString(R.string.description)+" - "+getResources().getString(R.string.description_short));
            info_descripcion.setTextColor(getResources().getColor(R.color.red));
        }
        if(respuesta1.getText().toString().length()==0){
            info_respuesta1.setText(getResources().getString(R.string.answer_1)+" - "+getResources().getString(R.string.description_empty));
            info_respuesta1.setTextColor(getResources().getColor(R.color.red));
        }
        if(respuesta2.getText().toString().length()==0){
            info_respuesta2.setText(getResources().getString(R.string.answer_2)+" - "+getResources().getString(R.string.description_empty));
            info_respuesta2.setTextColor(getResources().getColor(R.color.red));
        }
        else
            comprobacion = true;

        return comprobacion;
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

    public void limpiar(){
        limpiarCampos();
        titulo.setText("");
        descripcion.setText("");
        respuesta1.setText("");
        respuesta2.setText("");
        respuesta3.setText("");
        respuesta4.setText("");
        spinnerTema.setSelection(0);
    }

    public void limpiarCampos(){
        info_titulo.setText(getResources().getString(R.string.title));
        info_titulo.setTextColor(getResources().getColor(R.color.colorPrimary));
        info_descripcion.setText(getResources().getString(R.string.description));
        info_descripcion.setTextColor(getResources().getColor(R.color.colorPrimary));
        info_respuesta1.setText(getResources().getString(R.string.answer_1));
        info_respuesta1.setTextColor(getResources().getColor(R.color.colorPrimary));
        info_respuesta2.setText(getResources().getString(R.string.answer_2));
        info_respuesta2.setTextColor(getResources().getColor(R.color.colorPrimary));
    }
}