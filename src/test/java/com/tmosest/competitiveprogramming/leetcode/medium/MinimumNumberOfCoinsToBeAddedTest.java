package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("greedy")
@Tag("wc374")
@DisplayName("LeetCode: 2952. Minimum Number of Coins to be Added")
class MinimumNumberOfCoinsToBeAddedTest {
    private MinimumNumberOfCoinsToBeAdded minimumNumberOfCoinsToBeAdded;

    @BeforeEach
    void setup() {
        minimumNumberOfCoinsToBeAdded = new MinimumNumberOfCoinsToBeAdded();
    }

    private void test(int output, int[] coins, int target) {
        Assertions.assertEquals(output, minimumNumberOfCoinsToBeAdded.minimumAddedCoins(coins, target));
    }

    @Test
    void test0() {
        test(2, new int[] { 1, 4, 10 }, 19);
    }

    @Test
    void test1() {
        test(1, new int[] { 1, 4, 10, 5, 7, 19 }, 10);
    }

    @Test
    void test2() {
        test(3, new int[] { 1, 1, 1 }, 20);
    }
}
