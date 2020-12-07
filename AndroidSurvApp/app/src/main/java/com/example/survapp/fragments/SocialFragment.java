package com.example.survapp.fragments;

import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.example.survapp.R;
import com.example.survapp.adapter.FollowAdapter;
import com.example.survapp.models.Idea;
import com.example.survapp.models.Login;
import com.example.survapp.models.Usuario;
import com.example.survapp.viewmodels.HomeViewModel;
import com.example.survapp.viewmodels.SocialViewModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class SocialFragment extends Fragment {


    private FloatingActionButton fab_send;
    private RecyclerView recyclerView;
    public TextView emptyView;
    private RecyclerView.LayoutManager layoutManager;
    private FollowAdapter adapter;
    private TextView following;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_social, container, false);

        fab_send = view.findViewById(R.id.fab_add_friend);
        recyclerView = view.findViewById(R.id.recycler_view_follow);
        emptyView = view.findViewById(R.id.empty_social);
        following = view.findViewById(R.id.tv_following);

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(20);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

        fab_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment dialog = new DialogFollowFragment();
                dialog.show(getActivity().getSupportFragmentManager(), "DialogFollowFragment");
            }
        });
        setFollows();
        return view;
    }

    public void setFollows(){
        final SocialViewModel modelFollow = new ViewModelProvider(requireActivity()).get(SocialViewModel.class);
        modelFollow.reset(null);
        HomeViewModel model = new ViewModelProvider(requireActivity()).get(HomeViewModel.class);
        Usuario user = model.getUsuario().getValue();
        modelFollow.recibirListaSeguidos(user);
        modelFollow.getUsuarios().observe(requireActivity(),usuarios -> {
            List<Usuario> follows = modelFollow.getUsuarios().getValue();
            if(follows==null || follows.size()==0){
                emptyView.setVisibility(View.VISIBLE);
                recyclerView.setVisibility(View.GONE);
            } else{
                adapter = new FollowAdapter(follows, R.layout.follow_row, getActivity(), new FollowAdapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(Usuario usuario, View v) {
                        createPopUp(usuario,v);
                    }
                });
                following.setText(follows.size()+"");
                recyclerView.setAdapter(adapter);
                emptyView.setVisibility(View.GONE);
                recyclerView.setVisibility(View.VISIBLE);
            }
        });

    }

    public void ideaAmigo(Usuario usuario){
        BottomNavigationView navBar = getActivity().findViewById(R.id.nav_view);
        navBar.setVisibility(View.GONE);
        IdeasAmigoFragment fr= new IdeasAmigoFragment(usuario);
        FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
        ft.addToBackStack(null);
        ft.replace(R.id.fragment_social, fr);
        ft.commit();
    }

    public void createPopUp(Usuario usuario,View v){
        PopupMenu popup = new PopupMenu(getContext(),v);
        popup.inflate(R.menu.follow_option_menu);
        popup.show();
        popup.setOnMenuItemClickListener(menuItem -> {
            switch (menuItem.getItemId()) {
                case R.id.see_idea_follow:
                    ideaAmigo(usuario);
                    return true;
                case R.id.remove_follow:
                    eliminarSeguidor(usuario);
                    return true;
                default:
                    return false;
            }
        });
    }

    public void eliminarSeguidor(Usuario follow){
        HomeViewModel modelUsuario = new ViewModelProvider(requireActivity()).get(HomeViewModel.class);
        Usuario user = modelUsuario.getUsuario().getValue();
        SocialViewModel modelFollow = new ViewModelProvider(requireActivity()).get(SocialViewModel.class);
        modelFollow.eliminarSeguidor(user,follow);
    }
}
