package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList(null, new ArrayList<City>());
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertEquals(1, list.countCities());
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
        assertEquals(0, list.countCities());
    }

}
