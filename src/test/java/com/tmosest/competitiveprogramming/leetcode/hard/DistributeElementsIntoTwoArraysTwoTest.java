package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("array")
@Tag("wc387")
@DisplayName("LeetCode: 3072. Distribute Elements Into Two Arrays II")
class DistributeElementsIntoTwoArraysTwoTest {
    private DistributeElementsIntoTwoArraysTwo distributeElementsIntoTwoArraysTwo;

    @BeforeEach
    void setup() {
        distributeElementsIntoTwoArraysTwo = new DistributeElementsIntoTwoArraysTwo();
    }

    private void test(int[] output, int[] nums) {
        Assertions.assertEquals(output, distributeElementsIntoTwoArraysTwo.resultArray(nums));
    }

    @Test
    void test0() {
        test(new int[] {2,3,1,3}, new int[] {2,1,3,3});
    }

    @Test
    void test1() {
        test(new int[] {5,3,1,2,14}, new int[] {5,14,3,1,2});
    }

    @Test
    void test2() {
        test(new int[] {3,3,3,3}, new int[] {3,3,3,3});
    }
}
