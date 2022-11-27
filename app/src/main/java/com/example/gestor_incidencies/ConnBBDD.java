package com.example.gestor_incidencies;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ConnBBDD extends SQLiteOpenHelper {

    public ConnBBDD(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context,name,factory,version);
    }

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "incidencies";
    private static final String CREATE_TABLE = "CREATE TABLE tickets(id INTEGER PRIMARY KEY AUTOINCREMENT, nom TEXT, element TEXT, tipus_element TEXT, ubicacio TEXT, descripcio TEXT, data DATE, resolt BOOLEAN)";

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL(CREATE_TABLE);
        }catch(Exception e){
            System.out.println(e);
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase ddbb, int i, int i1) {
        ddbb.execSQL("DROP TABLE tickets");
        ddbb.execSQL(CREATE_TABLE);
    }
}