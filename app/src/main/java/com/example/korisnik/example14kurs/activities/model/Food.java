package com.example.korisnik.example14kurs.activities.model;

/**
 * Created by Korisnik on 11.5.2017..
 */

public class Food {

    private int id;
    private String image;
    private String naziv;
    private String opis;
    private float kalorijskaVrednost;
    private float cena;

    public Food() {}

    public Food(String image, String naziv, String opis, float kalorijskaVrednost, float cena){

        this.image = image;
        this.naziv = naziv;
        this.opis = opis;
        this.kalorijskaVrednost = kalorijskaVrednost;
        this.cena = cena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public float getKalorijskaVrednost() {
        return kalorijskaVrednost;
    }

    public void setKalorijskaVrednost(float kalorijskaVrednost) {
        this.kalorijskaVrednost = kalorijskaVrednost;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Food(Id: " + id + ", image: " + image + ", naziv: " + naziv + ", opis: " + opis +
                ", kalorijska vrednost: " + kalorijskaVrednost + ", cena: " + cena + ')';
    }
}