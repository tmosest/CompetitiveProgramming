package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("wc383")
@DisplayName("LeetCode: 3029. Minimum Time to Revert Word to Initial State I")
class MinimumTimeToRevertWordToInitialStateOneTest {
    private MinimumTimeToRevertWordToInitialStateOne minimumTimeToRevertWordToInitialStateOne;

    @BeforeEach
    void setup() {
        minimumTimeToRevertWordToInitialStateOne = new MinimumTimeToRevertWordToInitialStateOne();
    }

    private void test(int output, String word, int k) {
        Assertions.assertEquals(output, minimumTimeToRevertWordToInitialStateOne.minimumTimeToInitialState(word, k));
    }

    @Test
    void test0() {
        test(2, "abacaba", 3);
    }

    @Test
    void test1() {
        test(1, "abacaba", 4);
    }

    @Test
    void test2() {
        test(4, "abcbabcd", 2);
    }
}
