package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("binarySearch")
@Tag("wc363")
@DisplayName("LeetCode: 2861. Maximum Number of Alloys")
class MaximumNumberOfAlloysTest {
    private MaximumNumberOfAlloys maximumNumberOfAlloys;

    @BeforeEach
    void setup() {
        maximumNumberOfAlloys = new MaximumNumberOfAlloys();
    }

    private void test(int output, int n, int k, int budget, List<List<Integer>> composition, List<Integer> stock,
            List<Integer> cost) {
        Assertions.assertEquals(output,
                maximumNumberOfAlloys.maxNumberOfAlloys(n, k, budget, composition, stock, cost));
    }

    @Test
    void test0() {
        test(2, 3, 2, 15, List.of(List.of(1, 1, 1), List.of(1, 1, 10)), List.of(0, 0, 0), List.of(1, 2, 3));
    }
}
