package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("string")
@Tag("wc383")
@DisplayName("LeetCode: 3031. Minimum Time to Revert Word to Initial State II")
class MinimumTimeToRevertWordToInitialStateTwoTest {
    private MinimumTimeToRevertWordToInitialStateTwo minimumTimeToRevertWordToInitialStateTwo;

    @BeforeEach
    void setup() {
        minimumTimeToRevertWordToInitialStateTwo = new MinimumTimeToRevertWordToInitialStateTwo();
    }

    private void test(int output, String word, int k) {
        Assertions.assertEquals(output, minimumTimeToRevertWordToInitialStateTwo.minimumTimeToInitialState(word, k));
    }

    @Test
    void test0() {
        test(2, "abacaba", 3);
    }
}
