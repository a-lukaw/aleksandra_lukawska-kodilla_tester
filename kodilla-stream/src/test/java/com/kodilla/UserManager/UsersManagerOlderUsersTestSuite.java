package com.kodilla.UserManager;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersManagerFilterOlderUsers;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersManagerOlderUsersTestSuite {


    @Test
    public void testGetOlderUsers() {

        //given
        List<String> expectedUsernames = Arrays.asList("Walter White", "Mike Ehrmantraut");

        //when
        List<String> olderUsers = UsersManagerFilterOlderUsers.filterOlderUsers();

        //then
        assertEquals(expectedUsernames, olderUsers);
    }
}