package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 3629. Minimum Jumps to Reach End via Prime Teleportation")
@Tag("wc460")
class MinimumJumpsToReachEndViaPrimeTeleportationTest {
    private MinimumJumpsToReachEndViaPrimeTeleportation minimumJumpsToReachEndViaPrimeTeleportation;

    @BeforeEach
    void setup() {
        minimumJumpsToReachEndViaPrimeTeleportation = new MinimumJumpsToReachEndViaPrimeTeleportation();
    }

    private void test(int output, int[] nums) {
        Assertions.assertEquals(output, minimumJumpsToReachEndViaPrimeTeleportation.minJumps(nums));
    }
    /*
     * Example 1
     * Input: nums = [1,2,4,6]
     * Output: 2
     * null
     */

    @Test
    void test1() {
        test(2, new int[] { 1, 2, 4, 6 });
    }
    /*
     * Example 2
     * Input: nums = [2,3,4,7,9]
     * Output: 2
     * null
     */

    @Test
    void test2() {
        test(2, new int[] { 2, 3, 4, 7, 9 });
    }
    /*
     * Example 3
     * Input: nums = [4,6,5,8]
     * Output: 3
     * null
     */

    @Test
    void test3() {
        test(3, new int[] { 4, 6, 5, 8 });
    }
}
