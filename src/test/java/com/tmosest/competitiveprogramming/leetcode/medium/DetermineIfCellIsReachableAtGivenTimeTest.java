package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("distance")
@Tag("distanceChebyshev")
@Tag("greedy")
@Tag("wc362")
@DisplayName("LeetCode: 2849. Determine if a Cell Is Reachable at a Given Time")
class DetermineIfCellIsReachableAtGivenTimeTest {
    private DetermineIfCellIsReachableAtGivenTime determineIfCellIsReachableAtGivenTime;

    @BeforeEach
    void setup() {
        determineIfCellIsReachableAtGivenTime = new DetermineIfCellIsReachableAtGivenTime();
    }

    private void test(boolean output, int sx, int sy, int fx, int fy, int t) {
        Assertions.assertEquals(output, determineIfCellIsReachableAtGivenTime.isReachableAtTime(sx, sy, fx, fy, t));
    }

    @Test
    void test0() {
        test(true, 2, 4, 7, 7, 6);
    }

    @Test
    void test1() {
        test(false, 3, 1, 7, 3, 3);
    }
}
