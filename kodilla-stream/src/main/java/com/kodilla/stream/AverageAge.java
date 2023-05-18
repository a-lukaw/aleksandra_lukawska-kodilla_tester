package com.kodilla.stream;

public class AverageAge {
    public static void main(String[] args) {
        double avg = UsersRepository.getUsersList()                                         //przypisanie wyniku do zmiennej avg
                .stream()
                .mapToInt(n -> n.getAge())                                                  //wywołanie metody mapToInt
                .average()                                                                  //wywołanie kolektora average()
                .getAsDouble();                                                             //konwertujemy zwrócony przez kolektor typ OptionalDouble do zwykłego typu double
        System.out.println(avg);
    }
}
