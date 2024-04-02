package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("number")
@Tag("wc391")
@DisplayName("LeetCode: 3100. Water Bottles II")
class WaterBottlesTwoTest {
    private WaterBottlesTwo waterBottlesTwo;

    @BeforeEach
    void setup() {
        waterBottlesTwo = new WaterBottlesTwo();
    }

    private void test(int output, int numBottles, int numExchange) {
        Assertions.assertEquals(output, waterBottlesTwo.maxBottlesDrunk(numBottles, numExchange));
    }

    @Test
    void test0() {
        test(15, 13, 6);
    }

    @Test
    void test1() {
        test(13, 10, 3);
    }
}
