//Zad. 6.2. Uczniowie i nauczyciele
//utwórz klasę Application z metodą main, a w niej utwórz listę obiektów klasy Student i wypełnij ją przykładowymi danymi
//Niektórzy uczniowie niech mają przypisanego nauczyciela, a niektórzy nie (wówczas pole teacher = null).

//Przy pomocy pętli for-each wyświetl pary uczeń-nauczyciel (np. w formie "uczeń: Jan Kowalski, nauczyciel: Tomasz Nowak").
//Wykorzystaj klasę Optional do tego, aby obsłużyć sytuacje, w których teacher == null. Wówczas w miejscu danych nauczyciela wyświetl tekst "<undefined>".


package com.kodilla.optional.homework;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
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

        System.out.println("Pary uczniów i nauczycieli:");
        for (Student student : students) {
            String teacherName = Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>");
            System.out.println("Uczeń: " + student.getName() + ", nauczyciel: " + teacherName);
        }
    }
}
//Dodaliśmy do listy studentów trzeciego studentów, którzy nie mają nauczycieli (teacher ma wartość null).
// W pętli for-each wykorzystujemy klasę Optional do obsługi tej sytuacji - najpierw tworzymy obiekt Optional z nauczycielem studenta za pomocą metody ofNullable().
// Następnie wykorzystujemy metodę map() do wydobycia nazwy nauczyciela, jeśli istnieje, lub wartości <undefined> w przeciwnym przypadku.
// Na koniec wyświetlamy parę ucznia i nauczyciela za pomocą metody println().