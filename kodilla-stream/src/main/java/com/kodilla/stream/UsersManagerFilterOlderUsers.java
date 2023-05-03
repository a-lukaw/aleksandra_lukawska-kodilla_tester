package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;


public class UsersManagerFilterOlderUsers {
    //stwórz metodę statyczną wykorzystującą Stream, która będzie zwracała kolekcję elementów typu User
    // Metoda ma przyjmować argument typu int i zwrócić użytkowników starszych od podanej liczby w argumencie metody.

    public static void main(String[] args) {
        List<String> OlderUsernames = filterOlderUsers();
        System.out.println(OlderUsernames);
    }

    public static List<String> filterOlderUsers() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > 49)
                .map(UsersManagerFilterOlderUsers::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}
