package com.example.korisnik.example14kurs.activities.model;

/**
 * Created by Korisnik on 11.5.2017..
 */

public class Sastojci {

    private int id;
    private String naziv;

    public Sastojci(){}

    public Sastojci(String naziv){

        this.naziv = naziv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
}
