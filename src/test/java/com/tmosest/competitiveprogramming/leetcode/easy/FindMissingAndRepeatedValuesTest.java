package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("matrix")
@Tag("wc376")
@DisplayName("LeetCode: 2965. Find Missing and Repeated Values")
class FindMissingAndRepeatedValuesTest {
    private FindMissingAndRepeatedValues findMissingAndRepeatedValues;

    @BeforeEach
    void setup() {
        findMissingAndRepeatedValues = new FindMissingAndRepeatedValues();
    }

    private void test(int[] output, int[][] grid) {
        Assertions.assertArrayEquals(output, findMissingAndRepeatedValues.findMissingAndRepeatedValues(grid));
    }

    @Test
    void test0() {
        test(new int[] { 2, 4 }, new int[][] { { 1, 3 }, { 2, 2 } });
    }
}
