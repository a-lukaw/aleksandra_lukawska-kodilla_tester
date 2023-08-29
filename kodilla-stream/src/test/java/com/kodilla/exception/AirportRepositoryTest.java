package com.kodilla.exception;
//6.5. Wyjątki a testy

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AirportRepositoryTest {
    @Test
    public void testIsAirportInUse() throws AirportNotFoundException {
        //given
        AirportRepository airportRepository = new AirportRepository();
        //when
        boolean isWarsawInUse = airportRepository.isAirportInUse("Warsaw");
        //then
        assertTrue(isWarsawInUse);
    }

    //test przypadku, gdy lotniska nie ma w mapie (czy metoda isAirportInUse rzuci wyjątkiem?)
    @Test
    public void testIsAirportInUse_withException() throws AirportNotFoundException {
        //given
        AirportRepository airportRepository = new AirportRepository();

        //when
        //then
        assertThrows(AirportNotFoundException.class, () -> airportRepository.isAirportInUse("Siedlce"));
    }
}