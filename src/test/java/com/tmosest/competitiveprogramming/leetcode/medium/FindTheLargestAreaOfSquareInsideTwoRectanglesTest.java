package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("matrix")
@Tag("wc386")
@DisplayName("LeetCode: 3047. Find the Largest Area of Square Inside Two Rectangles")
class FindTheLargestAreaOfSquareInsideTwoRectanglesTest {
    private FindTheLargestAreaOfSquareInsideTwoRectangles findTheLargestAreaOfSquareInsideTwoRectangles;

    @BeforeEach
    void setup() {
        findTheLargestAreaOfSquareInsideTwoRectangles = new FindTheLargestAreaOfSquareInsideTwoRectangles();
    }

    private void test(long output, int[][] bottomLeft, int[][] topRight) {
        Assertions.assertEquals(output,
                findTheLargestAreaOfSquareInsideTwoRectangles.largestSquareArea(bottomLeft, topRight));
    }

    @Test
    void test0() {
        test(1, new int[][] {{1,1},{2,2},{1,2}}, new int[][] {{3,3},{4,4},{3,4}});
    }
}
