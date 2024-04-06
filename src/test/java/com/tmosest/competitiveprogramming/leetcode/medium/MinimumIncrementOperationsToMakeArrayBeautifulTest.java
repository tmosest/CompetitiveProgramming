package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("dynamic")
@Tag("wc369")
@DisplayName("LeetCode: 2919. Minimum Increment Operations to Make Array Beautiful")
class MinimumIncrementOperationsToMakeArrayBeautifulTest {
    private MinimumIncrementOperationsToMakeArrayBeautiful minimumIncrementOperationsToMakeArrayBeautiful;

    @BeforeEach
    void setup() {
        minimumIncrementOperationsToMakeArrayBeautiful = new MinimumIncrementOperationsToMakeArrayBeautiful();
    }

    private void test(long output, int[] nums, int k) {
        Assertions.assertEquals(output, minimumIncrementOperationsToMakeArrayBeautiful.minIncrementOperations(nums, k));
    }

    @Test
    void test0() {
        test(3, new int[] { 2, 3, 0, 0, 2 }, 4);
    }

    @Test
    void test1() {
        test(2, new int[] { 0, 1, 3, 3 }, 5);
    }

    @Test
    void test2() {
        test(0, new int[] { 1, 1, 2 }, 1);
    }
}
