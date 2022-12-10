package com.example.mvprickymorty;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mvprickymorty.ui.HomePersonajesActivity;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button= findViewById(R.id.buttonPerson);

        button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, HomePersonajesActivity.class);
            startActivity(intent);
        });

    }


}