package com.example.survapp.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.survapp.R;
import com.example.survapp.models.Idea;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class IdeaAdapter extends RecyclerView.Adapter<IdeaAdapter.ViewHolder>{

    List<Idea> ideas;
    private int layout;
    private Activity activity;
    private IdeaAdapter.OnItemClickListener listener;

    public IdeaAdapter(List<Idea> ideas, int layout, Activity activity, IdeaAdapter.OnItemClickListener listener) {
        this.ideas = ideas;
        this.layout = layout;
        this.activity = activity;
        this.listener = listener;
    }

    @NonNull
    @Override
    public IdeaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(layout,parent,false);
        IdeaAdapter.ViewHolder viewHolder = new IdeaAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Idea idea = ideas.get(position);
        try{
            holder.titulo.setText(idea.getTitulo());
            holder.option.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(idea,v);
                }
            });

        }catch (NullPointerException e){
            System.out.println("Error en parsear idea");
        }
    }

    @Override
    public int getItemCount() {
        if(ideas==null)
            return 0;
        return ideas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        LinearLayout linearLayout;
        TextView titulo;
        ImageView option;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            linearLayout = itemView.findViewById(R.id.idea_row);
            titulo = itemView.findViewById(R.id.title_idea_row);
            option = itemView.findViewById(R.id.options_idea_row);
        }
    }

    public interface OnItemClickListener{
        void onItemClick(Idea idea, View v);
    }

}
