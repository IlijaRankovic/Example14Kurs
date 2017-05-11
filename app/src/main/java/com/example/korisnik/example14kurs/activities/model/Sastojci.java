package com.example.korisnik.example14kurs.activities.model;

/**
 * Created by Korisnik on 11.5.2017..
 */

public class Sastojci {

    private int id;
    private String naziv;
    private Food food;

    public Sastojci(){}

    public Sastojci(int id, String naziv, Food food){

        this.id = id;
        this.naziv = naziv;
        this.food = food;
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

    public Food getFood(){
        return food;
    }

    public void setFood(Food food){
        this.food = food;
    }
}
