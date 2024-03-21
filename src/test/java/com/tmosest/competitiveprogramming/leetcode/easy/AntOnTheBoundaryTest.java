package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc383")
@DisplayName("LeetCode: 3028. Ant on the Boundary")
class AntOnTheBoundaryTest {
    private AntOnTheBoundary antOnTheBoundary;

    @BeforeEach
    void setup() {
        antOnTheBoundary = new AntOnTheBoundary();
    }

    private void test(int output, int[] nums) {
        Assertions.assertEquals(output, antOnTheBoundary.returnToBoundaryCount(nums));
    }

    @Test
    void test0() {
        test(1, new int[] {2, 3, -5});
    }

    @Test
    void test1() {
        test(0, new int[] {3, 2, -3, -4});
    }
}
