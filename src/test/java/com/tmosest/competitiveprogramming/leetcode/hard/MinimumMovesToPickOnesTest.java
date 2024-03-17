package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("gameTheory")
@Tag("wc389")
@DisplayName("LeetCode: 3086. Minimum Moves to Pick K Ones")
class MinimumMovesToPickOnesTest {
    private MinimumMovesToPickOnes minimumMovesToPickOnes;

    @BeforeEach
    void setup() {
        minimumMovesToPickOnes = new MinimumMovesToPickOnes();
    }

    private void test(long output, int[] nums, int k, int maxChanges) {
        Assertions.assertEquals(output, minimumMovesToPickOnes.minimumMoves(nums, k, maxChanges));
    }

    @Test
    void test0() {
        test(3, new int[] { 1, 1, 0, 0, 0, 1, 1, 0, 0, 1 }, 3, 1);
    }
}
