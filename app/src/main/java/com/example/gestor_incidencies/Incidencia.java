package com.example.gestor_incidencies;

public class Incidencia {

    private String nom;
    private String element;
    private String tipus_element;
    private String ubicacio;
    private String descripcio;
    private String data;
    private Boolean resolt;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getUbicacio() {
        return ubicacio;
    }

    public void setUbicacio(String ubicacio) {
        this.ubicacio = ubicacio;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean getResolt() { return resolt;}

    public void setResolt(Boolean resolt) { this.resolt = resolt; }

    public String getTipus_element() { return tipus_element;}

    public void setTipus_element(String tipus_element) { this.tipus_element = tipus_element; }


}
