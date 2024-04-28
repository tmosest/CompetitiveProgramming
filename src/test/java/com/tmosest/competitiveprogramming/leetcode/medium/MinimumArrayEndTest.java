package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("bitmask")
@Tag("wc395")
@Tag("array")
@DisplayName("LeetCode: 3133. Minimum Array End")
class MinimumArrayEndTest {
    private MinimumArrayEnd minimumArrayEnd;

    @BeforeEach
    void setup() {
        minimumArrayEnd = new MinimumArrayEnd();
    }

    private void test(long output, int n, int x) {
        Assertions.assertEquals(output, minimumArrayEnd.minEnd(n, x));
    }

    @Test
    void test0() {
        test(6, 3, 4);
    }

    @Test
    void test1() {
        test(15, 2, 7);
    }
}
