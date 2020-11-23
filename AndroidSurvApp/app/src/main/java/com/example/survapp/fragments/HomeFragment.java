package com.example.survapp.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

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
import com.example.survapp.models.Login;
import com.example.survapp.models.Usuario;
import com.example.survapp.viewmodels.HomeViewModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class HomeFragment extends Fragment {


    private ImageView menu;
    private TextView nombreUsuario;
    private ImageView avatar;
    private TextView date;
    private HomeViewModel model;
    private PopupMenu popup;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        menu = view.findViewById(R.id.option_menu_home);
        nombreUsuario = view.findViewById(R.id.name_account_profile);
        avatar = view.findViewById(R.id.avatar_profile);
        date = view.findViewById(R.id.date_profile);

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

        return view;
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
                login.cerrarSesion(model.getUsuario().getValue());
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
