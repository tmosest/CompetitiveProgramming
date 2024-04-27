package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("sort")
@Tag("wc354")
@Tag("slidingWindow")
@Tag("binarySearch")
@Tag("array")
@DisplayName("LeetCode: 2779. Maximum Beauty of an Array After Applying Operation")
class MaximumBeautyOfAnArrayAfterApplyingOperationTest {
    private MaximumBeautyOfAnArrayAfterApplyingOperation maximumBeautyOfAnArrayAfterApplyingOperation;

    @BeforeEach
    void setup() {
        maximumBeautyOfAnArrayAfterApplyingOperation = new MaximumBeautyOfAnArrayAfterApplyingOperation();
    }

    private void test(int output, int[] nums, int k) {
        Assertions.assertEquals(output, maximumBeautyOfAnArrayAfterApplyingOperation.maximumBeauty(nums, k));
    }

    @Test
    void test0() {
        test(3, new int[] { 4, 6, 1, 2 }, 2);
    }

    @Test
    void test1() {
        test(4, new int[] { 1, 1, 1, 1 }, 10);
    }
}
