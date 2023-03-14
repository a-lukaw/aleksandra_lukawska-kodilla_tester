package com;

public class Grades {
    //dodajemy tablicę, która będzie przechowywać 10 wartości (ocen)
    private int[] grades;

    //Dodajemy możliwość wstawienia nowej oceny do zbioru. Aby dodać element do tablicy, musimy wskazać,
    // na której pozycji powinien on się znaleźć.
    // W tym celu możemy utworzyć dodatkową zmienną, która będzie "monitorować"
    // aktualną liczbę elementów w tablicy.
    //Zmienna size mówi nam, ile elementów aktualnie znajduje się w tablicy.
    // Jej wartość powinna być modyfikowana, gdy zmieniamy wartości w tablicy.
    private int size;

    //wywołujemy kontruktor
    public Grades() {

        //przypisujemy nową wartość do zmiennej, przechowującej oceny//
        this.grades = new int[10];
        this.size = 0;
    }

    //metoda dodająca przekazaną w argumencie ocenę do tablicy
    //Jeśli nasza zmienna odpowiadająca za przechowywanie rozmiaru tablicy
    // jest równa 10 (długość tablicy), przerywamy działanie metody
    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        //dodanie elementu do tablicy, jeśli rozmiar jest mniejszy od maksymalnego
        this.grades[this.size] = value;
        this.size++;
    }

    //metoda sumująca oceny z tablicy
    int sumGrades() {
        int sumGrades = 0;
        for (int i = 0; this.grades.length > i; i++) {
            sumGrades = sumGrades + this.grades[i];
        }
        return sumGrades;
    }
     double averageGrades() {
         int sumGrades = 0;
         for (int i = 0; this.grades.length > i; i++) {
             sumGrades = sumGrades + this.grades[i];
         }
         return sumGrades / this.grades.length;
     }

 }
