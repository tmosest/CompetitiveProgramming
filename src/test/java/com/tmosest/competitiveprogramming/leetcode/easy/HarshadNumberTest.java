package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("number")
@Tag("wc391")
@DisplayName("LeetCode: 3099. Harshad Number")
class HarshadNumberTest {
    private HarshadNumber harshadNumber;

    @BeforeEach
    void setup() {
        harshadNumber = new HarshadNumber();
    }

    private void test(int output, int x) {
        Assertions.assertEquals(output, harshadNumber.sumOfTheDigitsOfHarshadNumber(x));
    }

    @Test
    void test0() {
        test(9, 18);
    }

    @Test
    void test1() {
        test(-1, 28);
    }
}
