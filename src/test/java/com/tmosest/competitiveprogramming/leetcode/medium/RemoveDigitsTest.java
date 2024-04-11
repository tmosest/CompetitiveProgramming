package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("greedy")
@Tag("number")
@Tag("string")
@Tag("wcx")
@DisplayName("LeetCode: 402. Remove K Digits")
class RemoveDigitsTest {
    private RemoveDigits removeDigits;

    @BeforeEach
    void setup() {
        removeDigits = new RemoveDigits();
    }

    private void test(String output, String num, int k) {
        Assertions.assertEquals(output, removeDigits.removeKdigits(num, k));
    }

    @Test
    void test0() {
        test("1219", "1432219", 3);
    }
}
