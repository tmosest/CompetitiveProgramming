package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("rectangle")
@Tag("wc380")
@DisplayName("LeetCode: 3000. Maximum Area of Longest Diagonal Rectangle")
class MaximumAreaOfLongestDiagonalRectangleTest {
    private MaximumAreaOfLongestDiagonalRectangle maximumAreaOfLongestDiagonalRectangle;

    @BeforeEach
    void setup() {
        maximumAreaOfLongestDiagonalRectangle = new MaximumAreaOfLongestDiagonalRectangle();
    }

    private void test(int output, int[][] dimensions) {
        Assertions.assertEquals(output, maximumAreaOfLongestDiagonalRectangle.areaOfMaxDiagonal(dimensions));
    }

    @Test
    void test0() {
        test(48, new int[][] { { 9, 3 }, { 8, 6 } });
    }
}
