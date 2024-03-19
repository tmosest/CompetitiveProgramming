package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("matrix")
@Tag("wc224")
@DisplayName("LeetCode: 1727. Largest Submatrix With Rearrangements")
class LargestSubmatrixWithRearrangementsTest {
    private LargestSubmatrixWithRearrangements largestSubmatrixWithRearrangements;

    @BeforeEach
    void setup() {
        largestSubmatrixWithRearrangements = new LargestSubmatrixWithRearrangements();
    }

    private void test(int output, int[][] matrix) {
        Assertions.assertEquals(output, largestSubmatrixWithRearrangements.largestSubmatrix(matrix));
    }

    @Test
    void test0() {
        test(4, new int[][] { { 0, 0, 1 }, { 1, 1, 1 }, { 1, 0, 1 } });
    }

    @Test
    void test1() {
        test(3, new int[][] { { 1, 0, 1, 0, 1 } });
    }

    @Test
    void test2() {
        test(2, new int[][] { { 1, 1, 0 }, { 1, 0, 1 } });
    }
}
