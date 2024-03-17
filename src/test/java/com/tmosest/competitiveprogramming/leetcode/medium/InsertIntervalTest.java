package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("interval")
@Tag("wcx")
@DisplayName("LeetCode: 57. Insert Interval")
class InsertIntervalTest {
    private InsertInterval insertInterval;

    @BeforeEach
    void setup() {
        insertInterval = new InsertInterval();
    }

    private void test(int[][] output, int[][] intervals, int[] newInterval) {
        Assertions.assertArrayEquals(output, insertInterval.insert(intervals, newInterval));
    }

    @Test
    void test0() {
        test(new int[][] {{1,5}, {6,9}}, new int[][] {{1,3}, {6,9}}, new int[] {2,5});
    }
}
