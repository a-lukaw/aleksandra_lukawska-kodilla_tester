package com.kodilla.UserManager;

//Zad. 6.1. Lista zadań

import com.kodilla.stream.UsersManager;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersManagerFilterChemistsTestSuite {

    @Test
    public void testFilerChemists() {

        //when
        List<String> chemistUsernames = UsersManager.filterChemistGroupUsernames();

        //then
        List<String> expectedUsernames = Arrays.asList("Walter White", "Gale Boetticher");

        assertEquals(expectedUsernames, chemistUsernames);
        assertEquals(2, chemistUsernames.size());
    }
}