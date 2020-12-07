package com.example.survapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.example.survapp.R;
import com.example.survapp.models.Idea;
import com.example.survapp.models.Usuario;
import com.example.survapp.viewmodels.HomeViewModel;
import com.example.survapp.viewmodels.IdeaViewModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class ResponderIdeaAmigoFragment extends Fragment {

    private LinearLayout ideaLayout;
    private TextView titulo;
    private TextView descripcion;
    private TextView respuesta1;
    private TextView respuesta2;
    private TextView respuesta3;
    private TextView respuesta4;
    private TextView tema;
    private TextView creador;
    private FloatingActionButton fab_comentario;
    private HomeViewModel modelHome;
    private IdeaViewModel modelIdea;
    private Idea idea;
    private ImageView back;
    private Usuario follow;

    public ResponderIdeaAmigoFragment() {

    }

    public ResponderIdeaAmigoFragment(Idea idea, Usuario follow) {
        this.idea=idea;
        this.follow=follow;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_responder_idea_amigo, container, false);

        back = view.findViewById(R.id.back_send_idea_friend);
        ideaLayout = view.findViewById(R.id.idea_Layout_friend);
        titulo = view.findViewById(R.id.idea_title_friend);
        descripcion = view.findViewById(R.id.idea_description_friend);
        respuesta1 = view.findViewById(R.id.idea_answer_1_friend);
        respuesta2 = view.findViewById(R.id.idea_answer_2_friend);
        respuesta3 = view.findViewById(R.id.idea_answer_3_friend);
        respuesta4 = view.findViewById(R.id.idea_answer_4_friend);
        fab_comentario = view.findViewById(R.id.fab_add_comment_friend);
        tema = view.findViewById(R.id.idea_theme_friend);
        creador = view.findViewById(R.id.idea_creator_friend);
        modelHome = new ViewModelProvider(requireActivity()).get(HomeViewModel.class);
        modelIdea = new ViewModelProvider(requireActivity()).get(IdeaViewModel.class);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opcionAtras();
            }
        });

        fab_comentario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mandarComentario();
            }
        });

        respuesta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                modelIdea.mandarRespuesta(modelHome.getUsuario().getValue(),idea.getRespuestas().get(0));
                opcionAtras();
            }
        });
        respuesta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                modelIdea.mandarRespuesta(modelHome.getUsuario().getValue(),idea.getRespuestas().get(1));
                opcionAtras();
            }
        });
        respuesta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                modelIdea.mandarRespuesta(modelHome.getUsuario().getValue(),idea.getRespuestas().get(2));
                opcionAtras();
            }
        });
        respuesta4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                modelIdea.mandarRespuesta(modelHome.getUsuario().getValue(),idea.getRespuestas().get(3));
                opcionAtras();
            }
        });
        cargarDatos();
        return view;
    }

    public void cargarDatos(){
        if(idea!=null){
            respuesta3.setVisibility(View.INVISIBLE);
            respuesta4.setVisibility(View.INVISIBLE);
            ideaLayout.setVisibility(View.VISIBLE);
            fab_comentario.setVisibility(View.VISIBLE);
            titulo.setText(idea.getTitulo());
            descripcion.setText(idea.getDescripcion());
            creador.setText(getResources().getString(R.string.creator) +" " + idea.getUsuario().getNombre());
            tema.setText(getResources().getString(R.string.theme) +" " + idea.getTema().getNombre());

            respuesta1.setText(idea.getRespuestas().get(0).getDescripcion());
            respuesta2.setText(idea.getRespuestas().get(1).getDescripcion());

            switch (idea.getRespuestas().size()) {
                case 4:
                    respuesta4.setText(idea.getRespuestas().get(3).getDescripcion());
                    respuesta4.setVisibility(View.VISIBLE);
                case 3:
                    respuesta3.setText(idea.getRespuestas().get(2).getDescripcion());
                    respuesta3.setVisibility(View.VISIBLE);
            }
        }else{
            ideaLayout.setVisibility(View.GONE);
            fab_comentario.setVisibility(View.GONE);
        }

    }

    public void mandarComentario(){
        DialogComentarioFragment dialog = new DialogComentarioFragment(idea);
        dialog.show(getActivity().getSupportFragmentManager(), "DialogComentarioFragment");
    }

    private void opcionAtras(){
        IdeasAmigoFragment fr= new IdeasAmigoFragment(follow);
        FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
        ft.addToBackStack(null);
        ft.replace(R.id.fragment_social, fr);
        ft.commit();
    }
}