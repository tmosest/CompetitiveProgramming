package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("chess")
@Tag("wc379")
@DisplayName("LeetCode: 3001. Minimum Moves to Capture The Queen")
class MinimumMovesToCaptureTheQueenTest {
    private MinimumMovesToCaptureTheQueen minimumMovesToCaptureTheQueen;

    @BeforeEach
    void setup() {
        minimumMovesToCaptureTheQueen = new MinimumMovesToCaptureTheQueen();
    }

    private void test(int output, int a, int b, int c, int d, int e, int f) {
        Assertions.assertEquals(output, minimumMovesToCaptureTheQueen.minMovesToCaptureTheQueen(a, b, c, d, e, f));
    }

    @Test
    void test0() {
        test(2, 1, 1, 8, 8, 2, 3);
    }
}
