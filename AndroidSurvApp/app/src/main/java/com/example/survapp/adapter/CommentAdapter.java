package com.example.survapp.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.survapp.R;
import com.example.survapp.models.Comentario;
import com.example.survapp.models.Usuario;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.ViewHolder>{

    List<Comentario> comentarios;
    private int layout;
    private Activity activity;

    public CommentAdapter(List<Comentario> comentarios, int layout, Activity activity) {
        this.comentarios = comentarios;
        this.layout = layout;
        this.activity = activity;
    }

    @NonNull
    @Override
    public CommentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(layout,parent,false);
        CommentAdapter.ViewHolder viewHolder = new CommentAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CommentAdapter.ViewHolder holder, int position) {
        final Comentario comentario = comentarios.get(position);
        try{
            holder.nombre.setText(comentario.getUsuario().getNombre());
            elegirAvatar(comentario.getUsuario(),holder);
            holder.description.setText(comentario.getDescripcion());
        }catch (NullPointerException e){
            System.out.println("Error en parsear comment");
        }
    }

    public void elegirAvatar(Usuario usuario, CommentAdapter.ViewHolder holder){

        switch (usuario.getAvatar()){
            case 0:
                holder.avatar.setImageResource(R.drawable.avatar0);
                break;
            case 1:
                holder.avatar.setImageResource(R.drawable.avatar1);
                break;
            case 2:
                holder.avatar.setImageResource(R.drawable.avatar2);
                break;
            case 3:
                holder.avatar.setImageResource(R.drawable.avatar3);
                break;
        }
    }

    @Override
    public int getItemCount() {
        if(comentarios==null)
            return 0;
        return comentarios.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        LinearLayout linearLayout;
        TextView nombre;
        ImageView avatar;
        TextView description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            linearLayout = itemView.findViewById(R.id.comment);
            nombre = itemView.findViewById(R.id.name_account_comment);
            avatar = itemView.findViewById(R.id.avatar_comment);
            description = itemView.findViewById(R.id.description_comment);
        }
    }
}

