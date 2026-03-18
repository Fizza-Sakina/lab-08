package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public CustomList(Object o, ArrayList<City> cities) {
        this.cities = cities;
    }

    public void addCity(City city) {
        cities.add(city);
    }
    public boolean hasCity(City city) {
        return cities.contains(city);
    }
    public int countCities() {
        return cities.size();
    }

    public void deleteCity(City city) {
        if (cities.contains(city)) {
            cities.remove(city);
        } else {
            throw new IllegalArgumentException("City not found");
        }
    }


    // Will be implemented later using TDD (leave blank for now)
    // public boolean hasCity(City city) { ... }
}

