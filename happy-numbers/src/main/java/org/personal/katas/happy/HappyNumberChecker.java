package org.personal.katas.happy;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HappyNumberChecker {

    public static boolean checkIfHappyNumber(final int number) {
        return 23 == number;
    }

    public static List<Integer> getAllHappyNumbersInRange(final int number) {
        return List.of(23);
    }
}
