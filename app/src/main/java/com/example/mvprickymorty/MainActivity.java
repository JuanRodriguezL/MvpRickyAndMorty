package com.example.mvprickymorty;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mvprickymorty.ui.CapitulosActivity;
import com.example.mvprickymorty.ui.HomePersonajesActivity;
import com.example.mvprickymorty.ui.LocationActivity;

public class MainActivity extends AppCompatActivity {
    Button button;
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= findViewById(R.id.buttonPerson);
        button1= findViewById(R.id.buttonCapitulos);
        button2= findViewById(R.id.buttonUbicaciones);

        button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, HomePersonajesActivity.class);
            startActivity(intent);
        });

        button1.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this, CapitulosActivity.class);
            startActivity(intent);

        });

        button2.setOnClickListener(v-> {
            Intent intent = new Intent(MainActivity.this, LocationActivity.class);
            startActivity(intent);
        });
    }

}