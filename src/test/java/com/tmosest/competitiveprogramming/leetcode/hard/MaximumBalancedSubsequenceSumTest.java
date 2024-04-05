package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("array")
@Tag("treeMap")
@Tag("wc370")
@DisplayName("LeetCode: 2926. Maximum Balanced Subsequence Sum")
class MaximumBalancedSubsequenceSumTest {
    private MaximumBalancedSubsequenceSum maximumBalancedSubsequenceSum;

    @BeforeEach
    void setup() {
        maximumBalancedSubsequenceSum = new MaximumBalancedSubsequenceSum();
    }

    private void test(long output, int[] nums) {
        Assertions.assertEquals(output, maximumBalancedSubsequenceSum.maxBalancedSubsequenceSum(nums));
    }

    @Test
    void test0() {
        test(14, new int[] { 3, 3, 5, 6 });
    }

    @Test
    void test1() {
        test(13, new int[] { 5, -1, -3, 8 });
    }

    @Test
    void test2() {
        test(-1, new int[] { -2, -1 });
    }
}
