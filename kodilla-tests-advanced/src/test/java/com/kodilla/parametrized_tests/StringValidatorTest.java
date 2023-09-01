//7.1. Testy parametryzowane a null
package com.kodilla.parametrized_tests;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringValidatorTest {
    private StringValidator validator = new StringValidator();
    @Test
    public void shouldReturnFalseIfStringIsNotEmpty() {
        assertFalse(validator.isBlank("test"));
    }
    @Test
    public void shouldReturnTrueIfStringIsEmpty() {
        assertTrue(validator.isBlank(""));
    }
    @Test
    public void shouldReturnTrueIfStringHasOnlySpaces() {
        assertTrue(validator.isBlank(" "));
    }
    @Test
    public void shouldReturnTrueIfStringIsNull() {
        assertTrue(validator.isBlank(null));
    }

    //zamiana testów shouldReturnTrueIfStringIsEmpty oraz shouldReturnTrueIfStringHasOnlySpaces w jeden test parametryzowany:
    @ParameterizedTest
    @ValueSource(strings = {"", "  "})
    public void shouldReturnTrueIfStringIsEmpty(String text) {
        assertTrue(validator.isBlank(text));
    }

    //testy parametryzowane metody shouldReturnTrueIfStringIsNull() - adnotacja @NullSource
    @ParameterizedTest
    @NullSource
    public void shouldReturnTrueIfStringIsNull(String text) {
        assertTrue(validator.isBlank(text));
    }

    //powyższe dwie adnotacje można połączyć w jedną - adnotacja @NullAndEmptySource
    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsEmpty_combined(String text) {
        assertTrue(validator.isBlank(text));
    }
}
