package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("stack")
@Tag("wc358")
@Tag("math")
@Tag("greedy")
@Tag("array")
@DisplayName("LeetCode: 2818. Apply Operations to Maximize Score")
class ApplyOperationsToMaximizeScoreTest {
    private ApplyOperationsToMaximizeScore applyOperationsToMaximizeScore;

    @BeforeEach
    void setup() {
        applyOperationsToMaximizeScore = new ApplyOperationsToMaximizeScore();
    }

    private void test(int output, List<Integer> nums, int k) {
        Assertions.assertEquals(output, applyOperationsToMaximizeScore.maximumScore(nums, k));
    }

    @Test
    void test0() {
        test(4788, List.of(19,12,14,6,10,18), 3);
    }
}
