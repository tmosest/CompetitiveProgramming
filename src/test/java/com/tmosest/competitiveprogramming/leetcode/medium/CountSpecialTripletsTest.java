package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("wc454")
@DisplayName("LeetCode: 3583. Count Special Triplets")
class CountSpecialTripletsTest {
    private CountSpecialTriplets countSpecialTriplets;

    @BeforeEach
    void setup() {
        countSpecialTriplets = new CountSpecialTriplets();
    }

    private void test(int output, int[] A) {
        Assertions.assertEquals(output, countSpecialTriplets.specialTriplets(A));
    }

    @Test
    void test0() {
        test(1, new int[] { 6, 3, 6 });
    }
}
