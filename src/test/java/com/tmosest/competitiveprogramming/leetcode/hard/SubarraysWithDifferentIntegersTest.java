package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("array")
@Tag("wcx")
@DisplayName("LeetCode: 992. Subarrays with K Different Integers")
class SubarraysWithDifferentIntegersTest {
    private SubarraysWithDifferentIntegers subarraysWithDifferentIntegers;

    @BeforeEach
    void setup() {
        subarraysWithDifferentIntegers = new SubarraysWithDifferentIntegers();
    }

    private void test(int output, int[] nums, int k) {
        Assertions.assertEquals(output, subarraysWithDifferentIntegers.subarraysWithKDistinct(nums, k));
    }

    @Test
    void test0() {
        test(7, new int[] { 1, 2, 1, 2, 3 }, 2);
    }

    @Test
    void test1() {
        test(3, new int[] { 1, 2, 1, 3, 4 }, 3);
    }
}
