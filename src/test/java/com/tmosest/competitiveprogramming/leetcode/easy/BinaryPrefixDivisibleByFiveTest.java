package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("number")
@Tag("wc130")
@Tag("array")
@DisplayName("LeetCode: 1018. Binary Prefix Divisible By 5")
class BinaryPrefixDivisibleByFiveTest {
    private BinaryPrefixDivisibleByFive binaryPrefixDivisibleByFive;

    @BeforeEach
    void setup() {
        binaryPrefixDivisibleByFive = new BinaryPrefixDivisibleByFive();
    }

    private void test(List<Boolean> output, int[] nums) {
        Assertions.assertEquals(output, binaryPrefixDivisibleByFive.prefixesDivBy5(nums));
    }

    @Test
    void test0() {
        test(List.of(true, false, false), new int[] { 0, 1, 1 });
    }

    @Test
    void test1() {
        test(List.of(false, false, false), new int[] { 1, 1, 1 });
    }

    @Test
    void test2() {
        test(List.of(false,false,false,false,false,false,false,false,false), new int[] { 1,1,0,0,0,1,0,0,1});
    }
}
