//6.1. Stream
//klasa User reprezentuje użytkownika systemu (np. forum)
//jest źródłem danych do testowania Streamów

package com.kodilla.stream;

import java.util.Objects;

public class User {
    public String username;
    private int age;
    private int numberOfPost;
    private String group;


    //alt + insert: konstruktor z wszystkimi polami, gettery i metody equals i hashCode
    public User(String username, int age, int numberOfPost, String group) {
        this.username = username;
        this.age = age;
        this.numberOfPost = numberOfPost;
        this.group = group;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfPost() {
        return numberOfPost;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && numberOfPost == user.numberOfPost && Objects.equals(username, user.username) && Objects.equals(group, user.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, age, numberOfPost, group);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}