package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc106")
@DisplayName("LeetCode: 922. Sort Array By Parity II")
class SortArrayByParityTwoTest {
    private SortArrayByParityTwo sortArrayByParityTwo;

    @BeforeEach
    void setup() {
        sortArrayByParityTwo = new SortArrayByParityTwo();
    }

    private void test(int[] output, int[] nums) {
        Assertions.assertArrayEquals(output, sortArrayByParityTwo.sortArrayByParityII(nums));
    }

    @Test
    void test0() {
        test(new int[] { 4, 5, 2, 7 }, new int[] { 4, 2, 5, 7 });
    }

    @Test
    void test1() {
        test(new int[] { 2, 3 }, new int[] { 2, 3 });
    }
}
