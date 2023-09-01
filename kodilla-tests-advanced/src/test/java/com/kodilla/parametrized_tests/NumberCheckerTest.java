//7.1. Testy parametryzowane
//Test oznaczony adnotacją @ParameterizedTest uruchomi się tyle razy, ile argumentów zostało przekazanych jako wartości źródłowe.

package com.kodilla.parametrized_tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class NumberCheckerTest {
    private NumberChecker numberChecker = new NumberChecker();

    @ParameterizedTest

    //Adnotacja @ValueSource dobrze sprawdza się w przypadku niewielkiego zbioru danych wejściowych.
    @ValueSource(ints = {0, 3, 6, -3, -12, 15})

    public void shouldReturnTrueForNumberDivisibleByThree(int number) {
        boolean result = numberChecker.isDivisibleByThree(number);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-2, -1, 1, 2, 4, 5})
    public void shouldReturnFalseForNumberNotDivisibleByThree(int number) {
        boolean result = numberChecker.isDivisibleByThree(number);
        assertFalse(result);
    }
}
