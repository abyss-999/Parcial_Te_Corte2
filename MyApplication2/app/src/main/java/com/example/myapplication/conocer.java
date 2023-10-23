package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class conocer extends AppCompatActivity {

    private TextView info1;
    private TextView info2;
    private TextView info3;
    private TextView info4;
    private Button agregar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conocer);

        info1 = findViewById(R.id.info1);
        info2 = findViewById(R.id.info2);
        info3 = findViewById(R.id.info3);
        info4 = findViewById(R.id.info4);
        agregar2 = findViewById(R.id.agregar2);

        info1.setText("Nicol Sebastian y santiago");
        info2.setText("18,18,19");
        info3.setText("3 bellacos en busca de algo serio");
        info4.setText("Desarrollo de software");

        agregar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento1 = new Intent(conocer.this, Agregar.class);
                intento1.putExtra("mensaje", "Agregado exitosamente");
                startActivity(intento1);
            }
        });
    }
}
