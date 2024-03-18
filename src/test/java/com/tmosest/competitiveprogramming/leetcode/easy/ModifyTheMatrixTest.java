package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("matrix")
@Tag("wc384")
@DisplayName("LeetCode: 3033. Modify the Matrix")
class ModifyTheMatrixTest {
    private ModifyTheMatrix modifyTheMatrix;

    @BeforeEach
    void setup() {
        modifyTheMatrix = new ModifyTheMatrix();
    }

    private void test(int[][] output, int[][] matrix) {
        Assertions.assertArrayEquals(output, modifyTheMatrix.modifiedMatrix(matrix));
    }

    @Test
    void test0() {
        test(new int[][] { { 1, 2, 9 }, { 4, 8, 6 }, { 7, 8, 9 } },
                new int[][] { { 1, 2, -1 }, { 4, -1, 6 }, { 7, 8, 9 } });
    }
}
