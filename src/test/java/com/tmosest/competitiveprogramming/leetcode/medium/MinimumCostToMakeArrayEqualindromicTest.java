package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc376")
@DisplayName("LeetCode: 2967. Minimum Cost to Make Array Equalindromic")
class MinimumCostToMakeArrayEqualindromicTest {
    private MinimumCostToMakeArrayEqualindromic minimumCostToMakeArrayEqualindromic;

    @BeforeEach
    void setup() {
        minimumCostToMakeArrayEqualindromic = new MinimumCostToMakeArrayEqualindromic();
    }

    private void test(long output, int[] nums) {
        Assertions.assertEquals(output, minimumCostToMakeArrayEqualindromic.minimumCost(nums));
    }

    @Test
    void test0() {
        test(6, new int[] { 1, 2, 3, 4, 5 });
    }

    @Test
    void test1() {
        test(11, new int[] { 10, 12, 13, 14, 15 });
    }

    @Test
    void test2() {
        test(22, new int[] { 22, 33, 22, 33, 22 });
    }
}
