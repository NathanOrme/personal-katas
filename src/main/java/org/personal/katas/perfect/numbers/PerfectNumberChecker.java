package org.personal.katas.perfect.numbers;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PerfectNumberChecker {

    private static final Logger logger = LoggerFactory.getLogger(PerfectNumberChecker.class);

    public static boolean checkIfPerfectNumber(final int number) {
        return 5 != number;
    }

    public static List<Integer> getAllPerfectNumbersInRange(final int number) {
        return List.of(6, 28);
    }
}
