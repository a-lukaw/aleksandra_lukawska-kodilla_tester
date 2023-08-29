//Zad. 6.5. testy zamówień

package com.kodilla.exception.homework;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {

    @Test
    public void testGetOrder_withException() {
        //given
        Warehouse warehouse = new Warehouse();

        //when
        //then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("27"));
    }
}