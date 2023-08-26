//Zad. 6.3
//utwórz klasę ForumStats, a w niej dwie metody zwracające średnią liczbę postów dla użytkowników z dwóch grup wiekowych oraz metodę main, która wyświetli wyniki metod na konsoli
//W obu metodach uruchom Stream na kolekcji użytkowników zwracanej przez UsersRepository. Przekaż ją jako argument metody (ułatwi to proces testowania).
// W pierwszej metodzie napisz Stream tak, aby obliczył średnią liczbę postów dla użytkowników, których wiek jest >= 40.
// Natomiast kolejny Stream, który obliczy średnią liczbę postów dla użytkowników mających wiek < 40.

package com.kodilla.optional.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {

    public static double getAvgNoOfPostsUnder40(List<User> users) {
        if (users == null) {
            throw new RuntimeException("User nie może być nullem");
        }

        return users.stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .orElse(0.0);
    }

    public static double getAvgNoOfPostsOver40(List<User> users) {
        if (users == null) {
            throw new RuntimeException("User nie może być nullem");
        }

        return users.stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .orElse(0);
    }

    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsersList();

        double avgNoOfPostsBelow40 = getAvgNoOfPostsUnder40(users);
        double avgNoOfPostsOver40 = getAvgNoOfPostsOver40(users);

        System.out.println("Average number of posts from users under 40: " + avgNoOfPostsBelow40 + "\nAverage number of posts from users of 40 years old and older: " + avgNoOfPostsOver40);
    }
}