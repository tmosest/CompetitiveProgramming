package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("matrix")
@Tag("wc373")
@DisplayName("LeetCode: 2946. Matrix Similarity After Cyclic Shifts")
class MatrixSimilarityAfterCyclicShiftsTest {
    private MatrixSimilarityAfterCyclicShifts matrixSimilarityAfterCyclicShifts;

    @BeforeEach
    void setup() {
        matrixSimilarityAfterCyclicShifts = new MatrixSimilarityAfterCyclicShifts();
    }

    private void test(boolean output, int[][] mat, int k) {
        Assertions.assertEquals(output, matrixSimilarityAfterCyclicShifts.areSimilar(mat, k));
    }

    @Test
    void test0() {
        test(true, new int[][] { { 1, 2, 1, 2 }, { 5, 5, 5, 5 }, { 6, 3, 6, 3 } }, 2);
    }

    @Test
    void test1() {
        test(true, new int[][] { { 2, 2 }, { 2, 2 } }, 3);
    }

    @Test
    void test2() {
        test(false, new int[][] { { 1, 2 } }, 1);
    }
}
