//6.1. Stream
//klasa UsersManager służy do uruchomienia (metoda main) Streamu na kolekcji użytkowników

package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {

        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);

        List<String> olderUsersNames = UsersManager.filterUsersOlderThan();
        System.out.println(olderUsersNames);
    }

    public static List<String> filterChemistGroupUsernames() {

        List<String> usernames = UsersRepository.getUsersList()

                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

    public static List<String> filterUsersOlderThan() {

        List<String> usernames = UsersRepository.getUsersList()

                .stream()
                .filter(user -> user.getAge() > 35)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}