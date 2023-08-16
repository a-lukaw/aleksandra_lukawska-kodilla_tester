package com.kodilla.collections.adv.maps;

//5.2. Mapy w praktyce

import java.util.HashMap;
import java.util.Map;

public class BasicMapExample {
    public static void main(String[] args) {

        Map<String, Double> grades = new HashMap<>();                               //utworzenie nowej kolekcji typu mapa o nazwie grades

        grades.put("Mathematics", 5.0);                                             //dodanie elementów do mapy (metoda grades.put())
        grades.put("Physics", 4.5);
        grades.put("Philosophy", 4.0);

        Double grade = grades.get("Mathematics");                                   //wyświetlanie elementu mapy po kluczu
        System.out.println(grade);

        for (Map.Entry<String, Double> note : grades.entrySet()) {                                                //wyświetlenie wszystkich elementów mapy grades (metoda .entrySet()) oraz Map.Entry<K,v>
            System.out.println("Grade of " + note.getKey() + " is equal to " + note.getValue());
        }
    }
}
