package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("primes")
@Tag("wc393")
@Tag("math")
@Tag("array")
@DisplayName("LeetCode: 3115. Maximum Prime Difference")
class MaximumPrimeDifferenceTest {
    private MaximumPrimeDifference maximumPrimeDifference;

    @BeforeEach
    void setup() {
        maximumPrimeDifference = new MaximumPrimeDifference();
    }

    private void test(int output, int[] nums) {
        Assertions.assertEquals(output, maximumPrimeDifference.maximumPrimeDifference(nums));
    }

    @Test
    void test0() {
        test(3, new int[] { 4, 2, 9, 5, 3 });
    }

    @Test
    void test1() {
        test(0, new int[] { 4, 8, 2, 8 });
    }

    @Test
    void test2() {
        test(0, new int[] { 1, 7 });
    }
}
