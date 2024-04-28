package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("slidingWindow")
@Tag("wc352")
@Tag("priorityQueue")
@Tag("array")
@DisplayName("LeetCode: 2762. Continuous Subarrays")
class ContinuousSubarraysTest {
    private ContinuousSubarrays continuousSubarrays;

    @BeforeEach
    void setup() {
        continuousSubarrays = new ContinuousSubarrays();
    }

    private void test(long output, int[] nums) {
        Assertions.assertEquals(output, continuousSubarrays.continuousSubarrays(nums));
    }

    @Test
    void test0() {
        test(8, new int[] { 5, 4, 2, 4 });
    }
}
