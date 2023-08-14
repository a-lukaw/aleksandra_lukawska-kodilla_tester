package com.kodilla.school;

//Zad. 3.8. Testy jednostkowe - ćwiczenia

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradesTestSuite {

    private Grades grades = new Grades();

    @Test
    public void shouldHaveZeroLength() {                    //test weryfikuje, czy w nowym obiekcie Grades tablica z ocenami jest pusta
        int[] values = grades.getValues();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        grades.add(4);
        grades.add(2);

        int[] values = grades.getValues();
        assertEquals(2, values.length);                     //sprawdza, czy po dodaniu dwóch ocen tablica ma odpowiedni rozmiar
        assertEquals(4, values[0]);                         //czy znajdują się w niej dodane wartości?
        assertEquals(2, values[1]);
    }

    @Test
    public void shouldCalculateAverage() {                      //sprawdza, czy metoda getAverage() poprawnie liczy średnią ocen
        Student student = new Student("Nowak");

        grades.add(4);
        grades.add(2);
        grades.add(5);

        assertEquals(3.66, grades.getAverage(), 0.01);              // delta - dopuszczalna różnica między wartością oczekiwaną, a otrzymaną; wartość delty powinna być mała
    }

    @Test
    public void shouldReturnAverageEqualsZeroIfArrayIsEmpty() {
        Grades grades = new Grades();
        assertEquals(0, grades.getAverage(), 0.0001);
    }

    @Test
    public void shouldCalculateAveragesIfValuesAreOutsideRange() {
        Student student = new Student("Martin");
        student.addGeographyGrade(-2);
        student.addGeographyGrade(4);
        student.addGeographyGrade(8);

        student.addMathGrade(0);

        student.addPhysicsGrade(19);
        student.addPhysicsGrade(3);
        student.addPhysicsGrade(3);

        double geographyAverage = student.getGeographyAverage();
        double historyAverage = student.getHistoryAverage();
        double mathsAverage = student.getMathsAverage();
        double physicsAverage = student.getPhysicsAverage();

        assertEquals(4, geographyAverage, 0.01);
        assertEquals(0, historyAverage, 0.01);
        assertEquals(0, mathsAverage, 0.01);
        assertEquals(3, physicsAverage, 0.01);
    }
}

