package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc377")
@DisplayName("LeetCode: 2975. Maximum Square Area by Removing Fences From a Field")
class MaximumSquareAreaByRemovingFencesFromFieldTest {
    private MaximumSquareAreaByRemovingFencesFromField maximumSquareAreaByRemovingFencesFromField;

    @BeforeEach
    void setup() {
        maximumSquareAreaByRemovingFencesFromField = new MaximumSquareAreaByRemovingFencesFromField();
    }

    private void test(int output, int m, int n, int[] hFences, int[] vFences) {
        Assertions.assertEquals(output,
                maximumSquareAreaByRemovingFencesFromField.maximizeSquareArea(m, n, hFences, vFences));
    }

    @Test
    void test0() {
        test(4, 4, 3, new int[] { 2, 3 }, new int[] { 2 });
    }

    @Test
    void test1() {
        test(-1, 6, 7, new int[] { 2 }, new int[] { 4 });
    }
}
