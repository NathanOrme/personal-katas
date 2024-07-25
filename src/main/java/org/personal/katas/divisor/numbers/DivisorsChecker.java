package org.personal.katas.divisor.numbers;

import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.IntStream;

@NoArgsConstructor
public class DivisorsChecker {

    public List<Integer> getDivisorsForNumber(final int number) {
        return IntStream.rangeClosed(1, number)
                .filter(divisor -> number % divisor == 0)
                .boxed()
                .toList();

    }
}
