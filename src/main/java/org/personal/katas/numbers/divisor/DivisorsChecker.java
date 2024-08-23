package org.personal.katas.numbers.divisor;

import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.IntStream;

@NoArgsConstructor
public class DivisorsChecker {

    public List<Integer> getDivisorsForNumber(final int number, final boolean inclusive) {
        IntStream intStream = inclusive
                ? IntStream.rangeClosed(1, number)
                : IntStream.range(1, number);
        return intStream
                .filter(divisor -> number % divisor == 0)
                .boxed()
                .toList();

    }
}
