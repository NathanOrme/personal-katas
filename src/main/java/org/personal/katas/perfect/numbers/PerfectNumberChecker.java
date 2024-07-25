package org.personal.katas.perfect.numbers;

import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.IntStream;

@NoArgsConstructor
public class PerfectNumberChecker {

    public boolean checkIfPerfectNumber(final int number) {
        List<Integer> divisors = IntStream.rangeClosed(1, number / 2)
                .filter(potentialDivisor -> number % potentialDivisor == 0)
                .boxed()
                .toList();
        return divisors.stream().mapToInt(Integer::intValue).sum() == number;
    }

    public List<Integer> getAllPerfectNumbersInRange(final int number) {
        return IntStream.rangeClosed(1, number)
                .filter(this::checkIfPerfectNumber)
                .boxed()
                .toList();
    }
}
