package com.kodilla.basic_assertion;

public class PrimeChecker {
    int number;
    private int count;

    public PrimeChecker() {
        this.number = number;
    }

    public boolean isPrime(int number) {

        //1 nie jest liczbą pierwszą
        if (number < 2) {
            return false;
        }

        //W pętli iterujemy po wszystkich liczbach od cyfry 2 do przekazanej liczby. Np. przyjmując liczbę 7, sprawdzamy, czy jest ona podzielna przez 2, 3, 4, 5, 6.
        for (int i = 2; i < number; i++) {

            //Jeśli reszta z dzielenia w którymś przypadku jest równa 0, zwracamy false – liczba dzieli się bez reszty, więc nie jest liczbą pierwszą.

            if (number % i == 0) {
                return false;
            }
        }
        // Jeśli w pętli nie znaleźliśmy liczby, która jest dzielnikiem number, zwracamy wartość true oznaczającą, że liczba number jest liczbą pierwszą.
        return true;
    }

    public int getCount() {
        return count;
    }

    public void incrementCount() {
        this.count++;
    }
}