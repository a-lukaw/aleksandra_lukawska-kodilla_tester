package com.kodilla.collections.arrays.homework;
//Zad. 4.2. losowanie wartości i iterowanie po tablicy
//Stwórz nowy pakiet com.kodilla.collections.arrays.homework, a w nim:
//Klasę CarUtils z metodą statyczną opisującą samochody (patrz poprzednie zadanie) o nazwie public static void describeCar(Car car).
//Klasę CarsApplication z metodą public static Car drawCar(), która będzie tworzyła losowy samochód z losowo zwiększoną prędkością.
//Metodę main, w której znajdzie się tablica o losowym rozmiarze od 1 do 15 samochodów.
// Do każdego elementu tablicy wpisz wylosowany przy pomocy metody drawCar samochód, a następnie przy pomocy pętli wyświetl informacje o wszystkich samochodach znajdujących się w tablicy.

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Mazda;

import java.util.Random;

public class CarsApplication {

    public static Car drawCar() {                                   //definiujemy metodę statyczną drawCar, która zwraca losowy samochód z losowo wygenerowaną prędkością
        Random random = new Random();

        int randomCar = random.nextInt(3);

        int randomSpeed = drawCarSpeed();

        if (randomCar == 0)
            return new Ford(randomSpeed);
        else if (randomCar == 1)
            return new Mazda(randomSpeed);
        else
            return new Opel(randomSpeed);
    }

    public static int drawCarSpeed() {
        Random random = new Random();
        return random.nextInt(30, 60);
    }

    public static void main(String[] args) {
        Random random = new Random();

        int size = random.nextInt(1, 16);                       //tworzymy pustą tablicę o losowej długości od 1 do 15
        Car[] cars = new Car[size];

        for (int n = 0; n < cars.length; n++) {                             //za pomocą pętli for wywołujemy metodę drawCar tyle razy, ile elementów będzie w tablicy
            cars[n] = drawCar(); }

        for (Car car : cars) {                                        //dla każdego elementu w tablicy cars (dla każdego samochodu) wyświetlamy informacje o marce samochodu i prędkości//zapis for ( Car car : cars) oznacza "wykonaj pewną operację dla każdego elementu tablicy cars".
            CarUtils.describeCar(car); }
    }
}
