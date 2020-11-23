package com.example.survapp.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.example.survapp.R;
import com.example.survapp.models.Usuario;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FollowAdapter extends RecyclerView.Adapter<FollowAdapter.ViewHolder>{

    List<Usuario> follows;
    private int layout;
    private Activity activity;
    private OnItemClickListener listener;

    public FollowAdapter(List<Usuario> follows, int layout, Activity activity, OnItemClickListener listener) {
        this.follows = follows;
        this.layout = layout;
        this.activity = activity;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(layout,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Usuario follow = follows.get(position);
        try{
            holder.nombre.setText(follow.getNombre());
            elegirAvatar(follow,holder);
            holder.option.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(follow,v);
                }
            });

        }catch (NullPointerException e){
            System.out.println("Error en parsear follow");
        }
    }

    public void elegirAvatar(Usuario usuario,ViewHolder holder){

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
        if(follows==null)
            return 0;
        return follows.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        LinearLayout linearLayout;
        TextView nombre;
        ImageView avatar;
        ImageView option;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            linearLayout = itemView.findViewById(R.id.follow);
            nombre = itemView.findViewById(R.id.name_account_follow);
            avatar = itemView.findViewById(R.id.avatar_follow);
            option = itemView.findViewById(R.id.options_follow);
        }
    }

    public interface OnItemClickListener{
        void onItemClick(Usuario usuario, View v);
    }
}
