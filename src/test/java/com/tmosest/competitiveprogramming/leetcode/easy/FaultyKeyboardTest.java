package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("wc357")
@DisplayName("LeetCode: 2810. Faulty Keyboard")
class FaultyKeyboardTest {
    private FaultyKeyboard faultyKeyboard;

    @BeforeEach
    void setup() {
        faultyKeyboard = new FaultyKeyboard();
    }

    private void test(String output, String s) {
        Assertions.assertEquals(output, faultyKeyboard.finalString(s));
    }

    @Test
    void test0() {
        test("rtsng", "string");
    }

    @Test
    void test1() {
        test("ponter", "poiinter");
    }
}
