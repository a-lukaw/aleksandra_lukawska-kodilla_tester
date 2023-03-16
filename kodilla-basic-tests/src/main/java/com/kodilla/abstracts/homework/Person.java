package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    int age;
    Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    //Dodaj metodę, która wyświetli obowiązki danej osoby w pracy
    public static void main (String[] args) {
        Person aleksandra = new Person("Aleksandra", 35, new EngineeringGeologist());
        System.out.println(aleksandra.firstName + " 's responsibility is " + aleksandra.job.showResponsibilities());

        Person przemyslaw = new Person("Przemyslaw", 33, new Geophysicist());
        System.out.println(przemyslaw.firstName + " 's responsibility is " + przemyslaw.job.showResponsibilities());

        Person kamil = new Person("Kamil", 39, new PetroleumGeologist());
        System.out.println(kamil.firstName + " 's responsibility is " + kamil.job.showResponsibilities());
    }
}