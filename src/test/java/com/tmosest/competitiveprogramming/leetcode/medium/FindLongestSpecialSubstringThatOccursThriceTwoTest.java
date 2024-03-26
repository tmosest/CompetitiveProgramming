package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("greedy")
@Tag("wc378")
@DisplayName("LeetCode: 2982. Find Longest Special Substring That Occurs Thrice II")
class FindLongestSpecialSubstringThatOccursThriceTwoTest {
    private FindLongestSpecialSubstringThatOccursThriceTwo findLongestSpecialSubstringThatOccursThriceTwo;

    @BeforeEach
    void setup() {
        findLongestSpecialSubstringThatOccursThriceTwo = new FindLongestSpecialSubstringThatOccursThriceTwo();
    }

    private void test(int output, String s) {
        Assertions.assertEquals(output, findLongestSpecialSubstringThatOccursThriceTwo.maximumLength(s));
    }

    @Test
    void test0() {
        test(2, "aaaa");
    }

    @Test
    void test1() {
        test(-1, "abcdef");
    }
}
