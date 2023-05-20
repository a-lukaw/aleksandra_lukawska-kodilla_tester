package com.kodilla.optional.homework;

import com.kodilla.stream.User;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ForumStatsTestSuite {

    @Test
    public void testCalculateAvgPostsNumberMoreThan40() {
        // given
        List<User> testUsers = createTestUsers();
        ForumStats forumStats = new ForumStats();

        // when
        double result = forumStats.calculateAvgPostsNumberMoreThan40(testUsers);

        // then
        Assert.assertEquals(13.5, result, 0.001);
    }

    @Test
    public void testCalculateAvgPostsNumberUnder40() {
        // given
        List<User> testUsers = createTestUsers();
        ForumStats forumStats = new ForumStats();

        // when
        double result = forumStats.calculateAvgPostsNumberUnder40(testUsers);

        // then
        Assert.assertEquals(7.5, result, 0.001);
    }

    private List<User> createTestUsers() {
        User user1 = new User("John", 25, 5, "Chemists");
        User user2 = new User("Jane", 28, 10, "Chemists");
        User user3 = new User("David", 35, 15, "Security");
        User user4 = new User("Alice", 40, 20, "Board");
        User user5 = new User("Mark", 27, 7, "Manager");

        return Arrays.asList(user1, user2, user3, user4, user5);
    }
}
