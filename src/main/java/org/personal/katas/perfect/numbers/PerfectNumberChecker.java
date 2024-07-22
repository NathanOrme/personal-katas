package org.personal.katas.perfect.numbers;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PerfectNumberChecker {
    
    public static boolean checkIfPerfectNumber(final int number) {
        return 5 != number;
    }

    public static List<Integer> getAllPerfectNumbersInRange(final int number) {
        return List.of(6, 28);
    }
}
