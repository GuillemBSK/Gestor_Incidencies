package com.example.gestor_incidencies;

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

        Button nova_incidencia_btn = (Button) findViewById(R.id.main_nova_inci);
        nova_incidencia_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), NovaIncidencia.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }

    public void btnView(View v){
        Intent intent = new Intent(MainActivity.this, LlistaIncidencies.class);
        startActivity(intent);
    }

    public void btnViewResoltes(View v){
        Intent intent = new Intent(MainActivity.this, LlistaIncidenciesResoltes.class);
        startActivity(intent);
    }
}