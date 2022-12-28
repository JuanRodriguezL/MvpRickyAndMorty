package com.example.mvprickymorty.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.example.mvprickymorty.R;
import com.example.mvprickymorty.interfaces.OnclickListener;
import com.example.mvprickymorty.modelos.CharactersRickyMorty;

import java.util.ArrayList;


public class DialogFragmentPersonajes extends androidx.fragment.app.DialogFragment implements OnclickListener {
    ImageView imageViewFragment;
    CharactersRickyMorty listRickyMortyFragment;
    TextView text1;
    TextView text2;
    TextView text3;


    public DialogFragmentPersonajes(CharactersRickyMorty listRickyMorty) {
        this.listRickyMortyFragment = listRickyMorty;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        imageViewFragment = view.findViewById(R.id.imageView6);
        text1 = view.findViewById(R.id.dialogName);
        text2 = view.findViewById(R.id.dialogstatus);
        text3 = view.findViewById(R.id.dialogSpecie);
        Glide.with(getContext())
                .load(listRickyMortyFragment.getImage())
                .error(R.drawable.ic_android_black_24dp)
                .into(imageViewFragment);
        text1.setText(listRickyMortyFragment.getName());
        text2.setText(listRickyMortyFragment.getStatus());
        text3.setText(listRickyMortyFragment.getSpecies());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dialog, container, false);
    }


    @Override
    public void onClick(ArrayList<CharactersRickyMorty> informacionCharacters) {

    }
}