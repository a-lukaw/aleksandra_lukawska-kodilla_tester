package com.kodilla.optional.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ForumStatsTest {
    @Test
    void avgMethodUnder40DontAcceptNull() {
        //given
        List<User> users = null;

        //then
        Assertions.assertThrowsExactly(
                RuntimeException.class,
                () -> ForumStats.getAvgNoOfPostsUnder40(users),
                "User nie może być nullem"
        );
    }

    @Test
    void avgMethodOver40DontAcceptNull() {
        //given
        List<User> users = null;

        //then
        Assertions.assertThrowsExactly(
                RuntimeException.class,
                () -> ForumStats.getAvgNoOfPostsOver40(users),
                "User nie może być nullem"
        );
    }

    @Test
    void isAvgNoOfPostsUnder40Correct() {
        //given
        List<User> users = List.of(
                new User("Ola", 35, 2, "Geologists"),
                new User("Ola", 35, 4, "Geologists"));

        //when
        double avg = ForumStats.getAvgNoOfPostsUnder40(users);

        //then
        Assertions.assertEquals(3, avg);
    }

    @Test
    void isAvgNoOfPostsOver40Correct() {
        //given
        List<User> users = List.of(
                new User("Ola", 45, 5,"Geologists"),
                new User("Ola", 45, 15, "Geologists"));

        //when
        double avg = ForumStats.getAvgNoOfPostsOver40(users);

        //then
        Assertions.assertEquals(10, avg);
    }

    @Test
    void isFilterUnder40Correct() {
        //given
        List<User> users = List.of(
                new User("Ola", 40, 2, "Geologists"),
                new User("Ola", 35, 4, "Geologists"));

        //when
        double avg = ForumStats.getAvgNoOfPostsUnder40(users);

        //then
        Assertions.assertEquals(4, avg);
    }

    @Test
    void isFilterOver40Correct() {
        //given
        List<User> users = List.of(
                new User("Ola", 22, 5, "Geologists"),
                new User("Ola", 45, 15, "Geologists"));

        //when
        double avg = ForumStats.getAvgNoOfPostsOver40(users);

        //then
        Assertions.assertEquals(15, avg);
    }

    @Test
    void under40MethodReturns0WhenUsersListIsEmpty() {
        //given
        List<User> users = new ArrayList<>();

        //when
        double avg = ForumStats.getAvgNoOfPostsUnder40(users);

        //then
        Assertions.assertEquals(0, avg);
    }

    @Test
    void over40MethodReturns0WhenUsersListsIsEmpty() {
        //given
        List<User> users = new ArrayList<>();

        //when
        double avg = ForumStats.getAvgNoOfPostsOver40(users);

        //then
        Assertions.assertEquals(0, avg);
    }
}
