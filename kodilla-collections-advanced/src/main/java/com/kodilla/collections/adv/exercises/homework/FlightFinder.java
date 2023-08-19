package com.kodilla.collections.adv.exercises.homework;

//Zad. 5.4. Lista lotów

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    private List<Flight> flights;
    public FlightFinder(List<Flight> flights) {
        this.flights = flights;
    }

    public List<Flight> findFlightsFrom(String departure) {                                                      //metody zwracające loty z danego miasta, przyjmując argument String departure (miasto wylotu)
        List<Flight> flightsFrom = new ArrayList<>();

        for (Flight flight : flights) {                                                                                 //przeszukiwanie listy lotów, przekazanej do konstruktora klasy FlightFinder
            if (flight.getDeparture().equals(departure)) {
                flightsFrom.add(flight);
            }                                                                                                           //zwracanie listy lotów, spełniających podane kryteria
        }
        return flightsFrom;
    }

    public List<Flight> findFlightsTo(String arrival) {

        List<Flight> flightsTo = new ArrayList<>();

        for (Flight flight : flights) {
            if (flight.getArrival().equals(arrival)) {
                flightsTo.add(flight);
            }
        }
        return flightsTo;
    }
}