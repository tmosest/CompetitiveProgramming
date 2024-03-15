package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc385")
@DisplayName("LeetCode: 3043. Find the Length of the Longest Common Prefix")
class FindTheLengthOfTheLongestCommonPrefixTest {
    private FindTheLengthOfTheLongestCommonPrefix findTheLengthOfTheLongestCommonPrefix;

    @BeforeEach
    void setup() {
        findTheLengthOfTheLongestCommonPrefix = new FindTheLengthOfTheLongestCommonPrefix();
    }

    private void test(int output, int[] arr1, int[] arr2) {
        Assertions.assertEquals(output, findTheLengthOfTheLongestCommonPrefix.longestCommonPrefix(arr1, arr2));
    }

    @Test
    void test0() {
        test(3, new int[] { 1, 10, 100 }, new int[] { 1000 });
    }

    @Test
    void test1() {
        test(0, new int[] { 1, 2, 3 }, new int[] { 4, 4, 4 });
    }

    @Test
    void test2() {
        test(1, new int[] { 10 }, new int[] { 17, 11 });
    }
}
