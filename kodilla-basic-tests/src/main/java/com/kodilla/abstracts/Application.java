package com.kodilla.abstracts;

public class Application {

    //Każdy program musi zaczynać się od metody main
    public static void main(String[] args) {

        //tworzymy obiekty na zasadzie polimorfizmu: zamiast Dog dog = new Dog();
        //do obiektu typu wyższego przypisujemy obiekt typu niższego (nigdy na odwrót)
        //stosując taką konstrukcję, możemy wywołać wszystkie metody nieprywatne znajdujące się w klasie 'Animal' – nie możemy użyć metod zdefiniowanych tylko w klasie 'Dog'
        // i wywołujemy metody giveVoice():

        Animal dog = new Dog();
        dog.giveVoice();

        Animal duck = new Duck();
        duck.giveVoice();

    }
}
