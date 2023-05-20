//Zad. 6.3
//utwórz klasę ForumStats, a w niej dwie metody zwracające średnią liczbę postów dla użytkowników z dwóch grup wiekowych oraz metodę main, która wyświetli wyniki metod na konsoli

package com.kodilla.optional.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;


public class ForumStats {
    public double calculateAvgPostsNumberMoreThan40(List<User> users) {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
    }

    public double calculateAvgPostsNumberUnder40(List<User> users) {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
    }

    public static void main(String[] args) {
        ForumStats forumStats = new ForumStats();

        double averagePostsMoreThan40 = forumStats.calculateAvgPostsNumberMoreThan40();
        double averagePostsUnder40 = forumStats.calculateAvgPostsNumberUnder40();

        System.out.println("Average number of posts for users aged 40 and above: " + averagePostsMoreThan40);
        System.out.println("Average number of posts for users under 40: " + averagePostsUnder40);
    }
}