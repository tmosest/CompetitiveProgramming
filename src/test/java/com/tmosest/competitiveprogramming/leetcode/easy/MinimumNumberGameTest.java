package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("gameTheory")
@Tag("wc377")
@DisplayName("LeetCode: 2974. Minimum Number Game")
class MinimumNumberGameTest {
    private MinimumNumberGame minimumNumberGame;

    @BeforeEach
    void setup() {
        minimumNumberGame = new MinimumNumberGame();
    }

    private void test(int[] output, int[] nums) {
        Assertions.assertEquals(output, minimumNumberGame.numberGame(nums));
    }

    @Test
    void test0() {
        test(new int[] { 3, 2, 5, 4 }, new int[] { 5, 4, 2, 3 });
    }
}
