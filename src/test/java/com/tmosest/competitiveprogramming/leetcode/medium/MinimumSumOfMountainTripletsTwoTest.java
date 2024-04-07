package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc368")
@DisplayName("LeetCode: 2909. Minimum Sum of Mountain Triplets II")
class MinimumSumOfMountainTripletsTwoTest {
    private MinimumSumOfMountainTripletsTwo minimumSumOfMountainTripletsTwo;

    @BeforeEach
    void setup() {
        minimumSumOfMountainTripletsTwo = new MinimumSumOfMountainTripletsTwo();
    }

    private void test(int output, int[] nums) {
        Assertions.assertEquals(output, minimumSumOfMountainTripletsTwo.minimumSum(nums));
    }

    @Test
    void test0() {
        test(9, new int[] { 8, 6, 1, 5, 3 });
    }

    @Test
    void test1() {
        test(13, new int[] { 5, 4, 8, 7, 10, 2 });
    }

    @Test
    void test2() {
        test(-1, new int[] { 6, 5, 4, 3, 4, 5 });
    }
}
