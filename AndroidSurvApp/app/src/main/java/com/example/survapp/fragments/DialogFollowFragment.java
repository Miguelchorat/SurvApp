package com.example.survapp.fragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.survapp.R;
import com.example.survapp.activities.LoginActivity;
import com.example.survapp.models.Usuario;
import com.example.survapp.util.ConexionServidor;
import com.example.survapp.util.Protocolo;
import com.example.survapp.viewmodels.HomeViewModel;
import com.example.survapp.viewmodels.SocialViewModel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.SocketException;
import java.util.List;


public class DialogFollowFragment extends DialogFragment {

    private Gson gson;
    private Protocolo protocolo;
    private HomeViewModel model;
    private EditText nombreUsuario;
    private TextView info;
    private View view;

    public DialogFollowFragment() {
        this.gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = requireActivity().getLayoutInflater();
        model = new ViewModelProvider(requireActivity()).get(HomeViewModel.class);
        view = inflater.inflate(R.layout.fragment_dialog_follow, null);
        nombreUsuario = view.findViewById(R.id.follow_user);
        info = view.findViewById(R.id.info_follow);

        builder.setView(view)
                .setPositiveButton(R.string.add_follow, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {

                    }
                })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                       dialog.dismiss();
                    }
                });

        return builder.create();
    }

    @Override
    public void onResume() {
        super.onResume();
        final AlertDialog d = (AlertDialog)getDialog();
        if(d != null)
        {
            Button positiveButton = (Button) d.getButton(Dialog.BUTTON_POSITIVE);
            positiveButton.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Thread thread = new Thread() {
                        public void run() {
                            try {

                                Looper.prepare();
                                ConexionServidor.getSalida().writeInt(protocolo.AÑADIR_SEGUIDOR);
                                ConexionServidor.getSalida().writeUTF(gson.toJson(model.getUsuario().getValue()));
                                ConexionServidor.getSalida().writeUTF(gson.toJson(new Usuario(nombreUsuario.getText().toString())));
                                int result = ConexionServidor.getEntrada().readInt();
                                if (model.getUsuario().getValue().getNombre().equals(nombreUsuario.getText().toString())) {
                                    getActivity().runOnUiThread(new Runnable() {
                                        @Override
                                        public void run() {
                                            info.setText(getResources().getString(R.string.account_name) + " - No te puedes seguir a ti mismo");
                                            info.setTextColor(getResources().getColor(R.color.red));
                                        }
                                    });
                                } else if (result == Protocolo.AÑADIR_SEGUIDOR_NO_EXISTE) {
                                    getActivity().runOnUiThread(new Runnable() {
                                        @Override
                                        public void run() {
                                            seguidorNoExiste();
                                        }
                                    });
                                } else if (result == Protocolo.AÑADIR_SEGUIDOR_FALLIDO) {
                                    getActivity().runOnUiThread(new Runnable() {
                                        @Override
                                        public void run() {
                                            seguidorFallido();
                                        }
                                    });
                                } else {
                                    SocialViewModel model1 = new ViewModelProvider(requireActivity()).get(SocialViewModel.class);
                                    model1.recibirListaSeguidos(model.getUsuario().getValue());
                                    d.dismiss();
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
            });
        }
    }

    public void seguidorNoExiste(){
        info.setText(getResources().getString(R.string.account_name) + " - " + getResources().getString(R.string.error_follow_user));
        info.setTextColor(getResources().getColor(R.color.red));
    }

    public void seguidorFallido(){
        info.setText(getResources().getString(R.string.account_name) + " - " + getResources().getString(R.string.fail_follow_user));
        info.setTextColor(getResources().getColor(R.color.red));
    }
}