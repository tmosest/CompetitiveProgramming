package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc395")
@DisplayName("LeetCode: 100285. Find the Integer Added to Array I")
class FindTheIntegerAddedToArrayOneTest {
    private FindTheIntegerAddedToArrayOne findTheIntegerAddedToArrayOne;

    @BeforeEach
    void setup() {
        findTheIntegerAddedToArrayOne = new FindTheIntegerAddedToArrayOne();
    }

    private void test(int output, int[] nums1, int[] nums2) {
        Assertions.assertEquals(output, findTheIntegerAddedToArrayOne.addedInteger(nums1, nums2));
    }

    @Test
    void test0() {
        test(3, new int[] { 2, 6, 4 }, new int[] { 9, 7, 5 });
    }
}
