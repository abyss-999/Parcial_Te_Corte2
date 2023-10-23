package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Agregar extends AppCompatActivity {

    private TextView mensaje_agregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);
        mensaje_agregar = findViewById(R.id.mensaje_agregar);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("mensaje")) {
            String mensaje = intent.getStringExtra("mensaje");
            mensaje_agregar.setText(mensaje);
        }
    }
}
