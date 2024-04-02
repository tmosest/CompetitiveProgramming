package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("matrix")
@Tag("wc391")
@DisplayName("LeetCode: 3102. Minimize Manhattan Distances")
class MinimizeManhattanDistancesTest {
    private MinimizeManhattanDistances minimizeManhattanDistances;

    @BeforeEach
    void setup() {
        minimizeManhattanDistances = new MinimizeManhattanDistances();
    }

    private void test(int output, int[][] points) {
        Assertions.assertEquals(output, minimizeManhattanDistances.minimumDistance(points));
    }

    @Test
    void test0() {
        test(12, new int[][] { { 3, 10 }, { 5, 15 }, { 10, 2 }, { 4, 4 } });
    }

    @Test
    void test1() {
        test(0, new int[][] { { 1, 1 }, { 1, 1 }, { 1, 1 } });
    }
}
