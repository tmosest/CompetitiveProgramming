package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("matrix")
@Tag("wc387")
@DisplayName("LeetCode: 3070. Count Submatrices with Top-Left Element and Sum Less Than k")
class CountSubmatricesWithTopleftElementAndSumLessThanTest {
    private CountSubmatricesWithTopleftElementAndSumLessThan countSubmatricesWithTopleftElementAndSumLessThan;

    @BeforeEach
    void setup() {
        countSubmatricesWithTopleftElementAndSumLessThan = new CountSubmatricesWithTopleftElementAndSumLessThan();
    }

    private void test(int output, int[][] grid, int k) {
        Assertions.assertEquals(output, countSubmatricesWithTopleftElementAndSumLessThan.countSubmatrices(grid, k));
    }

    @Test
    void test0() {
        test(4, new int[][] { new int[] { 7, 6, 3 }, new int[] { 6, 6, 1 } }, 18);
    }

    @Test
    void test1() {
        test(6, new int[][] { new int[] { 7, 2, 9 }, new int[] { 1, 5, 0 }, new int[] { 2, 6, 6 } }, 20);
    }
}
