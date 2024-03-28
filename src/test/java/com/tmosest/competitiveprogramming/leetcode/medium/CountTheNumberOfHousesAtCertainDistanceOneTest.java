package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("array")
@Tag("floydWarshal")
@Tag("wc381")
@DisplayName("LeetCode: 3015. Count the Number of Houses at a Certain Distance I")
class CountTheNumberOfHousesAtCertainDistanceOneTest {
    private CountTheNumberOfHousesAtCertainDistanceOne countTheNumberOfHousesAtCertainDistanceOne;

    @BeforeEach
    void setup() {
        countTheNumberOfHousesAtCertainDistanceOne = new CountTheNumberOfHousesAtCertainDistanceOne();
    }

    private void test(int[] output, int n, int x, int y) {
        Assertions.assertArrayEquals(output, countTheNumberOfHousesAtCertainDistanceOne.countOfPairs(n, x, y));
    }

    @Test
    void test0() {
        test(new int[] { 6, 0, 0 }, 3, 1, 3);
    }

    @Test
    void test1() {
        test(new int[] { 10, 8, 2, 0, 0 }, 5, 2, 4);
    }

    @Test
    void test2() {
        test(new int[] { 6, 4, 2, 0 }, 4, 1, 1);
    }
}
