package com.example.mvprickymorty.presenter;

import com.example.mvprickymorty.interfaces.location.ImvpLocation;
import com.example.mvprickymorty.modelos.InformationLocation;

public class LocationPresenter implements ImvpLocation.Presenter {
    ImvpLocation.View viewLocation;
    ImvpLocation.Model modelL;

    @Override
    public void ShowRecyclerPLocation(InformationLocation locationRickyMortyArrayList) {
        if (viewLocation!=null){
            viewLocation.ShowRecyclerVLocation(locationRickyMortyArrayList);
        }
    }

    @Override
    public void consultarListaLocation() {
        if (modelL!=null){
            modelL.consultarListaLocation();
        }
    }
}
