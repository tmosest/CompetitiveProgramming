package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("wc378")
@DisplayName("LeetCode: 2981. Find Longest Special Substring That Occurs Thrice I")
class FindLongestSpecialSubstringThatOccursThriceOneTest {
    private FindLongestSpecialSubstringThatOccursThriceOne findLongestSpecialSubstringThatOccursThriceOne;

    @BeforeEach
    void setup() {
        findLongestSpecialSubstringThatOccursThriceOne = new FindLongestSpecialSubstringThatOccursThriceOne();
    }

    private void test(int output, String s) {
        Assertions.assertEquals(output, findLongestSpecialSubstringThatOccursThriceOne.maximumLength(s));
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
