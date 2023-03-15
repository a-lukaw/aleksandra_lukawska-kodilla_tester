package com.kodilla.abstracts;

public class ApplicationProcessor {

        public static void main(String[] args) {
            Animal dog = new Dog();

            AnimalProcessor processor = new AnimalProcessor();
            processor.process(dog);
        }
    }