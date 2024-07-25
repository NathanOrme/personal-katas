package org.personal.katas.numbers.perfect;

import org.junit.jupiter.api.Test;
import org.personal.katas.divisor.numbers.DivisorsChecker;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PerfectNumberCheckerTest {

    private final DivisorsChecker divisorsChecker = new DivisorsChecker();

    private final PerfectNumberChecker perfectNumberChecker = new PerfectNumberChecker(divisorsChecker);

    @Test
    void check_5_returnsFalse() {
        assertFalse(perfectNumberChecker.checkIfPerfectNumber(5));
    }

    @Test
    void check_6_returnsTrue() {
        assertTrue(perfectNumberChecker.checkIfPerfectNumber(6));
    }

    @Test
    void getAllPerfectNumbersInRange_WithNumber28_ExpectTwoNumbers() {
        List<Integer> result = perfectNumberChecker.getAllPerfectNumbersInRange(28);
        assertFalse(result.isEmpty());
        assertEquals(2, result.size());
        assertTrue(result.containsAll(Arrays.asList(6, 28)));
    }

}
