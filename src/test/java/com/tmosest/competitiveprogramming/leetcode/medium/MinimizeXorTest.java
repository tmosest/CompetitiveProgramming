package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("xor")
@Tag("wcx")
@DisplayName("LeetCode: 2429. Minimize XOR")
class MinimizeXorTest {
    private MinimizeXor minimizeXor;

    @BeforeEach
    void setup() {
        minimizeXor = new MinimizeXor();
    }

    private void test(int output, int num1, int num2) {
        Assertions.assertEquals(output, minimizeXor.minimizeXor(num1, num2));
    }

    @Test
    void test0() {
        test(3, 1, 5);
    }

    @Test
    void test1() {
        test(3, 1, 12);
    }

}
