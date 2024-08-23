package org.personal.katas.perfect;

import lombok.RequiredArgsConstructor;
import org.personal.katas.numbers.divisor.DivisorsChecker;

import java.util.List;
import java.util.stream.IntStream;

@RequiredArgsConstructor
public class PerfectNumberChecker {

    private final DivisorsChecker divisorsChecker;

    public boolean checkIfPerfectNumber(final int number) {
        List<Integer> divisors = divisorsChecker.getDivisorsForNumber(number, false);
        return divisors.stream().mapToInt(Integer::intValue).sum() == number;
    }

    public List<Integer> getAllPerfectNumbersInRange(final int number) {
        return IntStream.rangeClosed(1, number)
                .filter(this::checkIfPerfectNumber)
                .boxed()
                .toList();
    }
}
