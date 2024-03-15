package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("number")
@Tag("wc385")
@DisplayName("LeetCode: 3044. Most Frequent Prime")
class MostFrequentPrimeTest {
    private MostFrequentPrime mostFrequentPrime;

    @BeforeEach
    void setup() {
        mostFrequentPrime = new MostFrequentPrime();
    }

    private void test(int output, int[][] mat) {
        Assertions.assertEquals(output, mostFrequentPrime.mostFrequentPrime(mat));
    }

    @Test
    void test0() {
        test(19, new int[][] { { 1, 1 }, { 9, 9 }, { 1, 1 } });
    }

    @Test
    void test1() {
        test(-1, new int[][] { { 7 } });
    }

    @Test
    void test2() {
        test(97, new int[][] { { 9, 7, 8 }, { 4, 6, 5 }, { 2, 8, 6 } });
    }
}
