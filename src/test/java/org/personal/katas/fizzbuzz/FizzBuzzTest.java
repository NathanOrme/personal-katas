package org.personal.katas.fizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void checkNumber_With3_ReturnsFizz() {
        assertEquals("Fizz", fizzBuzz.checkNumber(3));
    }

    @Test
    void checkNumber_With5_ReturnsFizz() {
        assertEquals("Buzz", fizzBuzz.checkNumber(5));
    }

    @Test
    void checkNumber_With15_ReturnsFizz() {
        assertEquals("FizzBuzz", fizzBuzz.checkNumber(15));
    }

    @Test
    void checkRangeOfNumbers_With15_ReturnsCorrectArray() {
        List<String> expectedArray = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        List<String> results = fizzBuzz.checkRangeOfNumbers(15);
        for (int i = 0; i < expectedArray.size(); i++) {
            assertEquals(expectedArray.get(i), results.get(i));
        }
    }

}
