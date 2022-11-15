package com.example.gestor_incidencies;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NovaIncidencia extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nova_incidencia);

        Button btnEnvia = findViewById(R.id.ni_enviar);
        btnEnvia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Model model = new Model();
                Incidencia inc = new Incidencia();

                EditText nom = findViewById(R.id.ni_usuari);
                EditText element = findViewById(R.id.ni_element);
                EditText ubicacio = findViewById(R.id.ni_ubicacio);
                EditText descripcio = findViewById(R.id.ni_descripcio);
                EditText data = findViewById(R.id.ni_data);

                inc.setNom(nom.getText().toString());
                inc.setElement(element.getText().toString());
                inc.setUbicacio(ubicacio.getText().toString());
                inc.setDescripcio(descripcio.getText().toString());
                inc.setData(data.getText().toString());

                int insert = model.insertaIncidencia(NovaIncidencia.this, inc);
                if (insert==1){
                    Toast.makeText(NovaIncidencia.this, "OK", Toast.LENGTH_SHORT).show();
                }if (insert==0){
                    Toast.makeText(NovaIncidencia.this, "NO S'HA INSERIT L'INCIDENCIA", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
