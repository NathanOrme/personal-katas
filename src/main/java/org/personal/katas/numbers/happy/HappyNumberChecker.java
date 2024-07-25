package org.personal.katas.happy.numbers;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HappyNumberChecker {

    private static int calculateSquareSum(final int inputNumber) {
        int sum = 0;
        int number = inputNumber;
        while (number != 0) {
            //Divides the number by 10, then assigns the int to the remainder of that
            //eg 10012 % 10 = 2
            int digit = number % 10;
            //Does power multiplier on number, by power of 2
            int squaredNumber = (int) Math.pow(digit, 2);
            sum = sum + squaredNumber;
            //Divides number by 10, and assigns
            number /= 10;
        }
        return sum;
    }

    public static boolean isHappyNumber(final int inputNumber) {
        Set<Integer> seenNumbers = new HashSet<>();
        int number = inputNumber;

        while (number != 1 && !seenNumbers.contains(number)) {
            seenNumbers.add(number);
            number = calculateSquareSum(number);
        }

        return number == 1;
    }

    public static List<Integer> getAllHappyNumbersInRange(final int number) {
        return Stream.iterate(1, n -> n + 1)
                .limit(number)
                .filter(HappyNumberChecker::isHappyNumber)
                .toList();
    }
}
