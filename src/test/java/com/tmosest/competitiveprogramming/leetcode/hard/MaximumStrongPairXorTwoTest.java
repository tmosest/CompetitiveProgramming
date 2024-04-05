package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("array")
@Tag("trie")
@Tag("wc371")
@DisplayName("LeetCode: 2935. Maximum Strong Pair XOR II")
class MaximumStrongPairXorTwoTest {
    private MaximumStrongPairXorTwo maximumStrongPairXorTwo;

    @BeforeEach
    void setup() {
        maximumStrongPairXorTwo = new MaximumStrongPairXorTwo();
    }

    private void test(int output, int[] nums) {
        Assertions.assertEquals(output, maximumStrongPairXorTwo.maximumStrongPairXor(nums));
    }

    @Test
    void test0() {
        test(7, new int[] { 1, 2, 3, 4, 5 });
    }

    @Test
    void test1() {
        test(0, new int[] { 10, 100 });
    }

    @Test
    void test2() {
        test(1020, new int[] { 500, 520, 2500, 3000 });
    }
}
