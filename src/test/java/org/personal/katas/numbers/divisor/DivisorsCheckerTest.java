package org.personal.katas.numbers.divisor;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DivisorsCheckerTest {

    private final DivisorsChecker divisorsChecker = new DivisorsChecker();

    @Test
    void getDivisors_WithInputOf3AndInclusive_GetDivisors() {
        assertTrue(divisorsChecker.getDivisorsForNumber(3, true).containsAll(List.of(1, 3)));
    }

    @Test
    void getDivisors_WithInputOf3AndExclusive_GetDivisors() {
        assertTrue(divisorsChecker.getDivisorsForNumber(3, false).contains(1));
    }

}
