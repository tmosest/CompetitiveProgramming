package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("wc390")
@DisplayName("LeetCode: 3090. Maximum Length Substring With Two Occurrences")
class MaximumLengthSubstringWithTwoOccurrencesTest {
    private MaximumLengthSubstringWithTwoOccurrences maximumLengthSubstringWithTwoOccurrences;

    @BeforeEach
    void setup() {
        maximumLengthSubstringWithTwoOccurrences = new MaximumLengthSubstringWithTwoOccurrences();
    }

    private void test(int output, String s) {
        Assertions.assertEquals(output, maximumLengthSubstringWithTwoOccurrences.maximumLengthSubstring(s));
    }

    @Test
    void test0() {
        test(4, "bcbbbcba");
    }
}
