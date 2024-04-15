package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("wc361")
@DisplayName("LeetCode: 2844. Minimum Operations to Make a Special Number")
class MinimumOperationsToMakeSpecialNumberTest {
    private MinimumOperationsToMakeSpecialNumber minimumOperationsToMakeSpecialNumber;

    @BeforeEach
    void setup() {
        minimumOperationsToMakeSpecialNumber = new MinimumOperationsToMakeSpecialNumber();
    }

    private void test(int output, String num) {
        Assertions.assertEquals(output, minimumOperationsToMakeSpecialNumber.minimumOperations(num));
    }

    @Test
    void test0() {
        test(2, "2245047");
    }

    @Test
    void test1() {
        test(3, "2908305");
    }

    @Test
    void test2() {
        test(1, "10");
    }
}
