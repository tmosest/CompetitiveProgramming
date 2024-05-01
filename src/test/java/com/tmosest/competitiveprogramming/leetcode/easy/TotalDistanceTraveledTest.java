package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("simulation")
@Tag("wc350")
@Tag("math")
@DisplayName("LeetCode: 2739. Total Distance Traveled")
class TotalDistanceTraveledTest {
    private TotalDistanceTraveled totalDistanceTraveled;

    @BeforeEach
    void setup() {
        totalDistanceTraveled = new TotalDistanceTraveled();
    }

    private void test(int output, int mainTank, int additionalTank) {
        Assertions.assertEquals(output, totalDistanceTraveled.distanceTraveled(mainTank, additionalTank));
    }

    @Test
    void test0() {
        test(60, 5, 10);
    }

    @Test
    void test1() {
        test(10, 1, 2);
    }
}
