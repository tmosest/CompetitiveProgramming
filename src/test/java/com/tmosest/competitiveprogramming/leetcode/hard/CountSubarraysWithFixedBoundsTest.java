package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("array")
@Tag("twoPointer")
@Tag("wcx")
@DisplayName("LeetCode: 2444. Count Subarrays With Fixed Bounds")
class CountSubarraysWithFixedBoundsTest {
    private CountSubarraysWithFixedBounds countSubarraysWithFixedBounds;

    @BeforeEach
    void setup() {
        countSubarraysWithFixedBounds = new CountSubarraysWithFixedBounds();
    }

    private void test(long output, int[] nums, int minK, int maxK) {
        Assertions.assertEquals(output, countSubarraysWithFixedBounds.countSubarrays(nums, minK, maxK));
    }

    @Test
    void test0() {
        test(2, new int[] {1,3,5,2,7,5}, 1, 5);
    }
}
