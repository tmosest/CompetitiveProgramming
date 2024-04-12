package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("array")
@Tag("primes")
@Tag("wc363")
@DisplayName("LeetCode: 2862. Maximum Element-Sum of a Complete Subset of Indices")
class MaximumElementsumOfCompleteSubsetOfIndicesTest {
    private MaximumElementsumOfCompleteSubsetOfIndices maximumElementsumOfCompleteSubsetOfIndices;

    @BeforeEach
    void setup() {
        maximumElementsumOfCompleteSubsetOfIndices = new MaximumElementsumOfCompleteSubsetOfIndices();
    }

    private void test(long output, List<Integer> nums) {
        Assertions.assertEquals(output, maximumElementsumOfCompleteSubsetOfIndices.maximumSum(nums));
    }

    @Test
    void test0() {
        test(16, List.of(8, 7, 3, 5, 7, 2, 4, 9));
    }
}
