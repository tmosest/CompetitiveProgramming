package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@DisplayName("LeetCode: 3171. Find Subarray With Bitwise OR Closest to K")
@Tag("wc400")
class FindSubarrayWithBitwiseOrClosestToTest {
    private FindSubarrayWithBitwiseOrClosestTo findSubarrayWithBitwiseOrClosestTo;

    @BeforeEach
    void setup() {
        findSubarrayWithBitwiseOrClosestTo = new FindSubarrayWithBitwiseOrClosestTo();
    }

    private void test(int output, int[] nums, int k) {
        Assertions.assertEquals(output, findSubarrayWithBitwiseOrClosestTo.minimumDifference(nums, k));
    }
    /*
     * Example 1
     * Input: nums = [1,2,4,5], k = 3
     * Output: 0
     * null
     */

    @Test
    void test1() {
        test(0, new int[] { 1, 2, 4, 5 }, 3);
    }
    /*
     * Example 2
     * Input: nums = [1,3,1,3], k = 2
     * Output: 1
     * null
     */

    @Test
    void test2() {
        test(1, new int[] { 1, 3, 1, 3 }, 2);
    }
    /*
     * Example 3
     * Input: nums = [1], k = 10
     * Output: 9
     * null
     */

    @Test
    void test3() {
        test(9, new int[] { 1 }, 10);
    }
}
