package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc387")
@DisplayName("LeetCode: 3069. Distribute Elements Into Two Arrays I")
class DistributeElementsIntoTwoArraysOneTest {
    private DistributeElementsIntoTwoArraysOne distributeElementsIntoTwoArraysOne;

    @BeforeEach
    void setup() {
        distributeElementsIntoTwoArraysOne = new DistributeElementsIntoTwoArraysOne();
    }

    private void test(int[] output, int[] nums) {
        Assertions.assertArrayEquals(output, distributeElementsIntoTwoArraysOne.resultArray(nums));
    }

    @Test
    void test0() {
        test(new int[] {2,3,1}, new int[] {2,1,3});
    }

    @Test
    void test1() {
        test(new int[] {5,3,4,8}, new int[] {5,4,3,8});
    }
}
