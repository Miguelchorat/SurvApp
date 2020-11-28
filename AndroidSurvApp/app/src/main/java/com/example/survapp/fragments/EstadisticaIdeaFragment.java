package com.example.survapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.survapp.R;
import com.example.survapp.models.Idea;
import com.example.survapp.models.Respuesta;
import com.example.survapp.util.ConexionServidor;
import com.example.survapp.util.Protocolo;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.List;


public class EstadisticaIdeaFragment extends Fragment {

    private ImageView back;
    private Idea idea;
    private TextView respuesta1;
    private TextView respuesta1_votos;
    private TextView respuesta2;
    private TextView respuesta2_votos;
    private TextView respuesta3;
    private TextView respuesta3_votos;
    private TextView respuesta3_title;
    private View respuesta3_separator;
    private LinearLayout respuesta3_linear;
    private TextView respuesta4;
    private TextView respuesta4_votos;
    private TextView respuesta4_title;
    private View respuesta4_separator;
    private LinearLayout respuesta4_linear;
    private TextView titulo;
    private TextView descripcion;
    private Gson gson;
    private Protocolo protocolo;

    public EstadisticaIdeaFragment() {
        this.gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
    }

    public EstadisticaIdeaFragment(Idea idea) {
        this.idea = idea;
        this.gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_estadistica_idea, container, false);

        titulo = view.findViewById(R.id.idea_title_stat);
        descripcion = view.findViewById(R.id.idea_description_stat);
        back = view.findViewById(R.id.back_send_stat_idea);
        respuesta1 = view.findViewById(R.id.idea_answer_1_stat);
        respuesta1_votos = view.findViewById(R.id.vote_1_stat);
        respuesta2 = view.findViewById(R.id.idea_answer_2_stat);
        respuesta2_votos = view.findViewById(R.id.vote_2_stat);
        respuesta3 = view.findViewById(R.id.idea_answer_3_stat);
        respuesta3_votos = view.findViewById(R.id.vote_3_stat);
        respuesta3_title = view.findViewById(R.id.idea_answer_3_stat_title);
        respuesta3_separator = view.findViewById(R.id.idea_answer_3_stat_separator);
        respuesta3_linear = view.findViewById(R.id.idea_answer_3_stat_votes);
        respuesta4 = view.findViewById(R.id.idea_answer_4_stat);
        respuesta4_votos = view.findViewById(R.id.vote_4_stat);
        respuesta4_title = view.findViewById(R.id.idea_answer_4_stat_title);
        respuesta4_separator = view.findViewById(R.id.idea_answer_4_stat_separator);
        respuesta4_linear = view.findViewById(R.id.idea_answer_4_stat_votes);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opcionAtras();
            }
        });
        cargarDatos();
        contarVotos();
        return view;
    }

    public void cargarDatos(){
        titulo.setText(idea.getTitulo());
        descripcion.setText(idea.getDescripcion());

        respuesta1.setText(idea.getRespuestas().get(0).getDescripcion());
        respuesta2.setText(idea.getRespuestas().get(1).getDescripcion());

        switch (idea.getRespuestas().size()){
            case 4:
                respuesta4.setText(idea.getRespuestas().get(3).getDescripcion());
                respuesta4_linear.setVisibility(View.VISIBLE);
                respuesta4_title.setVisibility(View.VISIBLE);
                respuesta4_separator.setVisibility(View.VISIBLE);
                respuesta4.setVisibility(View.VISIBLE);
                respuesta4_votos.setVisibility(View.VISIBLE);
            case 3:
                respuesta3.setText(idea.getRespuestas().get(2).getDescripcion());
                respuesta3_linear.setVisibility(View.VISIBLE);
                respuesta3_title.setVisibility(View.VISIBLE);
                respuesta3_separator.setVisibility(View.VISIBLE);
                respuesta3.setVisibility(View.VISIBLE);
                respuesta3_votos.setVisibility(View.VISIBLE);
        }
    }

    private void opcionAtras(){
        BottomNavigationView navBar = getActivity().findViewById(R.id.nav_view);
        navBar.setVisibility(View.VISIBLE);
        HomeFragment fr= new HomeFragment();
        FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
        ft.addToBackStack(null);
        ft.replace(R.id.fragment_home, fr);
        ft.commit();
    }

    public void contarVotos(){
        Thread thread = new Thread() {
            public void run() {
            try {
                Looper.prepare();
                ConexionServidor.abrirSocket();
                ConexionServidor.getSalida().writeInt(protocolo.CONTAR_RESPUESTAS);
                ConexionServidor.getSalida().writeUTF(gson.toJson(idea));
                TypeToken<List<Integer>> token = new TypeToken<List<Integer>>() {};
                List<Integer> votos;
                votos = gson.fromJson((String)ConexionServidor.getEntrada().readUTF(),token.getType());
                respuesta1_votos.setText(votos.get(0)+"");
                respuesta2_votos.setText(votos.get(1)+"");
                switch (votos.size()){
                    case 4:
                        respuesta4_votos.setText(votos.get(3)+"");
                    case 3:
                        respuesta3_votos.setText(votos.get(2)+"");
                }
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
}