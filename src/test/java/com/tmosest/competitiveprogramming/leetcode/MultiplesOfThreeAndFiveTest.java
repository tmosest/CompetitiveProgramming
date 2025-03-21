package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("projectEulerPlus")
@Tag("number")
@Tag("wcx")
@DisplayName("LeetCode: 1. Multiples of 3 and 5")
class MultiplesOfThreeAndFiveTest {
    private MultiplesOfThreeAndFive multiplesOfThreeAndFive;

    @BeforeEach
    void setup() {
        multiplesOfThreeAndFive = new MultiplesOfThreeAndFive();
    }

    private void test(long output, int num) {
        Assertions.assertEquals(output, multiplesOfThreeAndFive.sumOf3and5BelowNumber(num));
    }

    @Test
    void test0() {
        test(23, 10);
    }

    @Test
    void test1() {
        test(2318, 100);
    }
}
