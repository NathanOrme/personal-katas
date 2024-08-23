package org.personal.katas.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void checkNumber_With3_ReturnsFizz() {
        assertEquals("Fizz", FizzBuzz.checkNumber(3));
    }

}
