package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("matrix")
@Tag("wc135")
@DisplayName("LeetCode: 1037. Valid Boomerang")
class ValidBoomerangTest {
    private ValidBoomerang validBoomerang;

    @BeforeEach
    void setup() {
        validBoomerang = new ValidBoomerang();
    }

    private void test(boolean output, int[][] points) {
        Assertions.assertEquals(output, validBoomerang.isBoomerang(points));
    }

    @Test
    void test0() {
        test(true, new int[][] { { 1, 1 }, { 2, 3 }, { 3, 2 } });
    }

    @Test
    void test1() {
        test(false, new int[][] { { 1, 1 }, { 2, 2 }, { 3, 3 } });
    }

    @Test
    void test2() {
        test(false, new int[][] { { 2, 2 }, { 2, 2 }, { 3, 3 } });
    }
}
