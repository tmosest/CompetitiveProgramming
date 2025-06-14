package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc453")
@DisplayName("LeetCode: 3576. Transform Array to All Equal Elements")
class TransformArrayToAllEqualElementsTest {
    private TransformArrayToAllEqualElements transformArrayToAllEqualElements;

    @BeforeEach
    void setup() {
        transformArrayToAllEqualElements = new TransformArrayToAllEqualElements();
    }

    private void test(boolean output, int[] nums, int k) {
        Assertions.assertEquals(output, transformArrayToAllEqualElements.canMakeEqual(nums, k));
    }

    @Test
    void test0() {
        test(true, new int[] { 1, -1, 1, -1, 1 }, 3);
    }

    @Test
    void test1() {
        test(false, new int[] { -1, -1, -1, 1, 1, 1 }, 5);
    }
}
