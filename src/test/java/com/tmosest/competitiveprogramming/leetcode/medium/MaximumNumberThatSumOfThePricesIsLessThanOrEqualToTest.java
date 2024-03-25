package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("list")
@Tag("binarySearch")
@Tag("time_O(log(n)*log(n))")
@Tag("space_O(1)")
@Tag("wc380")
@DisplayName("LeetCode: 3007. Maximum Number That Sum of the Prices Is Less Than or Equal to K")
class MaximumNumberThatSumOfThePricesIsLessThanOrEqualToTest {
    private MaximumNumberThatSumOfThePricesIsLessThanOrEqualTo maximumNumberThatSumOfThePricesIsLessThanOrEqualTo;

    @BeforeEach
    void setup() {
        maximumNumberThatSumOfThePricesIsLessThanOrEqualTo = new MaximumNumberThatSumOfThePricesIsLessThanOrEqualTo();
    }

    private void test(long output, long k, int x) {
        Assertions.assertEquals(output, maximumNumberThatSumOfThePricesIsLessThanOrEqualTo.findMaximumNumber(k, x));
    }

    @Test
    void test0() {
        test(9, 7, 2);
    }
}
