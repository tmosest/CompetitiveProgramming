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
@DisplayName("LeetCode: 2. Even Fibonacci numbers")
class EvenFibonacciNumbersTest {
    private EvenFibonacciNumbers evenFibonacciNumbers;

    @BeforeEach
    void setup() {
        evenFibonacciNumbers = new EvenFibonacciNumbers();
    }

    private void test(long output, int num) {
        Assertions.assertEquals(output, evenFibonacciNumbers.sumEvenFibonacci(num));
    }

    @Test
    void test0() {
        test(10, 10);
    }

    @Test
    void test1() {
        test(44, 100);
    }
}
