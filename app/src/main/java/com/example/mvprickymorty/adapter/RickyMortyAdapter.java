package com.example.mvprickymorty.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.mvprickymorty.R;
import com.example.mvprickymorty.modelos.InformacionRespuesta;
import com.example.mvprickymorty.modelos.CharactersRickyMorty;

import java.util.ArrayList;

public class RickyMortyAdapter extends RecyclerView.Adapter<RickyMortyAdapter.ViewHolder> {

    ArrayList<CharactersRickyMorty> listRickyMortyAdapter;
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
        holder.textView.setText(listRickyMortyAdapter.get(position).getName());
        holder.textView2.setText(listRickyMortyAdapter.get(position).getGender());
        Glide.with(context)
                .load(listRickyMortyAdapter.get(position).getImage())
                .placeholder(R.drawable.ic_android_black_24dp)
                .into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return listRickyMortyAdapter.size();
    }



    public void setAdicion(InformacionRespuesta modelosRickyMortyArrayList) {
        this.listRickyMortyAdapter= modelosRickyMortyArrayList.getResults();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        TextView textView2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView= itemView.findViewById(R.id.textView3);
            textView2 = itemView.findViewById(R.id.textView4);
        }
    }
}
