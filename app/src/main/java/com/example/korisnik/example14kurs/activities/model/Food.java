package com.example.korisnik.example14kurs.activities.model;

import java.util.ArrayList;
import java.util.List;

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
    private Category category;
    private List<Sastojci> sastojciList;

    public Food() {
        sastojciList = new ArrayList<>();
    }

    public Food(int id, String image, String naziv, String opis, float kalorijskaVrednost, float cena, Category category){

        this.id = id;
        this.image = image;
        this.naziv = naziv;
        this.opis = opis;
        this.kalorijskaVrednost = kalorijskaVrednost;
        this.cena = cena;
        this.category = category;
        sastojciList = new ArrayList<>();
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

    public Category getCategory(){
        return category;
    }

    public void setCategory(Category category){
        this.category = category;
    }

    public List<Sastojci> getSastojciList(){
        return sastojciList;
    }

    public void setSastojciList(List<Sastojci> sastojciList){
        this.sastojciList = sastojciList;
    }

    @Override
    public String toString() { return naziv;}
}
