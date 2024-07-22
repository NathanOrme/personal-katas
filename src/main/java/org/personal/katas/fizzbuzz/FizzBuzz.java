package org.personal.katas.fizzbuzz;

import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Stream;

@NoArgsConstructor
public class FizzBuzz {

    public static String checkNumber(final int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else {
            return String.valueOf(number);
        }
    }


    public static List<String> checkRangeOfNumbers(final int number) {
        return Stream.iterate(1, n -> n + 1)
                .limit(number)
                .map(FizzBuzz::checkNumber)
                .toList();
    }
}
