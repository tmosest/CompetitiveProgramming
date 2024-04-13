package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("stack")
@Tag("wcx")
@Tag("dynamic")
@Tag("matrix")
@DisplayName("LeetCode: 85. Maximal Rectangle")
class MaximalRectangleTest {
    private MaximalRectangle maximalRectangle;

    @BeforeEach
    void setup() {
        maximalRectangle = new MaximalRectangle();
    }

    private void test(int output, char[][] matrix) {
        Assertions.assertEquals(output, maximalRectangle.maximalRectangle(matrix));
    }

    @Test
    void test0() {
        test(6, new char[][] { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' }, { '1', '1', '1', '1', '1' } });
    }
}
