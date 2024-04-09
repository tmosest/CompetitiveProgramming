package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("number")
@Tag("wc366")
@DisplayName("LeetCode: 2894. Divisible and Non-divisible Sums Difference")
class DivisibleAndNondivisibleSumsDifferenceTest {
    private DivisibleAndNondivisibleSumsDifference divisibleAndNondivisibleSumsDifference;

    @BeforeEach
    void setup() {
        divisibleAndNondivisibleSumsDifference = new DivisibleAndNondivisibleSumsDifference();
    }

    private void test(int output, int n, int m) {
        Assertions.assertEquals(output, divisibleAndNondivisibleSumsDifference.differenceOfSums(n, m));
    }

    @Test
    void test0() {
        test(19, 10, 3);
    }

    @Test
    void test1() {
        test(15, 5, 6);
    }

    @Test
    void test2() {
        test(-15, 5, 1);
    }
}
