package com.kodilla.abstracts;

public abstract class Animal {

    //deklarujemy prywatną zmienną typu int
    private int numberOfLegs;

    //tworzymy konstruktor Animal
    public Animal(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    //tworzymy getter, wydobywający wartość prywatnej zmiennej numberOfLegs
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    //Zdefiniujmy teraz pierwszą metodę abstrakcyjną – giveVoice().
    // Będzie ona wyświetlać głos wydany przez dane zwierzę.
    // Dlaczego jest to metoda abstrakcyjna? Wymuszamy w ten sposób, aby każda klasa dziedzicząca po Animal dodawała własną implementację -
    // - każdy rodzaj zwierzęcia w inny sposób wydaje dźwięki.

    //metoda abstrakcyjna nie ma ciała (brak nawiasów klamrowych, zawierających kod, który powinien zostać wykonany)
    //oznaczając metodę jako abstrakcyjną, stawiamy średnik bezpośrednio po nawiasach

    public abstract void giveVoice();
}