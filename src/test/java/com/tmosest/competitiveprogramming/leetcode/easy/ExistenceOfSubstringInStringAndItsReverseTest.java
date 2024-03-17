package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("wc389")
@DisplayName("LeetCode: 100248. Existence of a Substring in a String and Its Reverse")
class ExistenceOfSubstringInStringAndItsReverseTest {
    private ExistenceOfSubstringInStringAndItsReverse existenceOfSubstringInStringAndItsReverse;

    @BeforeEach
    void setup() {
        existenceOfSubstringInStringAndItsReverse = new ExistenceOfSubstringInStringAndItsReverse();
    }

    private void test(boolean output, String s) {
        Assertions.assertEquals(output, existenceOfSubstringInStringAndItsReverse.isSubstringPresent(s));
    }

    @Test
    void test0() {
        test(true, "leetcode");
    }

    @Test
    void test1() {
        test(true, "abcba");
    }

    @Test
    void test2() {
        test(false, "abcd");
    }

    @Test
    void test3() {
        test(true, "ausoee");
    }
}
