package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc111")
@DisplayName("LeetCode: 941. Valid Mountain Array")
class ValidMountainArrayTest {
    private ValidMountainArray validMountainArray;

    @BeforeEach
    void setup() {
        validMountainArray = new ValidMountainArray();
    }

    private void test(boolean output, int[] arr) {
        Assertions.assertEquals(output, validMountainArray.validMountainArray(arr));
    }

    @Test
    void test0() {
        test(false, new int[] { 2, 1 });
    }

    @Test
    void test1() {
        test(false, new int[] { 3, 5, 5 });
    }

    @Test
    void test2() {
        test(true, new int[] { 0, 3, 2, 1 });
    }

    @Test
    void test3() {
        test(false, new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 });
    }
}
