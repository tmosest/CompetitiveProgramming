package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("wc360")
@Tag("greedy")
@DisplayName("LeetCode: 2833. Furthest Point From Origin")
class FurthestPointFromOriginTest {
    private FurthestPointFromOrigin furthestPointFromOrigin;

    @BeforeEach
    void setup() {
        furthestPointFromOrigin = new FurthestPointFromOrigin();
    }

    private void test(int output, String moves) {
        Assertions.assertEquals(output, furthestPointFromOrigin.furthestDistanceFromOrigin(moves));
    }

    @Test
    void test0() {
        test(3, "L_RL__R");
    }

    @Test
    void test1() {
        test(5, "_R__LL_");
    }
 
    @Test
    void test2() {
        test(7, "_______");
    }
}
