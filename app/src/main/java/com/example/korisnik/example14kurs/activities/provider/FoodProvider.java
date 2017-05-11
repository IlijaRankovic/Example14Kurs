package com.example.korisnik.example14kurs.activities.provider;

import com.example.korisnik.example14kurs.activities.model.Category;
import com.example.korisnik.example14kurs.activities.model.Food;
import com.example.korisnik.example14kurs.activities.model.Sastojci;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Korisnik on 11.5.2017..
 */

public class FoodProvider {

    public static List<Food> getFoods() {

        Category rostilj = new Category(0, "Rostilj");
        Category pecenje = new Category(1, "Pecenje");
        Category kuvano = new Category(2, "Kuvano");


        List<Food> foods = new ArrayList<>();
        foods.add(new Food(0, "pljeskavica.jpg", "Pljeskavica", "Mleveno meso fino zacinjeno, oblikovano u krug i peceno na rostilju.", 200.0f, 300.0f, rostilj));
        foods.add(new Food(1, "jagnjetina.jpg", "Jagnjetina", "Veoma ukusno meso, peceno na raznju, to je jedan od Balanskih specijaliteta.", 250.0f, 1000.0f, pecenje));
        foods.add(new Food(2, "corba.jpg", "Corba", "Kuvano jelo, ima vise vrsta corbi, medju napoznatijim je Ragu teleca corba.", 100.0f, 150.0f, kuvano));
        return foods;
    }


    public static List<String> getFoodNaziv() {
        List<String> naziv = new ArrayList<>();
        naziv.add("Pljeskavica");
        naziv.add("Jagnjetina");
        naziv.add("Corba");
        return naziv;
    }

    public static Food getFoodById(int id) {

        Category rostilj = new Category(0, "Rostilj");
        Category pecenje = new Category(1, "Pecenje");
        Category kuvano = new Category(2, "Kuvano");

        switch (id) {
            case 0:
                return new Food(0, "pljeskavica.jpg", "Pljeskavica", "Mleveno meso fino zacinjeno, oblikovano u krug i peceno na rostilju.", 200.0f, 300.0f, rostilj);
            case 1:
                return new Food(1, "jagnjetina.jpg", "Jagnjetina", "Veoma ukusno meso, peceno na raznju, to je jedan od Balanskih specijaliteta.", 250.0f, 1000.0f, pecenje);
            case 2:
                return new Food(2, "corba.jpg", "Corba", "Kuvano jelo, ima vise vrsta corbi, medju napoznatijim je Ragu teleca corba.", 100.0f, 150.0f, kuvano);
            default:
                return null;
        }
    }
}
