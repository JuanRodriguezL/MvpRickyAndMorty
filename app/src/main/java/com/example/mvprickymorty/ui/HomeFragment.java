package com.example.mvprickymorty.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvprickymorty.R;
import com.example.mvprickymorty.adapter.RickyMortyAdapter;
import com.example.mvprickymorty.interfaces.OnclickListener;
import com.example.mvprickymorty.interfaces.personajes.ImvpCharacters;
import com.example.mvprickymorty.modelos.CharactersRickyMorty;
import com.example.mvprickymorty.modelos.InformacionCharacters;
import com.example.mvprickymorty.presenter.RickyMortyPresenter;

import java.util.ArrayList;


public class HomeFragment extends Fragment implements ImvpCharacters.View {
    RecyclerView recyclerView;
    ImvpCharacters.Presenter presenter;
    RickyMortyAdapter rickyMortyAdapter;
    private ImageView imageViewNext;
    private ImageView imageViewPrev;
    private int nextPrevious = 1;


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* presenter = new RickyMortyPresenter(this);
        presenter.consultarListaPersonajes(nextPrevious);*/
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter = new RickyMortyPresenter(this);
        presenter.consultarListaPersonajes(nextPrevious);
        recyclerView = view.findViewById(R.id.recyclerhomeP);
        imageViewNext = view.findViewById(R.id.imageView3);
        imageViewNext.setOnClickListener(v -> {
            nextPrevious++;
            presenter.consultarListaPersonajes(nextPrevious);
        });

        imageViewPrev = view.findViewById(R.id.imageView2);
        imageViewPrev.setOnClickListener(v -> {
            nextPrevious--;
            presenter.consultarListaPersonajes(nextPrevious);
        });
        rickyMortyAdapter = new RickyMortyAdapter(getContext());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void ShowRecyclerV(InformacionCharacters modelosRickyMortyArrayList) {
        rickyMortyAdapter.setAdicion(modelosRickyMortyArrayList);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.setAdapter(rickyMortyAdapter);
    }
}