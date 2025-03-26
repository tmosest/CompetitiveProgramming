package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("projectEulerPlus")
@Tag("number")
@Tag("wcx")
@DisplayName("LeetCode: 3. Largest Prime Factor")
class LargestPrimeFactorTest {
    private LargestPrimeFactor largestPrimeFactor;

    @BeforeEach
    void setup() {
        largestPrimeFactor = new LargestPrimeFactor();
    }

    private void test(long output, long num) {
        Assertions.assertEquals(output, largestPrimeFactor.largestPrimeFactor(num));
    }

    @Test
    void test0() {
        test(5L, 10L);
    }

    @Test
    void test1() {
        test(17L, 17L);
    }
}
