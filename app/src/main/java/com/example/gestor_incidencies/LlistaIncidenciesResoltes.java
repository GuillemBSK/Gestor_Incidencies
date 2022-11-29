package com.example.gestor_incidencies;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LlistaIncidenciesResoltes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.llista_incidencies_resoltes);

        ListView listView = findViewById(R.id.listViewResoltes);
        ArrayList<String> llista = getIncidenciesResoltes();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.llista_item_resoltes,llista);
        listView.setAdapter(adapter);
    }

    @SuppressLint("Range")
    public ArrayList<String> getIncidenciesResoltes(){
        ArrayList<String> llista = new ArrayList<>();
        ConnBBDD conn = new ConnBBDD(this,"incidencies",null,1);
        SQLiteDatabase db = conn.getWritableDatabase();

        Cursor cursor = db.query("tickets",
                null,
                "resolt=='true'",
                null,
                null,
                null,
                null);

        while(cursor.moveToNext()){
            llista.add("__________________________________________");
            llista.add("\uD83C\uDD94: "+cursor.getString(cursor.getColumnIndex("id")));
            llista.add("\uD83E\uDDCD: "+cursor.getString(cursor.getColumnIndex("nom")));
            llista.add("📅: "+cursor.getString(cursor.getColumnIndex("data")));
            llista.add("\uD83D\uDCCD: "+cursor.getString(cursor.getColumnIndex("ubicacio")));
            llista.add("Element: "+cursor.getString(cursor.getColumnIndex("element")));
            llista.add("Tipus d'element: "+cursor.getString(cursor.getColumnIndex("tipus_element")));
            llista.add("\uD83D\uDCAC: "+cursor.getString(cursor.getColumnIndex("descripcio")));
        }

        return llista;
    }
}