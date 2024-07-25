package org.personal.katas.numbers.divisor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class DivisorsCheckerTest {

    private final DivisorsChecker divisorsChecker = new DivisorsChecker();

    @Test
    void getDivisors_WithInputOf3_GetDivisors() {
        assertDoesNotThrow(() -> divisorsChecker.getDivisorsForNumber(3));
    }

}
