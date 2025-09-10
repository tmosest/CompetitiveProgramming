package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 915. Partition Array into Disjoint Intervals")
@Tag("wc104")
class PartitionArrayIntoDisjointIntervalsTest {
    private PartitionArrayIntoDisjointIntervals partitionArrayIntoDisjointIntervals;

    @BeforeEach
    void setup() {
        partitionArrayIntoDisjointIntervals = new PartitionArrayIntoDisjointIntervals();
    }

    private void test(int output, int[] nums) {
        Assertions.assertEquals(output, partitionArrayIntoDisjointIntervals.partitionDisjoint(nums));
    }
    /*
     * Example 1
     * Input: nums = [5,0,3,8,6]
     * Output: 3
     * null
     */

    @Test
    void test1() {
        test(3, new int[] { 5, 0, 3, 8, 6 });
    }
    /*
     * Example 2
     * Input: nums = [1,1,1,0,6,12]
     * Output: 4
     * null
     */

    @Test
    void test2() {
        test(4, new int[] { 1, 1, 1, 0, 6, 12 });
    }
}
