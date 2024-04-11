package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc363")
@DisplayName("LeetCode: 2859. Sum of Values at Indices With K Set Bits")
class SumOfValuesAtIndicesWithSetBitsTest {
    private SumOfValuesAtIndicesWithSetBits sumOfValuesAtIndicesWithSetBits;

    @BeforeEach
    void setup() {
        sumOfValuesAtIndicesWithSetBits = new SumOfValuesAtIndicesWithSetBits();
    }

    private void test(int output, List<Integer> nums, int k) {
        Assertions.assertEquals(output, sumOfValuesAtIndicesWithSetBits.sumIndicesWithKSetBits(nums, k));
    }

    @Test
    void test0() {
        test(13, List.of(5, 10, 1, 5, 2), 1);
    }

    @Test
    void test1() {
        test(1, List.of(4, 3, 2, 1), 2);
    }
}
