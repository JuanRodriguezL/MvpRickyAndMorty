package com.example.mvprickymorty.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.mvprickymorty.R;
import com.example.mvprickymorty.interfaces.OnclickListener;
import com.example.mvprickymorty.modelos.CharactersRickyMorty;
import com.example.mvprickymorty.modelos.InformacionCharacters;
import com.example.mvprickymorty.ui.DialogFragmentPersonajes;

import java.util.ArrayList;

public class RickyMortyAdapter extends RecyclerView.Adapter<RickyMortyAdapter.ViewHolder>  {

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
        holder.imageView.setOnClickListener(v -> {
            FragmentManager fm = ((FragmentActivity) context).getSupportFragmentManager();
            DialogFragmentPersonajes dialogFragmentPersonajes = new DialogFragmentPersonajes(listRickyMortyAdapter.get(position));
            dialogFragmentPersonajes.setCancelable(true);
            dialogFragmentPersonajes.show(fm, "");
        });
    }

    @Override
    public int getItemCount() {
        return listRickyMortyAdapter.size();
    }


    public void setAdicion(InformacionCharacters modelosRickyMortyArrayList) {
        this.listRickyMortyAdapter = modelosRickyMortyArrayList.getResults();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        TextView textView2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView3);
            textView2 = itemView.findViewById(R.id.textView4);
        }
    }
}
