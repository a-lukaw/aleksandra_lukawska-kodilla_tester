package com.kodilla.abstracts;


//pojawia się komunikat mówiący nam, że klasa, która dziedziczy po klasie abstrakcyjnej, musi albo sama być abstrakcyjna
// albo musi zawierać implementację wszystkich metod abstrakcyjnych z klasy, z której dziedziczy.
// Ponieważ chcemy, by klasa Dog była konkretna, a nie abstrakcyjna, skorzystamy z tej drugiej opcji.
// Możemy ręcznie zajrzeć do klasy 'Animal', wyszukać metody abstrakcyjne i je przepisać, ale możemy też skorzystać z pomocy IntelliJ –
// - ustawiamy kursor na słowie 'Dog', wciskamy kombinację klawiszy Alt+Enter i z menu wybieramy 'Implement methods'
public class Dog extends Animal {

    //Podklasa musi wywoływać konstruktor z nadklasy. W klasie 'Animal' zdefiniowaliśmy konstruktor, który ma przyjmować liczbę nóg zwierzęcia.
    // Musimy go wywołać z każdej podklasy. Ponownie możemy napisać kod ręcznie, albo skorzystać z pomocy edytora [Alt + Enter]

    //Zmodyfikujmy konstruktor, aby tworząc obiekt typu 'Dog' od razu ustawiać wartość zmiennej numberOfLegs = 4:
    //Klasa Animal zawiera konstruktor przyjmujący argument, ale nie oznacza to, że klasa dziedzicząca też musi mieć konstruktor z jednym argumentem.
    // Konieczne jest, aby wywołać konstruktor z nadklasy, reszta zachowania jest dowolna.
    public Dog() {
        super(4);
    }

    //W rezultacie otrzymujemy szablon metody, której ciało możemy dodać wedle własnego uznania.
    //Tu chcemy, aby metoda wyświetlała tekst "Hau hau".
    @Override
    public void giveVoice() {
        System.out.println("Hau Hau");
    }
}
