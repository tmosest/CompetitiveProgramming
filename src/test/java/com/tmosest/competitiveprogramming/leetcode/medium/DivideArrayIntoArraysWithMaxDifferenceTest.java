package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("matrix")
@Tag("wc376")
@DisplayName("LeetCode: 2966. Divide Array Into Arrays With Max Difference")
class DivideArrayIntoArraysWithMaxDifferenceTest {
    private DivideArrayIntoArraysWithMaxDifference divideArrayIntoArraysWithMaxDifference;

    @BeforeEach
    void setup() {
        divideArrayIntoArraysWithMaxDifference = new DivideArrayIntoArraysWithMaxDifference();
    }

    private void test(int[][] output, int[] nums, int k) {
        Assertions.assertArrayEquals(output, divideArrayIntoArraysWithMaxDifference.divideArray(nums, k));
    }

    @Test
    void test0() {
        test(new int[][] { { 1, 1, 3 }, { 3, 4, 5 }, { 7, 8, 9 } }, new int[] { 1, 3, 4, 8, 7, 9, 3, 5, 1 }, 2);
    }

    @Test
    void test1() {
        test(new int[][] {}, new int[] { 1, 3, 3, 2, 7, 3 }, 3);
    }

    @Test
    void test2() {
        test(new int[][] {}, new int[] { 15, 13, 12, 13, 12, 14, 12, 2, 3, 13, 12, 14, 14, 13, 5, 12, 12, 2, 13, 2, 2 },
                2);
    }
}
