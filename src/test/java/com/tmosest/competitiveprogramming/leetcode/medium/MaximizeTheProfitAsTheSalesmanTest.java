package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc359")
@Tag("binarySearch")
@DisplayName("LeetCode: 2830. Maximize the Profit as the Salesman")
class MaximizeTheProfitAsTheSalesmanTest {
    private MaximizeTheProfitAsTheSalesman maximizeTheProfitAsTheSalesman;

    @BeforeEach
    void setup() {
        maximizeTheProfitAsTheSalesman = new MaximizeTheProfitAsTheSalesman();
    }

    private void test(int output, int n, List<List<Integer>> offers) {
        Assertions.assertEquals(output, maximizeTheProfitAsTheSalesman.maximizeTheProfit(n, new ArrayList<>(offers)));
    }

    @Test
    void test0() {
        test(3, 5, List.of(List.of(0, 0, 1), List.of(0, 2, 2), List.of(1, 3, 2)));
    }
}
