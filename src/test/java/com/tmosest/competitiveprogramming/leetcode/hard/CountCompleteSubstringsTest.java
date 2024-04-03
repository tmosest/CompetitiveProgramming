package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("slidingWindow")
@Tag("string")
@Tag("wc374")
@DisplayName("LeetCode: 2953. Count Complete Substrings")
class CountCompleteSubstringsTest {
    private CountCompleteSubstrings countCompleteSubstrings;

    @BeforeEach
    void setup() {
        countCompleteSubstrings = new CountCompleteSubstrings();
    }

    private void test(int output, String word, int k) {
        Assertions.assertEquals(output, countCompleteSubstrings.countCompleteSubstrings(word, k));
    }

    @Test
    void test0() {
        test(3, "igigee", 2);
    }

    @Test
    void test1() {
        test(6, "aaabbbccc", 3);
    }
}
