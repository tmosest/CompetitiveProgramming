package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("wc366")
@DisplayName("LeetCode: 2896. Apply Operations to Make Two Strings Equal")
class ApplyOperationsToMakeTwoStringsEqualTest {
    private ApplyOperationsToMakeTwoStringsEqual applyOperationsToMakeTwoStringsEqual;

    @BeforeEach
    void setup() {
        applyOperationsToMakeTwoStringsEqual = new ApplyOperationsToMakeTwoStringsEqual();
    }

    private void test(int output, String s1, String s2, int x) {
        Assertions.assertEquals(output, applyOperationsToMakeTwoStringsEqual.minOperations(s1, s2, x));
    }

    @Test
    void test0() {
        test(4, "1100011000", "0101001010", 2);
    }

    @Test
    void test1() {
        test(-1, "10110", "00011", 4);
    }
}
