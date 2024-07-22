package org.personal.katas.happy.numbers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberCheckerTest {

    @Test
    void check_5_returnsFalse() {
        assertFalse(HappyNumberChecker.isHappyNumber(5));
    }

    @Test
    void check_23_returnsTrue() {
        assertTrue(HappyNumberChecker.isHappyNumber(23));
    }

    @Test
    void getAllHappyNumbersInRange_With23_ReturnsList() {
        List<Integer> integers = HappyNumberChecker.getAllHappyNumbersInRange(23);
        assertNotNull(integers);
        assertFalse(integers.isEmpty());
        List<Integer> expectedIntegers = List.of(1, 7, 10, 13, 19, 23);
        assertTrue(integers.containsAll(expectedIntegers));
    }

}
