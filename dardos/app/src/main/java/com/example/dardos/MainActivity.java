package com.example.dardos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Método para cambiar de activity

    public void cambiarActivity301(View view){
        Intent cambioActivity = new Intent(this, Juego.class);
        cambioActivity.putExtra("dato","301");
        startActivity(cambioActivity);
    }

    public void cambiarActivity501(View view){
        Intent cambioActivity = new Intent(this, Juego.class);
        cambioActivity.putExtra("dato","501");
        startActivity(cambioActivity);
    }

    public void cambiarActivity701(View view){
        Intent cambioActivity = new Intent(this, Juego.class);
        cambioActivity.putExtra("dato","701");
        startActivity(cambioActivity);
    }

}
