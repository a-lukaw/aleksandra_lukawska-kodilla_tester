package com.kodilla.parametrized_tests;
//7.1. Testy parametryzowane a null
//Metoda zwraca true, gdy przekazana wartość jest równa null lub gdy text pozbawiony spacji (trim()) jest pusty
public class StringValidator {
    public boolean isBlank(String text) {
        return text == null || text.trim().isEmpty();
    }
}
