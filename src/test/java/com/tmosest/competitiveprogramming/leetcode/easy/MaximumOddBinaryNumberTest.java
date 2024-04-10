package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("wc364")
@DisplayName("LeetCode: 2864. Maximum Odd Binary Number")
class MaximumOddBinaryNumberTest {
    private MaximumOddBinaryNumber maximumOddBinaryNumber;

    @BeforeEach
    void setup() {
        maximumOddBinaryNumber = new MaximumOddBinaryNumber();
    }

    private void test(String output, String s) {
        Assertions.assertEquals(output, maximumOddBinaryNumber.maximumOddBinaryNumber(s));
    }

    @Test
    void test0() {
        test("001", "010");
    }
}
