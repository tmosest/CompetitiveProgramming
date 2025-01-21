package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("number")
@Tag("wc128")
@DisplayName("LeetCode: 1009. Complement of Base 10 Integer")
class ComplementOfBaseTenIntegerTest {
    private ComplementOfBaseTenInteger complementOfBaseTenInteger;

    @BeforeEach
    void setup() {
        complementOfBaseTenInteger = new ComplementOfBaseTenInteger();
    }

    private void test(int output, int n) {
        Assertions.assertEquals(output, complementOfBaseTenInteger.bitwiseComplement(n));
    }

    @Test
    void test0() {
        test(2, 5);
    }

    @Test
    void test1() {
        test(0, 7);
    }

    @Test
    void test2() {
        test(5, 10);
    }

    @Test
    void test3() {
        test(1, 0);
    }
}
