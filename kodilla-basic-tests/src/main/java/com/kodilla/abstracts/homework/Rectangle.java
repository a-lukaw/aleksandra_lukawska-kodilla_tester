package com.kodilla.abstracts.homework;

//Zad. 3.2. dziedziczenie i klasy abstrakcyjne

class Rectangle extends Shape {

    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        double area = a * b;
        System.out.println("Rectangle area is: " + area);
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 2 * a + 2 * b;
        System.out.println("Rectangle perimeter is: " + perimeter);
        return perimeter;
    }
}
