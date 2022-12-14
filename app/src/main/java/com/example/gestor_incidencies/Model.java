package com.example.gestor_incidencies;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class Model {

    public SQLiteDatabase getConn(Context context){
        ConnBBDD conn = new ConnBBDD(context,"incidencies",null,1);
        SQLiteDatabase db = conn.getWritableDatabase();
        return db;
    }

    int insertaIncidencia(Context context, Incidencia incidencia){
        int res = 0;
        String query = "INSERT INTO tickets(nom,element,tipus_element,ubicacio,descripcio,data,resolt) VALUES ('"+incidencia.getNom()+"','"+incidencia.getElement()+"','"+incidencia.getTipus_element()+"','"+incidencia.getUbicacio()+"','"+incidencia.getDescripcio()+"','"+incidencia.getData()+"','"+incidencia.getResolt()+"')";
        SQLiteDatabase db = this.getConn(context);
        try{
            db.execSQL(query);
            res = 1;
        }catch(SQLException sqle){
            System.out.println(sqle);
        }
        return res;
    }
}
