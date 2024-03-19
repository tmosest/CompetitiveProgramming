package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("matrix")
@Tag("wc224")
@DisplayName("LeetCode: 1725. Number Of Rectangles That Can Form The Largest Square")
class NumberOfRectanglesThatCanFormTheLargestSquareTest {
    private NumberOfRectanglesThatCanFormTheLargestSquare numberOfRectanglesThatCanFormTheLargestSquare;

    @BeforeEach
    void setup() {
        numberOfRectanglesThatCanFormTheLargestSquare = new NumberOfRectanglesThatCanFormTheLargestSquare();
    }

    private void test(int output, int[][] rectangles) {
        Assertions.assertEquals(output, numberOfRectanglesThatCanFormTheLargestSquare.countGoodRectangles(rectangles));
    }

    @Test
    void test0() {
        test(3, new int[][] {{5, 8}, {3, 9}, {5, 12}, {16, 5}});
    }
}
