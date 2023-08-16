package com.kodilla.collections.adv.complex;

import java.util.Objects;

public class Student {
    private String firstname;
    private String lastname;

    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public boolean equals(Object o) {                                       //metoda equals(Object o). Na zapis metody składa się: modyfikator dostępu public, typ zwracany boolean, nazwa metody, przyjmowany typ obiektu wraz z nazwą, której będziemy używać wewnątrz metody
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;                                                                              //rzutujemy przyjęty argument na typ Student. Robimy to, aby móc pobrać wartości zmiennych
        return Objects.equals(firstname, student.firstname) && Objects.equals(lastname, student.lastname);
    }     //porównujemy wartości; zapis student.firstName odnosi się do obiektu, na którym metoda equals została wywołana

    @Override
    public int hashCode() {                                                                                             //Alt + insert
        return Objects.hash(firstname, lastname);
    }

    @Override
    public String toString() {                                                                                          //Alt + insert
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
