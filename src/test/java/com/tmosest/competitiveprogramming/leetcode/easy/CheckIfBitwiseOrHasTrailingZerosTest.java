package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("bitwise")
@Tag("wc378")
@DisplayName("LeetCode: 2980. Check if Bitwise OR Has Trailing Zeros")
class CheckIfBitwiseOrHasTrailingZerosTest {
    private CheckIfBitwiseOrHasTrailingZeros checkIfBitwiseOrHasTrailingZeros;

    @BeforeEach
    void setup() {
        checkIfBitwiseOrHasTrailingZeros = new CheckIfBitwiseOrHasTrailingZeros();
    }

    private void test(boolean output, int[] nums) {
        Assertions.assertEquals(output, checkIfBitwiseOrHasTrailingZeros.hasTrailingZeros(nums));
    }

    @Test
    void test0() {
        test(true, new int[] { 1, 2, 3, 4, 5 });
    }

    @Test
    void test1() {
        test(false, new int[] { 1, 3, 5, 7, 9 });
    }
}
