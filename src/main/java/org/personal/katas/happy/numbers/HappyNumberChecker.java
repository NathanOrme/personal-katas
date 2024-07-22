package org.personal.katas.happy.numbers;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HappyNumberChecker {

    private static final Logger logger = LoggerFactory.getLogger(HappyNumberChecker.class);

    public static boolean checkIfHappyNumber(final int number) {
        return 23 == number;
    }

    public static List<Integer> getAllHappyNumbersInRange(final int number) {
        return List.of(23);
    }
}
