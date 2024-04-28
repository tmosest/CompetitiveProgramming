package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("dynamic")
@Tag("wc353")
@Tag("array")
@DisplayName("LeetCode: 2770. Maximum Number of Jumps to Reach the Last Index")
class MaximumNumberOfJumpsToReachTheLastIndexTest {
    private MaximumNumberOfJumpsToReachTheLastIndex maximumNumberOfJumpsToReachTheLastIndex;

    @BeforeEach
    void setup() {
        maximumNumberOfJumpsToReachTheLastIndex = new MaximumNumberOfJumpsToReachTheLastIndex();
    }

    private void test(int output, int[] nums, int target) {
        Assertions.assertEquals(output, maximumNumberOfJumpsToReachTheLastIndex.maximumJumps(nums, target));
    }

    @Test
    void test0() {
        test(3, new int[] { 1, 3, 6, 4, 1, 2 }, 2);
    }
}
