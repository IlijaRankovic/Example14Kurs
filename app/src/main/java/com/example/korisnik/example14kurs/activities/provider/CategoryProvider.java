package com.example.korisnik.example14kurs.activities.provider;

import com.example.korisnik.example14kurs.activities.model.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Korisnik on 11.5.2017..
 */

public class CategoryProvider {

    public static List<Category> getCategories() {

        List<Category> categories = new ArrayList<>();
        categories.add(new Category(0, "Rostilj"));
        categories.add(new Category(1, "Pecenje"));
        categories.add(new Category(2, "Kuvano"));
        return categories;
    }

    public static List<String> getCategoryNaziv() {
        List<String> naziv = new ArrayList<>();
        naziv.add("Rostilj");
        naziv.add("Pecenje");
        naziv.add("Kuvano");
        return naziv;
    }

    public static Category getCategoryById(int id) {
        switch (id) {
            case 0:
                return new Category(0, "Rostilj");
            case 1:
                return new Category(1, "Pecenje");
            case 2:
                return new Category(2, "Kuvano");
            default:
                return null;
        }
    }
}
