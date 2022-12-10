package com.example.mvprickymorty.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvprickymorty.R;
import com.example.mvprickymorty.modelos.InformacionRespuesta;
import com.example.mvprickymorty.modelos.ModelosRickyMorty;

import java.util.ArrayList;

public class RickyMortyAdapter extends RecyclerView.Adapter<RickyMortyAdapter.ViewHolder> {

    ArrayList<ModelosRickyMorty> listRickyMortyAdapter;
    Context context;


    public RickyMortyAdapter(Context context) {
        this.context = context;
        this.listRickyMortyAdapter = new ArrayList<>();
    }

    @NonNull
    @Override
    public RickyMortyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemhome, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RickyMortyAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return listRickyMortyAdapter.size();
    }



    public void setAdicion(InformacionRespuesta modelosRickyMortyArrayList) {
        this.listRickyMortyAdapter= modelosRickyMortyArrayList.getResults();

        modelosRickyMortyArrayList.getResults().get(listRickyMortyAdapter.indexOf(1)).getName();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
