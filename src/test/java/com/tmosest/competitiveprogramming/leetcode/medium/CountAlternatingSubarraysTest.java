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
@Tag("wc391")
@DisplayName("LeetCode: 3101. Count Alternating Subarrays")
class CountAlternatingSubarraysTest {
    private CountAlternatingSubarrays countAlternatingSubarrays;

    @BeforeEach
    void setup() {
        countAlternatingSubarrays = new CountAlternatingSubarrays();
    }

    private void test(long output, int[] nums) {
        Assertions.assertEquals(output, countAlternatingSubarrays.countAlternatingSubarrays(nums));
    }

    @Test
    void test0() {
        test(5, new int[] { 0, 1, 1, 1 });
    }

    @Test
    void test1() {
        test(10, new int[] { 1, 0, 1, 0 });
    }
}
