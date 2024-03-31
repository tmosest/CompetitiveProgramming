package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("array")
@Tag("binarySearch")
@Tag("sort")
@Tag("wc376")
@DisplayName("LeetCode: 2968. Apply Operations to Maximize Frequency Score")
class ApplyOperationsToMaximizeFrequencyScoreTest {
    private ApplyOperationsToMaximizeFrequencyScore applyOperationsToMaximizeFrequencyScore;

    @BeforeEach
    void setup() {
        applyOperationsToMaximizeFrequencyScore = new ApplyOperationsToMaximizeFrequencyScore();
    }

    private void test(int output, int[] nums, long k) {
        Assertions.assertEquals(output, applyOperationsToMaximizeFrequencyScore.maxFrequencyScore(nums, k));
    }

    @Test
    void test0() {
        test(3, new int[] { 1, 2, 6, 4 }, 3);
    }

    @Test
    void test1() {
        test(3, new int[] { 1, 4, 4, 2, 4 }, 0);
    }
}
