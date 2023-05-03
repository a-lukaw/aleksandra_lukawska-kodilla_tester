package com.kodilla.UserManager;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersManagerFilterChemists;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersManagerFilterChemistsTestSuite {
    @Test
    public void testFilterChemistGroupUsernames() {

        // when
        List<String> chemistUsernames = UsersManagerFilterChemists.filterChemistGroupUsernames();

        // then
        List<String> expectedUsernames = Arrays.asList("Walter White", "Gale Boetticher");
        assertEquals(expectedUsernames, chemistUsernames);
    }
}