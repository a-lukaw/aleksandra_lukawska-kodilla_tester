package com.kodilla.collections.adv.exercises.homework;

//Zad. 5.4. Lista lotów

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {

        List<Flight> flights = new ArrayList<>();

        flights.add(new Flight("Gdańsk", "Keflavik"));
        flights.add(new Flight("Warsaw", "Barcelona"));
        flights.add(new Flight("Keflavik", "Poznań"));
        flights.add(new Flight("Barcelona", "Warsaw"));
        flights.add(new Flight("Warsaw", "Rome"));

        return flights;
    }
}
