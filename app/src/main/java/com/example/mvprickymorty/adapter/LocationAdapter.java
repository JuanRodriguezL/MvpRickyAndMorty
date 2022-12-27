package com.example.mvprickymorty.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvprickymorty.R;
import com.example.mvprickymorty.modelos.InformationLocation;
import com.example.mvprickymorty.modelos.Location;

import java.util.ArrayList;

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.ViewHolder> {

    ArrayList<Location> locationArrayListAdapter;
    Context context;

    public LocationAdapter(Context context) {
        this.context = context;
        this.locationArrayListAdapter = new ArrayList<>();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlocation, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tipo.setText(locationArrayListAdapter.get(position).getType());
        holder.nombre.setText(locationArrayListAdapter.get(position).getName());
        holder.dimensions.setText(locationArrayListAdapter.get(position).getDimension());
    }

    @Override
    public int getItemCount() {
        return locationArrayListAdapter.size();
    }

    public void setAdicion(InformationLocation locationRickyMortyArrayList) {
        locationArrayListAdapter = locationRickyMortyArrayList.getResults();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tipo;
        TextView nombre;
        TextView dimensions;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tipo = itemView.findViewById(R.id.locationRec);
            nombre = itemView.findViewById(R.id.locationRec2);
            dimensions = itemView.findViewById(R.id.locationRec3);
        }
    }
}
