package com.kodilla.collections.arrays;

//4.2. Tablice - powtórzenie

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

//do losowania wartości używamy klasy Random
import java.util.Random;

public class ShapeApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        //tworzymy pustą Tablicę na 5 elementów
        Shape[] shapes = new Shape[5];

        //Za pomocą pętli for wywołujemy metodę drawShape tyle razy, ile elementów będzie w tablicy
        //pętla iteruje od 0 do shapes.length - 1 (czyli od 0 do 4, ponieważ tablica ma rozmiar 5)

        for (int n = 0; n < shapes.length; n++) {
            shapes[n] = drawShape();                                    //W każdym kroku pętli, wywołujemy metodę drawShape(), która generuje losowe parametry i zwraca obiekt klasy Shape. Ten obiekt przypisujemy do odpowiedniego elementu w tablicy shapes
        }

        //dla każdego elementu w tablicy shapes (dla każdej figury) wyświetlamy informacje o wymiarach
        //zapis for ( Shape shape : shapes) oznacza "wykonaj pewną operację dla każdego elementu tablicy shapes".
        for (Shape shape : shapes) {
            ShapeUtils.displayShapeInfo(shape);
        }
    }

    //wywołanie metody next.Int, która będzie losować liczby od 0 do 3
    //w argumencie metody podajemy maksymalną wartość, do której będą losowane liczby (tu 3)
    //metoda losuje liczby zawsze od 0 do bound minus 1 (tu 2)
    //możliwe do uzyskania wartości w takim losowaniu to 0, 1 i 2

    private static Shape drawShape() {
        int drawnShapeKind = RANDOM.nextInt(3);

        //piszemy instrukcję warunkową:
        //"jeżeli wylosowano liczbę 0, narysuj koło, jeżeli wylosowano liczbę 2, narysuj kwadrat, w pozostałych przypadkach narysuj trójkąt"

        double a = getRandomSize();
        if (drawnShapeKind == 0)
            return new Circle(a);
        else if (drawnShapeKind == 1)
            return new Square(a);
        else {
            double b = getRandomSize();
            double c = getRandomSize();
            return new Triangle(a, b, c);
        }
    }
    private static double getRandomSize() {
        return RANDOM.nextDouble() * 100 + 1;
    }
}