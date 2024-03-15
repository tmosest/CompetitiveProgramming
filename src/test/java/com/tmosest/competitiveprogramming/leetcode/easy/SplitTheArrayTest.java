package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc386")
@DisplayName("LeetCode: 3046. Split the Array")
class SplitTheArrayTest {
    private SplitTheArray splitTheArray;

    @BeforeEach
    void setup() {
        splitTheArray = new SplitTheArray();
    }

    private void test(boolean output, int[] nums) {
        Assertions.assertEquals(output, splitTheArray.isPossibleToSplit(nums));
    }

    @Test
    void test0() {
        test(true, new int[] { 1, 1, 2, 2, 3, 4 });
    }

    @Test
    void test1() {
        test(false, new int[] { 1, 1, 1, 1 });
    }
}
