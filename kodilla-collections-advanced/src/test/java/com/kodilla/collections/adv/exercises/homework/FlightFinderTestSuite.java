package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    @Test
    public void testFindFlightsFrom() {

        //given
        String departure = "Warsaw";
        FlightFinder flightFinder = new FlightFinder(FlightRepository.getFlightsTable());
        FlightFinder flightFinder2 = new FlightFinder(new ArrayList<>());

        //when
        List<Flight> flightsFromWarsaw = flightFinder.findFlightsFrom(departure);

        //then
        assertEquals(2, flightsFromWarsaw.size());                                               //oczekuje się, że zwrócona z metody liczba lotów z Warszawy będzie równa 2

        assertEquals("Barcelona", flightsFromWarsaw.get(0).getArrival());
        assertEquals("Rome", flightsFromWarsaw.get(1).getArrival());                       //porównywane są miasta wylotu i przybycia dla poszczególnych lotów

        assertEquals("Warsaw", flightsFromWarsaw.get(0).getDeparture());
        assertEquals("Warsaw", flightsFromWarsaw.get(1).getDeparture());
    }

    @Test
    public void testFindFlightsTo() {
        //given                                                                                         //dane wejściowe
        String arrival = "Barcelona";
        FlightFinder flightFinder = new FlightFinder(FlightRepository.getFlightsTable());

        //when                                                                                       //akcja - wywołanie metody
        List<Flight> flightsToBarcelona = flightFinder.findFlightsTo(arrival);

        //then                                                                                      //asercje; oczekiwane wyniki
        assertEquals(1, flightsToBarcelona.size());

        assertEquals("Barcelona", flightsToBarcelona.get(0).getArrival());               //oczekuje się, że miasto wylotu dla drugiego lotu w liście będzie równa "Barcelona"
     }
}