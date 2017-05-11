package com.example.korisnik.example14kurs.activities.model;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Korisnik on 11.5.2017..
 */

public class Category {

    private int id;
    private String naziv;
    private List<Food> foods;

    public Category(){

        foods = new ArrayList<>();
    }

    public Category(int id, String naziv){

        this.id = id;
        this.naziv = naziv;
        foods = new ArrayList<>();
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

    public void addFood(Food food) {

        foods.add(food);
    }

    public void removeFood(Food food) {

        foods.remove(food);
    }

    public Food getFood(int position) {

        return foods.get(position);
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }
}
