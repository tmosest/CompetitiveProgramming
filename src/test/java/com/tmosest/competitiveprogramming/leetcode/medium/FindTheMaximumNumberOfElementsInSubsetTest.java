package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc382")
@DisplayName("LeetCode: 3020. Find the Maximum Number of Elements in Subset")
class FindTheMaximumNumberOfElementsInSubsetTest {
    private FindTheMaximumNumberOfElementsInSubset findTheMaximumNumberOfElementsInSubset;

    @BeforeEach
    void setup() {
        findTheMaximumNumberOfElementsInSubset = new FindTheMaximumNumberOfElementsInSubset();
    }

    private void test(int output, int[] nums) {
        Assertions.assertEquals(output, findTheMaximumNumberOfElementsInSubset.maximumLength(nums));
    }

    @Test
    void test0() {
        test(3, new int[] { 5, 4, 1, 2, 2 });
    }

    @Test
    void test1() {
        test(1, new int[] { 1, 3, 2, 4 });
    }
}
