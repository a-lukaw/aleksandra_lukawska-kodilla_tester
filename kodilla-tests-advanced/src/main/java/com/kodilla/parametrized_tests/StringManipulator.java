//7.1. Testy z wieloma argumentami
// metoda, która odwraca kolejność znaków i wynik zwraca w postaci małych liter

package com.kodilla.parametrized_tests;

public class StringManipulator {
    public String reverseWithLowerCase(String input) {
        StringBuilder builder = new StringBuilder(input);
        return builder.reverse().toString().toLowerCase();
    }

    public int getStringLengthWithoutSpaces(String input) {
        String value = input.replaceAll(" ", "");
        return value.length();
    }
}