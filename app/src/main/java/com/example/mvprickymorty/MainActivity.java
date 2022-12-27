package com.example.mvprickymorty;


import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.mvprickymorty.ui.CapitulosFragment;
import com.example.mvprickymorty.ui.HomeFragment;
import com.example.mvprickymorty.ui.LocationFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView navigation = findViewById(R.id.navigationOption);
        navigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.personajesf:
                        replaceFragment(new HomeFragment());
                        break;
                    case R.id.capitulosf:
                        replaceFragment(new CapitulosFragment());
                        break;
                    case R.id.locationesf:
                        replaceFragment(new LocationFragment());
                        break;

            }

                return true;
            }
        });


    }

    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment).addToBackStack(null).commit();
    }

}