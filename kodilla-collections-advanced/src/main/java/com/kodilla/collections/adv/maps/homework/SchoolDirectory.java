package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {

        Map<Principal, School> schoolPrincipals = new HashMap<>();           //utworz mapę, przyporządkowującą szkoły do dyrektorów

        School school1 = new School("Królowka");                        //dodaj do mapy kilka wpisów - przykładowych dyrektorów i szkół
        Principal andrzejNowak = new Principal("Andrzej Nowak");
        schoolPrincipals.put(andrzejNowak, school1);

        school1.addClass(32);
        school1.addClass(30);
        school1.addClass(31);

        School school2 = new School("Prus");
        Principal janKowalski = new Principal("Jan Kowalski");
        schoolPrincipals.put(janKowalski, school2);

        school2.addClass(27);
        school2.addClass(25);
        school2.addClass(28);

        School school3 = new School("Zółkiewski");
        Principal tadeuszWisniewski = new Principal("Tadeusz Wiśniewski");
        schoolPrincipals.put(tadeuszWisniewski, school3);

        school3.addClass(31);
        school3.addClass(30);
        school3.addClass(29);

        School school4 = new School("Elektryk");
        Principal piotrMazur = new Principal("Piotr Mazur");
        schoolPrincipals.put(piotrMazur, school4);
        school4.addClass(17);
        school4.addClass(19);
        school4.addClass(22);

        for (Map.Entry<Principal, School> entry : schoolPrincipals.entrySet()) {                                         //wykorzystując pętlę for-each, wyświetl informacje o dyrektorach placówek, nazwie szkoły, którą kierują oraz o łącznej liczbie uczniów w każdej szkole
            Principal principal = entry.getKey();
            School school = entry.getValue();
            int totalStudents = school.getClasses().stream().mapToInt(Integer::intValue).sum();
            System.out.println(principal.getPrincipalName() + " is the principal of " + school.getName() + ", with a total of " + totalStudents + " students.");
        }
    }
}