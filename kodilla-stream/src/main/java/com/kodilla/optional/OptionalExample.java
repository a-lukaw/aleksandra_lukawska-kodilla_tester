//6.2. Typ optional
//Optional jest klasą, która jest "wrapperem" dowolnego obiektu. Wrapper możemy przetłumaczyć jako "opakowanie"
//Optional "opakowuje" więc dowolny obiekt i zajmuje się obsługą tego, czy jest on nullem czy też nie
//Typ optional zastępuje zapis: if (myVariable!= null) {
//myVariable.myMethod(); }

//docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional

package com.kodilla.optional;

import com.kodilla.stream.User;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = null;

        Optional<User> optionalUser = Optional.ofNullable(user);

        optionalUser.ifPresent(u -> System.out.println(u.getUsername()));     // wywołujemy metodę orElse na obiekcie optionalUser. Metoda ta, gdy optionalUser zawiera w środku null, zwróci to, co przekazano jej jako argument, czyli w naszym przypadku będzie to "pusty" obiekt klasy User.

    }
}