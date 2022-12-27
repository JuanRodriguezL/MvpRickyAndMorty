package com.example.mvprickymorty.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mvprickymorty.MainActivity;
import com.example.mvprickymorty.R;
import com.example.mvprickymorty.adapter.LocationAdapter;
import com.example.mvprickymorty.interfaces.location.ImvpLocation;
import com.example.mvprickymorty.modelos.InformationLocation;
import com.example.mvprickymorty.presenter.LocationPresenter;


public class LocationFragment extends Fragment implements ImvpLocation.View {

    ImvpLocation.Presenter presenter;
    RecyclerView recyclerViewL;
    LocationAdapter locationadapter;

    public LocationFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      /*  presenter = new LocationPresenter(this);
        presenter.consultarListaLocation();*/

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter = new LocationPresenter(this);
        presenter.consultarListaLocation();
        recyclerViewL = view.findViewById(R.id.recyclerLocation);
        locationadapter = new LocationAdapter(getContext());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      View view = inflater.inflate(R.layout.fragment_location, container, false);
        return  view;
    }

    @Override
    public void ShowRecyclerVLocation(InformationLocation locationRickyMortyArrayList) {
        locationadapter.setAdicion(locationRickyMortyArrayList);
        recyclerViewL.setLayoutManager(new GridLayoutManager(getContext(),1));
        recyclerViewL.setAdapter(locationadapter);

    }
}