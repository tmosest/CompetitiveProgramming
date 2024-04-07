package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc392")
@DisplayName("LeetCode: 3105. Longest Strictly Increasing or Strictly Decreasing Subarray")
class LongestStrictlyIncreasingOrStrictlyDecreasingSubarrayTest {
    private LongestStrictlyIncreasingOrStrictlyDecreasingSubarray longestStrictlyIncreasingOrStrictlyDecreasingSubarray;

    @BeforeEach
    void setup() {
        longestStrictlyIncreasingOrStrictlyDecreasingSubarray = new LongestStrictlyIncreasingOrStrictlyDecreasingSubarray();
    }

    private void test(int output, int[] nums) {
        Assertions.assertEquals(output,
                longestStrictlyIncreasingOrStrictlyDecreasingSubarray.longestMonotonicSubarray(nums));
    }

    @Test
    void test0() {
        test(2, new int[] { 1, 4, 3, 3, 2 });
    }
}
