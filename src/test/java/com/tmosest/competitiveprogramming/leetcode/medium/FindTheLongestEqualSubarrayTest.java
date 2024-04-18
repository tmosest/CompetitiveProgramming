package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("binarySearch")
@Tag("wc359")
@Tag("array")
@DisplayName("LeetCode: 2831. Find the Longest Equal Subarray")
class FindTheLongestEqualSubarrayTest {
    private FindTheLongestEqualSubarray findTheLongestEqualSubarray;

    @BeforeEach
    void setup() {
        findTheLongestEqualSubarray = new FindTheLongestEqualSubarray();
    }

    private void test(int output, List<Integer> nums, int k) {
        Assertions.assertEquals(output, findTheLongestEqualSubarray.longestEqualSubarray(nums, k));
    }

    @Test
    void test0() {
        test(4, List.of(1,1,2,2,1,1), 2);
    }
}
