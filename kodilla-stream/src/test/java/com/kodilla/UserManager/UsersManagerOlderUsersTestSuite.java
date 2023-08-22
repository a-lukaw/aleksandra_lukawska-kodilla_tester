package com.kodilla.UserManager;

//Zad. 6.1. Lista zadań

import com.kodilla.stream.UsersManager;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersManagerOlderUsersTestSuite {

    @Test
    public void testFilterOlderUsers() {

        //given
        List<String> users = UsersManager.filterUsersOlderThan();

        //when
        List<String> expectedUsernames = Arrays.asList("Walter White", "Gus Firing", "Gale Boetticher", "Mike Ehrmantraut");

        //then
        assertEquals(expectedUsernames, users);
        assertEquals(4, users.size());
    }
}