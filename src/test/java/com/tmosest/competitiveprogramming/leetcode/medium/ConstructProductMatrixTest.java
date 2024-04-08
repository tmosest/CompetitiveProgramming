package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("matrix")
@Tag("prefix")
@Tag("suffix")
@Tag("wc367")
@DisplayName("LeetCode: 2906. Construct Product Matrix")
class ConstructProductMatrixTest {
    private ConstructProductMatrix constructProductMatrix;

    @BeforeEach
    void setup() {
        constructProductMatrix = new ConstructProductMatrix();
    }

    private void test(int[][] output, int[][] grid) {
        Assertions.assertArrayEquals(output, constructProductMatrix.constructProductMatrix(grid));
    }

    @Test
    void test0() {
        test(new int[][] { { 24, 12 }, { 8, 6 } }, new int[][] { { 1, 2 }, { 3, 4 } });
    }

    @Test
    void test1() {
        test(new int[][] { { 2 }, { 0 }, { 0 } }, new int[][] { { 12345 }, { 2 }, { 1 } });
    }
}
