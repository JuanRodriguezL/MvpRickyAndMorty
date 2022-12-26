package com.example.mvprickymorty.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvprickymorty.R;
import com.example.mvprickymorty.modelos.Episodes;
import com.example.mvprickymorty.modelos.InformacionCharacters;
import com.example.mvprickymorty.modelos.InformacionEpisodes;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class EpisodesAdapter extends RecyclerView.Adapter<EpisodesAdapter.ViewHolder> {

    ArrayList<Episodes> informacionEpisodesArrayList;
    Context context;

    public EpisodesAdapter(Context context) {
        this.context = context;
        this.informacionEpisodesArrayList = new ArrayList<>();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemepisode,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textViewcap.setText(new StringBuilder().append(informacionEpisodesArrayList.get(position)
                .getId()).append(". ").append(informacionEpisodesArrayList.get(position).getName()).toString());
        holder.textViewcap2.setText(informacionEpisodesArrayList.get(position).getAir_date());
        holder.textViewcap3.setText(informacionEpisodesArrayList.get(position).getEpisode());


    }

    public void setAdicion(InformacionEpisodes informacionEpisodes) {
        this.informacionEpisodesArrayList = informacionEpisodes.getResults();

    }


    @Override
    public int getItemCount() {
        return informacionEpisodesArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewcap;
        TextView textViewcap2;
        TextView textViewcap3;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewcap = itemView.findViewById(R.id.episode);
            textViewcap2 = itemView.findViewById(R.id.episode2);
            textViewcap3 = itemView.findViewById(R.id.episode3);
        }
    }
}
