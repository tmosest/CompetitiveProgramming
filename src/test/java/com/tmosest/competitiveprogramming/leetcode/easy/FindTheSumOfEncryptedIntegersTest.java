package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("bwc126")
@DisplayName("LeetCode: 3079. Find the Sum of Encrypted Integers")
class FindTheSumOfEncryptedIntegersTest {
    private FindTheSumOfEncryptedIntegers findTheSumOfEncryptedIntegers;

    @BeforeEach
    void setup() {
        findTheSumOfEncryptedIntegers = new FindTheSumOfEncryptedIntegers();
    }

    private void test(int output, int[] nums) {
        Assertions.assertEquals(output, findTheSumOfEncryptedIntegers.sumOfEncryptedInt(nums));
    }

    @Test
    void test0() {
        test(6, new int[] { 1, 2, 3 });
    }
}
