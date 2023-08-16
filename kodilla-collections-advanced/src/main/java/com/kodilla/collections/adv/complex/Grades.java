package com.kodilla.collections.adv.complex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grades {
    private List<Double> grades = new ArrayList<>();         //klasa Arrays pochodzi z pakietu java.util, a jej metoda asList() tworzy listę, która będzie zawierała przekazane argumenty wejściowe do metody asList()

    public Grades(List<Double> grades) {
        this.grades = grades;
    }

    public Grades(Double... v2) {
        this.grades = Arrays.asList(v2);
    }

    public double getAverage() {                           //tworzymy metodę o nazwie getAverage, która będzie zwracała liczbę typu double. Liczbą tą będzie obliczona średnia
        double sum = 0.0;                                  //dla metody deklarujemy zmienną lokalną o nazwie sum, w której będziemy przechowywali wyniki cząstkowe podczas obliczania sumy wartości elementów. Zmienna ta jest typu double i jako wartość początkową przypisujemy do niej zero
        for (double grade : grades)                        //deklaracja pętli for-each; pętla ta iteruje po kolejnych elementach zapisanych w kolekcji grades. Każdy z elementów tej kolekcji jest kolejno pobierany i wstawiany do zmiennej grade (typu double).
            sum += grade;                                  //dla każdego elementu kolekcji wykonywana jest sum += grade; operator += użyty w tym wyrażeniu to forma skrócona od następującego zapisu: sum = sum + grade; wyrażenie to wpisuje do zmiennej sum poprzednią (dotychczasową) wartość zmiennej sum, powiększoną o wartość elementu z kolekcji, który akurat jest przypisany do zmiennej grade; w kolejnych iteracjach pętli wartość zmiennej sum stale powiększa się o kolejne oceny.
        return sum / grades.size();
    }                      //znajdujemy się już za pętlą, a więc w zmiennej sum znajduje się obliczona suma wartości wszystkich ocen z kolekcji grades; obliczona średnia jest następnie zwracana przy pomocy polecenia return jako wynik działania metody getAverage.

    @Override
    public String toString() {
        return "Grades: " + grades.toString();
    }
}
