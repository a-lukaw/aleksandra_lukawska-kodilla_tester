package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {

    //stwórz kolekcję znaczków pocztowych. Jeżeli jakiś znaczek posiadamy w kilku egzemplarzach, to chcemy, aby w naszym obiekcie kolekcji wystąpił tylko raz.
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Żuraw", 25, 20, true));
        stamps.add(new Stamp("Żuraw", 25, 20, true));
        stamps.add(new Stamp("Czapla", 20, 15, true));
        stamps.add(new Stamp("Zimorodek", 20, 25, false));
        stamps.add(new Stamp("Kormoran", 25, 25, true));

        //sprawdź, czy do kolekcji nie da się dodać kilka razy takiego samego znaczka

        System.out.println(stamps.size());
        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}
