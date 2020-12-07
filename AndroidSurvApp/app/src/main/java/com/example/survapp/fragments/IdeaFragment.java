package com.example.survapp.fragments;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.example.survapp.R;
import com.example.survapp.activities.MainActivity;
import com.example.survapp.models.Idea;
import com.example.survapp.models.Respuesta;
import com.example.survapp.viewmodels.HomeViewModel;
import com.example.survapp.viewmodels.IdeaViewModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class IdeaFragment extends Fragment {

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
    private TextView emptyView;
    private ImageView option;
    private PopupMenu popup;
    private HomeViewModel modelHome;
    private IdeaViewModel modelIdea;


    public IdeaFragment(){
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_idea, container, false);


        ideaLayout = view.findViewById(R.id.idea_Layout);
        titulo = view.findViewById(R.id.idea_title);
        descripcion = view.findViewById(R.id.idea_description);
        respuesta1 = view.findViewById(R.id.idea_answer_1);
        respuesta2 = view.findViewById(R.id.idea_answer_2);
        respuesta3 = view.findViewById(R.id.idea_answer_3);
        respuesta4 = view.findViewById(R.id.idea_answer_4);
        fab_comentario = view.findViewById(R.id.fab_add_comment);
        emptyView = view.findViewById(R.id.empty_idea);
        option = view.findViewById(R.id.option_menu_idea);
        tema = view.findViewById(R.id.idea_theme);
        creador = view.findViewById(R.id.idea_creator);
        modelHome = new ViewModelProvider(requireActivity()).get(HomeViewModel.class);
        modelIdea = new ViewModelProvider(requireActivity()).get(IdeaViewModel.class);

        MainActivity main = (MainActivity)getActivity();
        if(!main.getIniciar()) {
            modelIdea.recibirIdea(modelHome.getUsuario().getValue());
            main.setIniciar(true);
        }

        fab_comentario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mandarComentario();
            }
        });

        respuesta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                modelIdea.mandarRespuesta(modelHome.getUsuario().getValue(),modelIdea.getIdea().getValue().getRespuestas().get(0));
            }
        });
        respuesta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                modelIdea.mandarRespuesta(modelHome.getUsuario().getValue(),modelIdea.getIdea().getValue().getRespuestas().get(1));
            }
        });
        respuesta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                modelIdea.mandarRespuesta(modelHome.getUsuario().getValue(),modelIdea.getIdea().getValue().getRespuestas().get(2));
            }
        });
        respuesta4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                modelIdea.mandarRespuesta(modelHome.getUsuario().getValue(),modelIdea.getIdea().getValue().getRespuestas().get(3));
            }
        });


        option.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                popup = new PopupMenu(getContext(), view);
                popup.inflate(R.menu.idea_menu);
                popup.show();
                popup.setOnMenuItemClickListener(menuItem -> {
                    switch (menuItem.getItemId()) {
                        case R.id.report_idea:
                            if(emptyView.getVisibility()!=View.VISIBLE) {
                                denunciarIdea();
                            }
                            return true;
                        case R.id.skip_idea:
                            saltarIdea();
                            return true;
                        default:
                            return false;
                    }
                });
            }
        });

        modelIdea.getIdea().observe(getViewLifecycleOwner(),  i -> {
            cargarDatos();
        });

        return view;
    }

    public void cargarDatos(){
        Idea i = modelIdea.getIdea().getValue();

        if(i!=null){
            respuesta3.setVisibility(View.INVISIBLE);
            respuesta4.setVisibility(View.INVISIBLE);
            ideaLayout.setVisibility(View.VISIBLE);
            fab_comentario.setVisibility(View.VISIBLE);
            emptyView.setVisibility(View.GONE);
            titulo.setText(i.getTitulo());
            descripcion.setText(i.getDescripcion());
            creador.setText(getResources().getString(R.string.creator) +" " + i.getUsuario().getNombre());
            tema.setText(getResources().getString(R.string.theme) +" " + i.getTema().getNombre());

            respuesta1.setText(i.getRespuestas().get(0).getDescripcion());
            respuesta2.setText(i.getRespuestas().get(1).getDescripcion());

            switch (i.getRespuestas().size()) {
                case 4:
                    respuesta4.setText(i.getRespuestas().get(3).getDescripcion());
                    respuesta4.setVisibility(View.VISIBLE);
                case 3:
                    respuesta3.setText(i.getRespuestas().get(2).getDescripcion());
                    respuesta3.setVisibility(View.VISIBLE);
            }
        }else{
            ideaLayout.setVisibility(View.GONE);
            fab_comentario.setVisibility(View.GONE);
            emptyView.setVisibility(View.VISIBLE);
        }

    }

    public void denunciarIdea(){
        Idea i = modelIdea.getIdea().getValue();
        DialogDenunciarFragment dialog = new DialogDenunciarFragment(i);
        dialog.show(getActivity().getSupportFragmentManager(), "DialogDenunciarFragment");
    }

    public void saltarIdea(){
        modelIdea.recibirIdea(modelHome.getUsuario().getValue());
    }

    public void mandarComentario(){
        Idea i = modelIdea.getIdea().getValue();
        DialogComentarioFragment dialog = new DialogComentarioFragment(i);
        dialog.show(getActivity().getSupportFragmentManager(), "DialogComentarioFragment");
    }
}
