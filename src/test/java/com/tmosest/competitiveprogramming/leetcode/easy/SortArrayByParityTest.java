package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc102")
@DisplayName("LeetCode: 905. Sort Array By Parity")
class SortArrayByParityTest {
    private SortArrayByParity sortArrayByParity;

    @BeforeEach
    void setup() {
        sortArrayByParity = new SortArrayByParity();
    }

    private void test(int[] output, int[] nums) {
        Assertions.assertArrayEquals(output, sortArrayByParity.sortArrayByParity(nums));
    }

    @Test
    void test0() {
        test(new int[] { 2, 4, 3, 1 }, new int[] { 3, 1, 2, 4 });
    }

    @Test
    void test1() {
        test(new int[] { 0 }, new int[] { 0 });
    }
}
