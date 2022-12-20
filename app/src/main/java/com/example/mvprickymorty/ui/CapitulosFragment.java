package com.example.mvprickymorty.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mvprickymorty.MainActivity;
import com.example.mvprickymorty.R;
import com.example.mvprickymorty.adapter.RickyMortyAdapter;
import com.example.mvprickymorty.interfaces.personajes.ImvpCharacters;

public class CapitulosFragment extends Fragment {

    public CapitulosFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_capitulos, container, false);
    }
}