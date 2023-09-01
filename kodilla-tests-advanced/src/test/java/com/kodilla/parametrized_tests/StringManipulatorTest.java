//7.1. Testy z wieloma argumentami
package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {
    private StringManipulator manipulator = new StringManipulator();

    @ParameterizedTest

    //given
    @CsvSource(value = {"test, tset", "OtHEr, rehto", "Event, tneve", "null, llun"})

    //when
    public void shouldReverseStringWithLowerCase(String input, String expected) {
        assertEquals(expected, manipulator.reverseWithLowerCase(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"test,4", " OtHEr ,5", "E V e n t,5", "null ,4"})

    public void shouldCalculateStringLengthWithoutSpaces(String input, String expected) {
        assertEquals(Integer.parseInt(expected), manipulator.getStringLengthWithoutSpaces(input));
    }
}
