package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("priorityQueue")
@Tag("map")
@Tag("wc390")
@DisplayName("LeetCode: 3092. Most Frequent IDs")
class MostFrequentIdsTest {
    private MostFrequentIds mostFrequentIds;

    @BeforeEach
    void setup() {
        mostFrequentIds = new MostFrequentIds();
    }

    private void test(long[] output, int[] nums, int[] freq) {
        Assertions.assertArrayEquals(output, mostFrequentIds.mostFrequentIDs(nums, freq));
    }

    @Test
    void test0() {
        test(new long[] { 3, 3, 2, 2 }, new int[] { 2, 3, 2, 1 }, new int[] { 3, 2, -3, 1 });
    }

    @Test
    void test1() {
        test(new long[] { 2, 0, 1 }, new int[] { 5, 5, 3 }, new int[] { 2, -2, 1 });
    }
}
