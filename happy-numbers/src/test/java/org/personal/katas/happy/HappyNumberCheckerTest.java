package org.personal.katas.happy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HappyNumberCheckerTest {

    @Test
    void check_5_returnsFalse() {
        assertFalse(HappyNumberChecker.checkIfHappyNumber(5));
    }

    @Test
    void check_23_returnsTrue() {
        assertTrue(HappyNumberChecker.checkIfHappyNumber(23));
    }

}
