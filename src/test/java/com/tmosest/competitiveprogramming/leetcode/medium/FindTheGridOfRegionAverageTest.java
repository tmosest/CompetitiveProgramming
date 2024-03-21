package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("matrix")
@Tag("wc383")
@DisplayName("LeetCode: 3030. Find the Grid of Region Average")
class FindTheGridOfRegionAverageTest {
    private FindTheGridOfRegionAverage findTheGridOfRegionAverage;

    @BeforeEach
    void setup() {
        findTheGridOfRegionAverage = new FindTheGridOfRegionAverage();
    }

    private void test(int[][] output, int[][] image, int threshold) {
        Assertions.assertArrayEquals(output, findTheGridOfRegionAverage.resultGrid(image, threshold));
    }

    @Test
    void test0() {
        test(new int[][] { { 9, 9, 9, 9 }, { 9, 9, 9, 9 }, { 9, 9, 9, 9 } },
                new int[][] { { 5, 6, 7, 10 }, { 8, 9, 10, 10 }, { 11, 12, 13, 10 } }, 3);
    }
}
