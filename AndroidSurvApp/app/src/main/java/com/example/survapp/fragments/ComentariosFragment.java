package com.example.survapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.survapp.R;
import com.example.survapp.adapter.CommentAdapter;
import com.example.survapp.adapter.FollowAdapter;
import com.example.survapp.adapter.IdeaAdapter;
import com.example.survapp.models.Comentario;
import com.example.survapp.models.Idea;
import com.example.survapp.models.Usuario;
import com.example.survapp.util.ConexionServidor;
import com.example.survapp.util.Protocolo;
import com.example.survapp.viewmodels.HomeViewModel;
import com.example.survapp.viewmodels.SocialViewModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.List;


public class ComentariosFragment extends Fragment {

    private RecyclerView recyclerView;
    public TextView emptyView;
    private RecyclerView.LayoutManager layoutManager;
    private CommentAdapter adapter;
    private ImageView back;

    private Idea idea;
    private HomeViewModel model;

    public ComentariosFragment() {
    }

    public ComentariosFragment(Idea idea) {
        this.idea = idea;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_comentarios, container, false);

        model = new ViewModelProvider(requireActivity()).get(HomeViewModel.class);
        back = view.findViewById(R.id.back_send_stat_comment);
        recyclerView = view.findViewById(R.id.recycler_view_comment);
        emptyView = view.findViewById(R.id.empty_comment);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(20);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opcionAtras();
            }
        });

        setComments();
        return view;
    }

    public void setComments(){
        model.listarComentarios(idea);
        model.getComentarios().observe(requireActivity(),c -> {
            List<Comentario> comentarios = model.getComentarios().getValue();
            if(comentarios==null || comentarios.size()==0){
                emptyView.setVisibility(View.VISIBLE);
                recyclerView.setVisibility(View.GONE);
            } else{
                adapter = new CommentAdapter(comentarios, R.layout.comment_row, getActivity());
                recyclerView.setAdapter(adapter);
                emptyView.setVisibility(View.GONE);
                recyclerView.setVisibility(View.VISIBLE);
            }
        });
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
}