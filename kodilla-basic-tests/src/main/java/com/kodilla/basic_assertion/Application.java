package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 8;
        int b = 5;
        int c = 3;

        //Wywołujemy metodę sum(int a, int b) i wynik przypisujemy do nowej zmiennej.

        int sumResult = calculator.sum(a, b);
        int subtractResult = calculator.subtract(a, b);
        int squareResult = calculator.square(c);


        //Sprawdzamy, czy otrzymany wynik jest zgodny z oczekiwanym. Do tego posłuży nam metoda assertEquals z klasy ResultChecker.
        // Zwraca ona wartość boolean, którą możemy przypisać do zmiennej.

        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        boolean correct2 = ResultChecker.assertEquals(3, subtractResult);
        if (correct2) {
            System.out.println("Metoda subtract działa poprawnie dla liczb "+ a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        boolean correct3 = ResultChecker.assertEquals(9, squareResult);
        if(correct3) {
            System.out.println("Metoda square działa poprawnie dla liczby " + c);
        } else {
            System.out.println("Metoda square nie działa poprawnie dla liczby" + c);
        }
    }
}