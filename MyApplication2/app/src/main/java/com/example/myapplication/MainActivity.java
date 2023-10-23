package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button agregar;
    private Button conocer;
    private TextView mensaje_agregar;
    private TextView informacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        agregar = findViewById(R.id.agregar);
        conocer = findViewById(R.id.conocer);
        mensaje_agregar = findViewById(R.id.mensaje_agregar);
        informacion = findViewById(R.id.informacion);


        informacion.setText("Nicol Sebastian y santiago 3 chicos bastante serios y en busca de algo bonito");

        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento1 = new Intent(MainActivity.this, Agregar.class);
                intento1.putExtra("mensaje", "Agregado exitosamente");
                startActivity(intento1);
            }
        });

        conocer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento2 = new Intent(MainActivity.this, conocer.class);
                startActivity(intento2);
            }
        });
    }
}


