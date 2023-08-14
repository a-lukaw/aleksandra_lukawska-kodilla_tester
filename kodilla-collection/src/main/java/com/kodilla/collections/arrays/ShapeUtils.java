package com.kodilla.collections.arrays;

//4.2. Tablice - powtórzenie

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

//Klasa posiadająca metodę wyświetlającą szczegóły dowolnej figury (klasa narzędziowa - utility class)
//Metody naszej klasy ShapeUtils są statyczne. Klasa ta nie posiada żadnych pól (czyli nie zapamiętujemy nigdzie stanu obiektów tej klasy).
// Jako klasa bezstanowa może ona posiadać same statyczne metody, które możemy wywoływać bezpośrednio "na klasie".

public class ShapeUtils {
    public static void displayShapeInfo(Shape shape) {
        System.out.println("-----------------------------");
        System.out.println("Shape kind: " + getShapeName(shape));
        System.out.println("Shape area: " + shape.getArea());
        System.out.println("Shape perimeter: " + shape.getPerimeter());
    }

    //informację o nazwie figury uzyskujemy przy pomocy operatora instanceof, który zwraca wartość true lub false w zależności od tego,
    //czy dany obiekt jest wskazanej klasy, czy też nie.
    //dla uproszczenia pominięto nawiasy klamrowe

    private static String getShapeName(Shape shape) {
        if (shape instanceof Circle)
            return "Circle";
        else if (shape instanceof Triangle)
            return "Triangle";
        else if (shape instanceof Square)
            return "Square";
        else
            return "Unknown shape name";
    }
}