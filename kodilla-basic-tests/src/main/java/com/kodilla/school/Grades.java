package com.kodilla.school;

public class Grades {

    //definiujemy tablicę z zerową liczbą elementów – na starcie uczeń nie ma żadnych ocen.
    private int[] values;
    private int size;


    public Grades() {
        this.values = new int[0];
    }

    //tworzymy metodę, dodającą ocenę do tablicy
    //Należy pamiętać, że rozmiaru tablicy nie można powiększać.
    // Jest na to sposób – jeśli chcemy dodać nowy element, który znalazłby się poza dopuszczalnym zakresem tablicy,
    // możemy utworzyć pustą tablicę o jeden większą niż poprzednia tablica, skopiować wszystkie elementy i na końcu dodać nową wartość:

    public void add(int value) {

        //inkrementujemy (zwiększamy o jeden) wartość size opisującą wielkość tablicy
        this.size++;

        // tworzymy pustą tablicę z nowym rozmiarem
        int[] newTab = new int[this.size];

        //używamy metody z klasy System, która pozwala na skopiowanie tablicy źródłowej do tablicy docelowej, zachowując obecny układ elementów
        System.arraycopy(values, 0, newTab, 0, values.length);

        //przypisujemy nową wartość do ostatniego elementu w tablicy (konieczne było odjęcie cyfry jeden od rozmiaru tablicy, indeksy liczymy od zera).
        newTab[this.size - 1] = value;

        //rzypisujemy nowo utworzoną tablicę do tablicy przechowywanej w klasie
        this.values = newTab;
    }

    public int[] getValues() {
        return values;
    }


    //Obecnie nie mamy możliwości zweryfikowania, czy wywołanie metody addMathGrade w klasie Student się powiodło.
    // Obiekt typu Grades o nazwie maths w klasie Student oznaczony jest jako private, nie mamy do niego dostępu – oceny widoczne są tylko wewnątrz klasy Student.
    // Jednym ze sposobów weryfikacji, bez udostępniania całej tablicy ocen, jest dodanie metody zwracającej średnią ocen:
    public double getAverage() {
        if(this.values.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.values.length; i++) {
            sum += this.values[i];
        }
        return sum/this.values.length;
    }
}
