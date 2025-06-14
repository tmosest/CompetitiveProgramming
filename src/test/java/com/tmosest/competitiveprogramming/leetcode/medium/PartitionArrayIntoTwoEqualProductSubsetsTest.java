package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc452")
@DisplayName("LeetCode: 3566. Partition Array into Two Equal Product Subsets")
class PartitionArrayIntoTwoEqualProductSubsetsTest {
    private PartitionArrayIntoTwoEqualProductSubsets partitionArrayIntoTwoEqualProductSubsets;

    @BeforeEach
    void setup() {
        partitionArrayIntoTwoEqualProductSubsets = new PartitionArrayIntoTwoEqualProductSubsets();
    }

    private void test(boolean output, int[] nums, long target) {
        Assertions.assertEquals(output, partitionArrayIntoTwoEqualProductSubsets.checkEqualPartitions(nums, target));
    }

    @Test
    void test0() {
        test(true, new int[] { 3, 1, 6, 8, 4 }, 24);
    }

    @Test
    void test1() {
        test(false, new int[] { 2, 5, 3, 7 }, 15);
    }
}
