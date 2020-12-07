package com.example.survapp.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Looper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.example.survapp.R;
import com.example.survapp.activities.LoginActivity;
import com.example.survapp.adapter.FollowAdapter;
import com.example.survapp.adapter.IdeaAdapter;
import com.example.survapp.models.Idea;
import com.example.survapp.models.Login;
import com.example.survapp.models.Usuario;
import com.example.survapp.viewmodels.HomeViewModel;
import com.example.survapp.viewmodels.ModificarUsuarioViewModel;
import com.example.survapp.viewmodels.SocialViewModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;


public class HomeFragment extends Fragment {


    private ImageView menu;
    private TextView nombreUsuario;
    private ImageView avatar;
    private TextView date;
    private HomeViewModel model;
    private PopupMenu popup;
    private FloatingActionButton fab_send;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private IdeaAdapter adapter;
    public TextView emptyView;
    public TextView ideasTotal;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        menu = view.findViewById(R.id.option_menu_home);
        nombreUsuario = view.findViewById(R.id.name_account_profile);
        avatar = view.findViewById(R.id.avatar_profile);
        date = view.findViewById(R.id.date_profile);
        fab_send = view.findViewById(R.id.fab_add_idea);
        recyclerView = view.findViewById(R.id.recycler_view_idea);
        emptyView = view.findViewById(R.id.empty_idea_home);
        ideasTotal = view.findViewById(R.id.idea_total_profile);

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(20);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

        fab_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendNewIdea();
            }
        });

        menu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                popup = new PopupMenu(getContext(), view);
                popup.inflate(R.menu.fragment_home_menu);
                popup.show();
                popup.setOnMenuItemClickListener(menuItem -> {
                    switch (menuItem.getItemId()) {
                        case R.id.modify_profile:
                            modifyProfile();
                            return true;
                        case R.id.send_incident:
                            sendIncident();
                            return true;
                        case R.id.log_out:
                            logOut();
                            return true;
                        default:
                            return false;
                    }
                });
            }
        });
        model = new ViewModelProvider(requireActivity()).get(HomeViewModel.class);
        model.getUsuario().observe(getViewLifecycleOwner(),  usuario -> {
            nombreUsuario.setText(model.getUsuario().getValue().getNombre());
            elegirAvatar(usuario);
            //cambiarFecha(usuario);
        });
        setIdeas();
        return view;
    }

    public void setIdeas(){
        model.reset(null);
        Usuario user = model.getUsuario().getValue();
        model.recibirListaIdeas();
        model.getIdeas().observe(requireActivity(),idea -> {
            List<Idea> ideas = model.getIdeas().getValue();
            if(ideas==null || ideas.size()==0){
                emptyView.setVisibility(View.VISIBLE);
                recyclerView.setVisibility(View.GONE);
            } else{
                adapter = new IdeaAdapter(ideas, R.layout.idea_row, getActivity(), new IdeaAdapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(Idea idea, View v) {
                        createPopUp(idea,v);
                    }
                });
                ideasTotal.setText(ideas.size()+"");
                recyclerView.setAdapter(adapter);
                emptyView.setVisibility(View.GONE);
                recyclerView.setVisibility(View.VISIBLE);
            }
        });
    }

    public void createPopUp(Idea idea,View v){
        PopupMenu popup = new PopupMenu(getContext(),v);
        popup.inflate(R.menu.idea_option_menu);
        popup.show();
        popup.setOnMenuItemClickListener(menuItem -> {
            switch (menuItem.getItemId()) {
                case R.id.stat_idea:
                    statIdea(idea);
                    return true;
                case R.id.comment_idea:
                    comentarioIdea(idea);
                    return true;
                case R.id.remove_idea:
                    eliminarIdea(idea);
                    return true;
                default:
                    return false;
            }
        });
    }

    public void comentarioIdea(Idea idea){
        BottomNavigationView navBar = getActivity().findViewById(R.id.nav_view);
        navBar.setVisibility(View.GONE);
        ComentariosFragment fr= new ComentariosFragment(idea);
        FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
        ft.addToBackStack(null);
        ft.replace(R.id.fragment_home, fr);
        ft.commit();
    }

    public void statIdea(Idea idea){
        BottomNavigationView navBar = getActivity().findViewById(R.id.nav_view);
        navBar.setVisibility(View.GONE);
        EstadisticaIdeaFragment fr= new EstadisticaIdeaFragment(idea);
        FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
        ft.addToBackStack(null);
        ft.replace(R.id.fragment_home, fr);
        ft.commit();
    }

    public void eliminarIdea(Idea idea){
        model.eliminarIdea(idea);
    }

    public void modifyProfile() {
        BottomNavigationView navBar = getActivity().findViewById(R.id.nav_view);
        navBar.setVisibility(View.GONE);
        ModificarUsuarioFragment fr= new ModificarUsuarioFragment();
        FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
        ft.addToBackStack(null);
        ft.replace(R.id.fragment_home, fr);
        ft.commit();
    }

    public void sendIncident() {
        BottomNavigationView navBar = getActivity().findViewById(R.id.nav_view);
        navBar.setVisibility(View.GONE);
        IncidenciaFragment fr= new IncidenciaFragment();
        FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
        ft.addToBackStack(null);
        ft.replace(R.id.fragment_home, fr);
        ft.commit();
    }

    public void sendNewIdea() {
        BottomNavigationView navBar = getActivity().findViewById(R.id.nav_view);
        navBar.setVisibility(View.GONE);
        NuevaIdeaFragment fr= new NuevaIdeaFragment();
        FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
        ft.addToBackStack(null);
        ft.replace(R.id.fragment_home, fr);
        ft.commit();
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.fragment_home_menu, menu);
    }


    public void logOut() {
        Intent intentMain = new Intent(getActivity(), LoginActivity.class);
        Thread thread = new Thread() {
            public void run() {
                Looper.prepare();
                Login login = new Login();
                login.cerrarSesion();
                Looper.myLooper().quit();
            }
        };
        thread.start();
        startActivity(intentMain);
    }

    public void elegirAvatar(Usuario usuario){

        switch (usuario.getAvatar()){
            case 0:
                avatar.setImageResource(R.drawable.avatar0);
                break;
            case 1:
                avatar.setImageResource(R.drawable.avatar1);
                break;
            case 2:
                avatar.setImageResource(R.drawable.avatar2);
                break;
            case 3:
                avatar.setImageResource(R.drawable.avatar3);
                break;
        }
    }

    public void cambiarFecha(Usuario usuario){

    }
}
