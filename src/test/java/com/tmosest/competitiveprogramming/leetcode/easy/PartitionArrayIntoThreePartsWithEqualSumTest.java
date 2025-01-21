package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc129")
@DisplayName("LeetCode: 1013. Partition Array Into Three Parts With Equal Sum")
class PartitionArrayIntoThreePartsWithEqualSumTest {
    private PartitionArrayIntoThreePartsWithEqualSum partitionArrayIntoThreePartsWithEqualSum;

    @BeforeEach
    void setup() {
        partitionArrayIntoThreePartsWithEqualSum = new PartitionArrayIntoThreePartsWithEqualSum();
    }

    private void test(boolean output, int[] arr) {
        Assertions.assertEquals(output, partitionArrayIntoThreePartsWithEqualSum.canThreePartsEqualSum(arr));
    }

    @Test
    void test0() {
        test(true, new int[] { 0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1 });
    }

    @Test
    void test1() {
        test(false, new int[] { 0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1 });
    }

    @Test
    void test2() {
        test(true, new int[] { 3, 3, 6, 5, -2, 2, 5, 1, -9, 4 });
    }
}
