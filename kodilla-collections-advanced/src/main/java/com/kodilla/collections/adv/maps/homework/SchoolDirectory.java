package com.kodilla.collections.adv.maps.homework;
//Zad. 5.2. Szkoły i dyrektorzy

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {

        Map<School, Principal> schoolPrincipals = new HashMap<>();

        School school1 = new School("Królówka");
        Principal andrzejNowak = new Principal("Andrzej Nowak");
        schoolPrincipals.put(school1, andrzejNowak);

        school1.addClass(32);
        school1.addClass(30);
        school1.addClass(31);

        School school2 = new School("Prus");
        Principal janKowalski = new Principal("Jan Kowalski");
        schoolPrincipals.put(school2, janKowalski);

        school2.addClass(27);
        school2.addClass(25);
        school2.addClass(28);

        School school3 = new School("Zółkiewski");
        Principal tadeuszWisniewski = new Principal("Tadeusz Wiśniewski");
        schoolPrincipals.put(school3, tadeuszWisniewski);

        school3.addClass(31);
        school3.addClass(30);
        school3.addClass(29);

        School school4 = new School("Elektryk");
        Principal piotrMazur = new Principal("Piotr Mazur");
        schoolPrincipals.put(school4, piotrMazur);
        school4.addClass(17);
        school4.addClass(19);
        school4.addClass(22);

        for (Map.Entry<School, Principal> entry : schoolPrincipals.entrySet()) {
            School school = entry.getKey();
            Principal principal = entry.getValue();

            int totalStudents = 0;
            for (Integer classSize : school.getClasses()) {
                totalStudents += classSize;
            }

            System.out.println(principal.getPrincipalName() + " is the principal of " + school.getSchoolName() + ", with a total of " + totalStudents + " students.");
        }
    }
}