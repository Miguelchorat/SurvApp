package com.example.survapp.fragments;

import android.media.Image;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.util.Patterns;
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
import com.example.survapp.activities.LoginActivity;
import com.example.survapp.models.Incidencia;
import com.example.survapp.models.Usuario;
import com.example.survapp.util.TipoAvatar;
import com.example.survapp.viewmodels.HomeViewModel;
import com.example.survapp.viewmodels.IncidenciaViewModel;
import com.example.survapp.viewmodels.ModificarUsuarioViewModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.apache.commons.codec.binary.Hex;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ModificarUsuarioFragment extends Fragment {

    private ImageView back;
    private Usuario usuario;
    private FloatingActionButton fab_send;
    private MessageDigest md;
    private EditText accountName;
    private TextView accountName_title;
    private EditText password;
    private TextView password_title;
    private EditText passwordConfirm;
    private EditText email;
    private TextView email_title;
    private Spinner spinnerAvatar;
    private ImageView avatar;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_modificar_usuario, container, false);

        back = view.findViewById(R.id.back_send_modify_user);
        fab_send = view.findViewById(R.id.fab_send_modify_user);
        accountName = view.findViewById(R.id.modify_account_name);
        email = view.findViewById(R.id.modify_email);
        password = view.findViewById(R.id.modify_pass);
        passwordConfirm = view.findViewById(R.id.modify_pass_repeat);
        accountName_title = view.findViewById(R.id.modify_account_name_title);
        password_title = view.findViewById(R.id.modify_pass_title);
        email_title = view.findViewById(R.id.modify_email_title);
        spinnerAvatar = view.findViewById(R.id.spinner_avatar);
        avatar = view.findViewById(R.id.modify_avatar);

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
                    ModificarUsuarioViewModel model1 = new ModificarUsuarioViewModel();
                    String pass = encriptar(password.getText().toString());
                    Usuario usuarioModificado = new Usuario(usuario.getId(),spinnerAvatar.getSelectedItemPosition(),accountName.getText().toString(),pass,email.getText().toString(),0,usuario.getFecha_alta());
                    model1.setUsuarioModificado(usuarioModificado);
                    model1.enviarUsuarioModificado();
                    model.setUsuario(usuarioModificado);
                    opcionAtras();
                }
            }
        });

        return view;
    }

    public void cargarDatos(){
        accountName.setText(usuario.getNombre());
        email.setText(usuario.getCorreo());
        elegirAvatar();
        List<TipoAvatar> avatares = new ArrayList<TipoAvatar>();
        for(TipoAvatar tipoAvatar : TipoAvatar.values()){
            avatares.add(tipoAvatar);
        }
        ArrayAdapter<TipoAvatar> comboAdapter = new ArrayAdapter<TipoAvatar>(getContext(),android.R.layout.simple_spinner_item, avatares);
        spinnerAvatar.setAdapter(comboAdapter);
        spinnerAvatar.setSelection(usuario.getAvatar());

        spinnerAvatar.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
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

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

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
        limpiar();
    }

    public void limpiar(){
        limpiarCampos();
        accountName.setText("");
        email.setText("");
        password.setText("");
        passwordConfirm.setText("");
    }

    public void limpiarCampos(){
        accountName_title.setText(getResources().getString(R.string.account_name));
        accountName_title.setTextColor(getResources().getColor(R.color.colorPrimary));
        email_title.setText(getResources().getString(R.string.email));
        email_title.setTextColor(getResources().getColor(R.color.colorPrimary));
        password_title.setText(getResources().getString(R.string.pass));
        password_title.setTextColor(getResources().getColor(R.color.colorPrimary));
    }

    public boolean comprobarCampos(){
        boolean comprobacion = false;
        if(accountName.getText().toString().length()==0){
            accountName_title.setText(getResources().getString(R.string.account_name)+" - "+getResources().getString(R.string.accountName_empty));
            accountName_title.setTextColor(getResources().getColor(R.color.red));
        }
        else if(accountName.getText().toString().length()<3){
            accountName_title.setText(getResources().getString(R.string.account_name)+" - "+getResources().getString(R.string.accountName_short));
            accountName_title.setTextColor(getResources().getColor(R.color.red));
        }
        else if(!password.getText().toString().equals(passwordConfirm.getText().toString())){
            password_title.setText(getResources().getString(R.string.pass)+" - "+getResources().getString(R.string.password_match));
            password_title.setTextColor(getResources().getColor(R.color.red));
        }
        else if(password.getText().toString().length()<6){
            password_title.setText(getResources().getString(R.string.pass)+" - "+getResources().getString(R.string.password_short));
            password_title.setTextColor(getResources().getColor(R.color.red));
        }
        else if(!comprobarCorreo(email.getText().toString())){
            email_title.setText(getResources().getString(R.string.email)+" - "+getResources().getString(R.string.error_email));
            email_title.setTextColor(getResources().getColor(R.color.red));
        }
        else
            comprobacion = true;

        return comprobacion;
    }

    public boolean comprobarCorreo(String correo){
        if(correo == null)
            return false;
        if(correo.isEmpty() || correo.length()<6){
            return false;
        }
        if(Patterns.EMAIL_ADDRESS.matcher(correo).matches())
            return true;
        return false;
    }

    public String encriptar(String password) {

        String passEncriptada = "";
        try {
            this.md = MessageDigest.getInstance("SHA-512");
            this.md.update(password.getBytes());
            byte[] bytes = md.digest();
            passEncriptada = String.copyValueOf(Hex.encodeHex(bytes));
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(LoginActivity.class.getName()).log(Level.SEVERE, null, ex);
        }
        return passEncriptada;
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
}