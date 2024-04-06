package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc369")
@DisplayName("LeetCode: 2917. Find the K-or of an Array")
class FindTheKorOfAnArrayTest {
    private FindTheKorOfAnArray findTheKorOfAnArray;

    @BeforeEach
    void setup() {
        findTheKorOfAnArray = new FindTheKorOfAnArray();
    }

    private void test(int output, int[] nums, int k) {
        Assertions.assertEquals(output, findTheKorOfAnArray.findKOr(nums, k));
    }

    @Test
    void test0() {
        test(9, new int[] { 7, 12, 9, 8, 9, 15 }, 4);
    }

    @Test
    void test1() {
        test(0, new int[] { 2, 12, 1, 11, 4, 5 }, 6);
    }

    @Test
    void test2() {
        test(15, new int[] { 10, 8, 5, 9, 11, 6, 8 }, 1);
    }
}
