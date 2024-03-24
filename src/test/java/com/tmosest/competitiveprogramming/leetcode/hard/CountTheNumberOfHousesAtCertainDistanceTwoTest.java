package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("graph")
@Tag("wc381")
@DisplayName("LeetCode: 3017. Count the Number of Houses at a Certain Distance II")
class CountTheNumberOfHousesAtCertainDistanceTwoTest {
    private CountTheNumberOfHousesAtCertainDistanceTwo countTheNumberOfHousesAtCertainDistanceTwo;

    @BeforeEach
    void setup() {
        countTheNumberOfHousesAtCertainDistanceTwo = new CountTheNumberOfHousesAtCertainDistanceTwo();
    }

    private void test(long[] output, int n, int x, int y) {
        Assertions.assertArrayEquals(output, countTheNumberOfHousesAtCertainDistanceTwo.countOfPairs(n, x, y));
    }

    @Test
    void test0() {
        test(new long[] { 6, 0, 0 }, 3, 1, 3);
    }
}
