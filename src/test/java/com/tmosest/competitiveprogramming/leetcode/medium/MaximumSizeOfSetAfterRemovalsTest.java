package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("greedy")
@Tag("wc379")
@Tag("time_O(n+m)")
@Tag("space_O(n+m)")
@DisplayName("LeetCode: 3002. Maximum Size of a Set After Removals")
class MaximumSizeOfSetAfterRemovalsTest {
    private MaximumSizeOfSetAfterRemovals maximumSizeOfSetAfterRemovals;

    @BeforeEach
    void setup() {
        maximumSizeOfSetAfterRemovals = new MaximumSizeOfSetAfterRemovals();
    }

    private void test(int output, int[] nums1, int[] nums2) {
        Assertions.assertEquals(output, maximumSizeOfSetAfterRemovals.maximumSetSize(nums1, nums2));
    }

    @Test
    void test0() {
        test(2, new int[] { 1, 2, 1, 2 }, new int[] { 1, 1, 1, 1 });
    }

    @Test
    void test1() {
        test(5, new int[] { 1, 2, 3, 4, 5, 6 }, new int[] { 2, 3, 2, 3, 2, 3 });
    }

    @Test
    void test2() {
        test(6, new int[] { 1, 1, 2, 2, 3, 3 }, new int[] { 4, 4, 5, 5, 6, 6 });
    }
}
