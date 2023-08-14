package com.kodilla.school;

//Zad. 3.8. Testy jednostkowe - ćwiczenia

public class Grades {
    private int[] values;                                   //utworzenie nowej tablicy liczb całkowitych o nazwie values
    private int size;                                       //deklaracja prywatnej zmiennej całkowitej o nazwie "size". Ta zmienna będzie przechowywać aktualny rozmiar tablicy (ilość przechowywanych ocen)

    public Grades() {                                       //konstruktor klasy "Grades". Konstruktor jest specjalną metodą, która jest wywoływana podczas tworzenia nowego obiektu tej klasy.
        this.values = new int[0];                           //tworzona jest nowa tablica o rozmiarze 0
        this.size = 0;                                      //Rozmiar tablicy "values" jest ustawiany na 0. To oznacza, że początkowo nie ma żadnych ocen przechowywanych w tablicy.
    }

    public void add(int value) {                                                            //deklaracja metody add, która przyjmuje jako argument jedną liczbę całkowitą (int value). Metoda ta będzie używana do dodawania nowych ocen do tablicy.
        this.size++;                                                                        // Zwiększa wartość pola size o jeden. To jest ważne, ponieważ będziemy zwiększać rozmiar tablicy o 1 przy dodawaniu nowej oceny.
        int[] newTab = new int[this.size];                                                  //Tworzy nową tablicę liczb całkowitych o rozmiarze równym aktualnemu rozmiarowi (size) tablicy "values". Nowa tablica ta będzie używana do przechowywania ocen wraz z nową oceną.
        System.arraycopy(values, 0, newTab, 0, values.length);                // Kopiuje zawartość istniejącej tablicy "values" do nowej tablicy "newTab". Ta operacja jest potrzebna, aby przenieść istniejące oceny do nowej tablicy o większym rozmiarze.
        newTab[this.size - 1] = value;                                                      //Umieszcza nową ocenę (value) na ostatniej pozycji w nowej tablicy "newTab". Indeks ostatniej pozycji to this.size - 1, ponieważ indeksy tablic zaczynają się od zera.
        this.values = newTab;                                                               // Aktualizuje pole "values" tak, aby wskazywało na nową tablicę "newTab", zawierającą nową ocenę.
    }

    public int[] getValues() {
        return values;
    }

    public double getAverage() {                                                        //uniemożliwia dzielenie przez 0 w linii return sum / this.values.length; (błąd Not a Number)
        if (this.values.length == 0) {
            return 0;
        }

        double sum = 0;                                                                    // Inicjalizujemy zmienną sum jako 0. Ta zmienna będzie używana do sumowania wartości ocen
        for (int i = 0; i < this.values.length; i++) {                                      //Rozpoczynamy pętlę for, która iteruje przez elementy tablicy values
            sum += this.values[i];                                                          //Dodajemy aktualną ocenę (element tablicy) do sumy. Każda ocena jest dodawana do zmiennej sum.
        }
        return sum / this.values.length;
    }
}

