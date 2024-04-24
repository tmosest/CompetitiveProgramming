package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("wc394")
@Tag("array")
@DisplayName("LeetCode: 3120. Count the Number of Special Characters I")
class CountTheNumberOfSpecialCharactersOneTest {
    private CountTheNumberOfSpecialCharactersOne countTheNumberOfSpecialCharactersOne;

    @BeforeEach
    void setup() {
        countTheNumberOfSpecialCharactersOne = new CountTheNumberOfSpecialCharactersOne();
    }

    private void test(int output, String word) {
        Assertions.assertEquals(output, countTheNumberOfSpecialCharactersOne.numberOfSpecialChars(word));
    }

    @Test
    void test0() {
        test(3, "aaAbcBC");
    }

    @Test
    void test1() {
        test(0, "abc");
    }

    @Test
    void test2() {
        test(1, "abBCab");
    }
}
