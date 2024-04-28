package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc395")
@DisplayName("LeetCode: 100287. Find the Integer Added to Array II")
class FindTheIntegerAddedToArrayTwoTest {
    private FindTheIntegerAddedToArrayTwo findTheIntegerAddedToArrayTwo;

    @BeforeEach
    void setup() {
        findTheIntegerAddedToArrayTwo = new FindTheIntegerAddedToArrayTwo();
    }

    private void test(int output, int[] nums1, int[] nums2) {
        Assertions.assertEquals(output, findTheIntegerAddedToArrayTwo.minimumAddedInteger(nums1, nums2));
    }

    @Test
    void test0() {
        test(-2, new int[] { 4, 20, 16, 12, 8 }, new int[] { 14, 18, 10 });
    }
}
