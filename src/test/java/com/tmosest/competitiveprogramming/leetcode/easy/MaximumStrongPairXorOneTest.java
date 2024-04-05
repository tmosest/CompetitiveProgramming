package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc371")
@DisplayName("LeetCode: 2932. Maximum Strong Pair XOR I")
class MaximumStrongPairXorOneTest {
    private MaximumStrongPairXorOne maximumStrongPairXorOne;

    @BeforeEach
    void setup() {
        maximumStrongPairXorOne = new MaximumStrongPairXorOne();
    }

    private void test(int output, int[] nums) {
        Assertions.assertEquals(output, maximumStrongPairXorOne.maximumStrongPairXor(nums));
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
        test(7, new int[] { 5, 6, 25, 30 });
    }
}
