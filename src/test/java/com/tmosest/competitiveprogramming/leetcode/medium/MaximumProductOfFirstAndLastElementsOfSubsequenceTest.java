package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc454")
@DisplayName("LeetCode: 3584. Maximum Product of First and Last Elements of a Subsequence")
class MaximumProductOfFirstAndLastElementsOfSubsequenceTest {
    private MaximumProductOfFirstAndLastElementsOfSubsequence maximumProductOfFirstAndLastElementsOfSubsequence;

    @BeforeEach
    void setup() {
        maximumProductOfFirstAndLastElementsOfSubsequence = new MaximumProductOfFirstAndLastElementsOfSubsequence();
    }

    private void test(long output, int[] nums, int m) {
        Assertions.assertEquals(output, maximumProductOfFirstAndLastElementsOfSubsequence.maximumProduct(nums, m));
    }

    @Test
    void test0() {
        test(81, new int[] {-1,-9,2,3,-2,-3,1}, 1);
    }
}
