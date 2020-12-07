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
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.example.survapp.R;
import com.example.survapp.adapter.IdeaAdapter;
import com.example.survapp.models.Idea;
import com.example.survapp.models.Usuario;
import com.example.survapp.util.ConexionServidor;
import com.example.survapp.util.Protocolo;
import com.example.survapp.viewmodels.HomeViewModel;
import com.example.survapp.viewmodels.SocialViewModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.List;

public class IdeasAmigoFragment extends Fragment {

    private TextView nombreUsuario;
    private ImageView avatar;
    private TextView date;
    private HomeViewModel model;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private IdeaAdapter adapter;
    public TextView emptyView;
    public TextView ideasTotal;
    private ImageView back;
    private Usuario usuario;
    private Protocolo protocolo;
    private Gson gson;

    public IdeasAmigoFragment() {
        this.gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
    }

    public IdeasAmigoFragment(Usuario usuario) {
        this.usuario = usuario;
        this.gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ideas_amigo, container, false);

        model = new ViewModelProvider(requireActivity()).get(HomeViewModel.class);
        back = view.findViewById(R.id.back_send_friend);
        nombreUsuario = view.findViewById(R.id.name_account_profile_friend);
        avatar = view.findViewById(R.id.avatar_profile_friend);
        date = view.findViewById(R.id.date_profile_friend);
        recyclerView = view.findViewById(R.id.recycler_view_idea_friend);
        emptyView = view.findViewById(R.id.empty_idea_friend);
        ideasTotal = view.findViewById(R.id.idea_total_profile_friend);

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

        nombreUsuario.setText(usuario.getNombre());
        elegirAvatar();
        setIdeas();
        return view;
    }

    public void setIdeas(){
        model.reset(null);
        model.recibirListaIdeas(usuario);
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
        popup.inflate(R.menu.idea_friend_menu);
        popup.show();
        popup.setOnMenuItemClickListener(menuItem -> {
            switch (menuItem.getItemId()) {
                case R.id.friend_idea:
                    verIdea(idea);
                    return true;
                default:
                    return false;
            }
        });
    }

    public void verIdea(Idea idea){
        Thread thread = new Thread() {
            public void run() {
                try {
                    Looper.prepare();
                    ConexionServidor.getSalida().writeInt(protocolo.COMPROBAR_RESPUESTA_USUARIO);
                    ConexionServidor.getSalida().writeUTF(gson.toJson(model.getUsuario().getValue()));
                    ConexionServidor.getSalida().writeUTF(gson.toJson(idea));
                    int result = ConexionServidor.getEntrada().readInt();
                    if(result == Protocolo.COMPROBAR_RESPUESTA_USUARIO_FALLIDO){
                        getActivity().runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast toast =Toast.makeText(getContext(),
                                        R.string.answered_answer, Toast.LENGTH_SHORT);
                                toast.show();
                            }
                        });

                    }else{
                        ResponderIdeaAmigoFragment fr= new ResponderIdeaAmigoFragment(idea,usuario);
                        FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                        ft.addToBackStack(null);
                        ft.replace(R.id.fragment_social, fr);
                        ft.commit();
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

    public void elegirAvatar(){
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

    private void opcionAtras(){
        BottomNavigationView navBar = getActivity().findViewById(R.id.nav_view);
        navBar.setVisibility(View.VISIBLE);
        SocialFragment fr= new SocialFragment();
        FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
        ft.addToBackStack(null);
        ft.replace(R.id.fragment_social, fr);
        ft.commit();
    }
}