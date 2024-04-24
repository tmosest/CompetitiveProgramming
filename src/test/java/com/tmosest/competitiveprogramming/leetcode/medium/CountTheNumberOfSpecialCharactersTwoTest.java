package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("wc394")
@Tag("map")
@Tag("array")
@DisplayName("LeetCode: 3121. Count the Number of Special Characters II")
class CountTheNumberOfSpecialCharactersTwoTest {
    private CountTheNumberOfSpecialCharactersTwo countTheNumberOfSpecialCharactersTwo;

    @BeforeEach
    void setup() {
        countTheNumberOfSpecialCharactersTwo = new CountTheNumberOfSpecialCharactersTwo();
    }

    private void test(int output, String word) {
        Assertions.assertEquals(output, countTheNumberOfSpecialCharactersTwo.numberOfSpecialChars(word));
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
        test(0, "AbBCab");
    }
}
