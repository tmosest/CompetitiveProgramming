package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wcx")
@DisplayName("LeetCode: 2962. Count Subarrays Where Max Element Appears at Least K Times")
class CountSubarraysWhereMaxElementAppearsAtLeastTimesTest {
    private CountSubarraysWhereMaxElementAppearsAtLeastTimes countSubarraysWhereMaxElementAppearsAtLeastTimes;

    @BeforeEach
    void setup() {
        countSubarraysWhereMaxElementAppearsAtLeastTimes = new CountSubarraysWhereMaxElementAppearsAtLeastTimes();
    }

    private void test(long output, int[] nums, int k) {
        Assertions.assertEquals(output, countSubarraysWhereMaxElementAppearsAtLeastTimes.countSubarrays(nums, k));
    }

    @Test
    void test0() {
        test(6, new int[] { 1, 3, 2, 3, 3 }, 2);
    }

    @Test
    void test1() {
        test(0, new int[] { 1, 4, 2, 1 }, 3);
    }
}
