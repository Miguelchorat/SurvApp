package com.example.survapp.fragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

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
import com.example.survapp.models.Comentario;
import com.example.survapp.models.Denuncia;
import com.example.survapp.models.Idea;
import com.example.survapp.util.ConexionServidor;
import com.example.survapp.util.Protocolo;
import com.example.survapp.viewmodels.HomeViewModel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DialogComentarioFragment extends DialogFragment {

    private Gson gson;
    private Protocolo protocolo;
    private HomeViewModel model;
    private EditText descripcion;
    private TextView info_descripcion;
    private View view;
    private Idea idea;

    public DialogComentarioFragment() {
        this.gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
    }

    public DialogComentarioFragment(Idea idea) {
        this.gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
        this.idea = idea;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = requireActivity().getLayoutInflater();
        model = new ViewModelProvider(requireActivity()).get(HomeViewModel.class);
        view = inflater.inflate(R.layout.fragment_dialog_comentario, null);
        descripcion = view.findViewById(R.id.comment_description);
        info_descripcion = view.findViewById(R.id.comment_description_info);

        builder.setView(view)
                .setPositiveButton(R.string.sent, new DialogInterface.OnClickListener() {
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
                                limpiarCampos();
                                if(comprobarCampos()) {
                                    Looper.prepare();
                                    ConexionServidor.getSalida().writeInt(protocolo.ALTA_COMENTARIO);
                                    Date fecha_alta = Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());
                                    Comentario comentario = new Comentario(0,descripcion.getText().toString(),fecha_alta,model.getUsuario().getValue());
                                    ConexionServidor.getSalida().writeUTF(gson.toJson(comentario));
                                    ConexionServidor.getSalida().writeUTF(gson.toJson(idea));
                                    d.dismiss();
                                    Looper.myLooper().quit();
                                }
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

    public void limpiarCampos(){
        info_descripcion.setText(getResources().getString(R.string.description));
        info_descripcion.setTextColor(getResources().getColor(R.color.colorPrimary));
    }

    public boolean comprobarCampos(){
        boolean comprobacion = false;
        if(descripcion.getText().toString().length()==0){
            info_descripcion.setText(getResources().getString(R.string.description)+" - "+getResources().getString(R.string.description_empty));
            info_descripcion.setTextColor(getResources().getColor(R.color.red));
        }
        else if(descripcion.getText().toString().length()<3){
            info_descripcion.setText(getResources().getString(R.string.description)+" - "+getResources().getString(R.string.description_short));
            info_descripcion.setTextColor(getResources().getColor(R.color.red));
        }
        else
            comprobacion = true;

        return comprobacion;
    }
}