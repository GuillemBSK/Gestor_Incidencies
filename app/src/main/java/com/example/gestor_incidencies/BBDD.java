package com.example.gestor_incidencies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

public class BBDD extends SQLiteOpenHelper {

    public BBDD(Context context){
        super(context, "incidencies", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase ddbb) {
        ddbb.execSQL("CREATE TABLE platos (" + " nom TEXT, " + "element TEXT, tipus TEXT, ubicacio TEXT, descripcio TEXT, data DATE)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase ddbb, int i, int i1) {

    }
}