//Zad. 6.2. uczniowie i nauczyciele

package com.kodilla.optional.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;


public class ApplicationTest {
    @Test
    public void shouldPrintStudentTeacherPairs() {
        // Given
        List<Student> students = new ArrayList<>();

        Teacher teacher1 = new Teacher("Magdalena Wójcik");
        Teacher teacher2 = new Teacher("Marek Krawczyk");
        Teacher teacher3 = new Teacher("Grażyna Kowalczyk");
        Teacher teacher4 = new Teacher("Ludmila Kozłowska");
        Teacher teacher5 = new Teacher("Iga Woźniak");

        students.add(new Student("Alicja Nowak", teacher1));
        students.add(new Student("Marta Kowalska", null));
        students.add(new Student("Ewelina Górniak", teacher3));
        students.add(new Student("Michał Mazur", teacher4));
        students.add(new Student("Anna Wiśniewska", null));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // When
        Application.main(null);
        String actualOutput = outputStream.toString().trim();

        // Then
        String expectedOutput = "Pary uczniów i nauczycieli:\n" +
                "Uczeń: Alicja Nowak, nauczyciel: Magdalena Wójcik\n" +
                "Uczeń: Marta Kowalska, nauczyciel: <undefined>\n" +
                "Uczeń: Ewelina Górniak, nauczyciel: Grażyna Kowalczyk\n" +
                "Uczeń: Michał Mazur, nauczyciel: Ludmila Kozłowska\n" +
                "Uczeń: Anna Wiśniewska, nauczyciel: <undefined>";
        Assertions.assertEquals(expectedOutput, actualOutput);

        // Restore System.out
        System.setOut(System.out);
    }
}

// W tym teście przechwytujemy wynik wypisywany na System.out za pomocą ByteArrayOutputStream i porównujemy go z oczekiwanym wynikiem. Następnie przywracamy domyślny System.out po zakończeniu testu.