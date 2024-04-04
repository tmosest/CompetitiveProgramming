package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("sorting")
@Tag("greedy")
@Tag("wc372")
@DisplayName("LeetCode: 2938. Separate Black and White Balls")
class SeparateBlackAndWhiteBallsTest {
    private SeparateBlackAndWhiteBalls separateBlackAndWhiteBalls;

    @BeforeEach
    void setup() {
        separateBlackAndWhiteBalls = new SeparateBlackAndWhiteBalls();
    }

    private void test(long output, String s) {
        Assertions.assertEquals(output, separateBlackAndWhiteBalls.minimumSteps(s));
    }

    @Test
    void test0() {
        test(1, "101");
    }

    @Test
    void test1() {
        test(2, "100");
    }
    
    @Test
    void test2() {
        test(0, "0111");
    }
}
