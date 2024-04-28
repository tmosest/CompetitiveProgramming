package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("math")
@Tag("wc353")
@DisplayName("LeetCode: 2769. Find the Maximum Achievable Number")
class FindTheMaximumAchievableNumberTest {
    private FindTheMaximumAchievableNumber findTheMaximumAchievableNumber;

    @BeforeEach
    void setup() {
        findTheMaximumAchievableNumber = new FindTheMaximumAchievableNumber();
    }

    private void test(int output, int num, int t) {
        Assertions.assertEquals(output, findTheMaximumAchievableNumber.theMaximumAchievableX(num, t));
    }

    @Test
    void test0() {
        test(6, 4, 1);
    }

    @Test
    void test1() {
        test(7, 3, 2);
    }
}
