package com.example.puzzle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Victoria extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.victoria);
    }

    public void reiniciar(View view){
        Intent cambioActivity = new Intent(this, MainActivity.class);
        startActivity(cambioActivity);
    }
}
