//Zad. 6.3
//utwórz klasę ForumStats, a w niej dwie metody zwracające średnią liczbę postów dla użytkowników z dwóch grup wiekowych oraz metodę main, która wyświetli wyniki metod na konsoli

package com.kodilla.optional.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgPostsNumberUnder45 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() < 45)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println(avgPostsNumberUnder45);


        double avgPostsNumberMoreThan45 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > 45)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println(avgPostsNumberMoreThan45);


    }
}
