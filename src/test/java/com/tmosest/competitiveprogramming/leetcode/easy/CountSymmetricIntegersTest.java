package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("math")
@Tag("wc361")
@DisplayName("LeetCode: 2843. Count Symmetric Integers")
class CountSymmetricIntegersTest {
    private CountSymmetricIntegers countSymmetricIntegers;

    @BeforeEach
    void setup() {
        countSymmetricIntegers = new CountSymmetricIntegers();
    }

    private void test(int output, int low, int high) {
        Assertions.assertEquals(output, countSymmetricIntegers.countSymmetricIntegers(low, high));
    }

    @Test
    void test0() {
        test(9, 1, 100);
    }

    @Test
    void test1() {
        test(4, 1200, 1230);
    }
}
