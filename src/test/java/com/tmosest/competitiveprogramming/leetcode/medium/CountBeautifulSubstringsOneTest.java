package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("wc373")
@DisplayName("LeetCode: 2947. Count Beautiful Substrings I")
class CountBeautifulSubstringsOneTest {
    private CountBeautifulSubstringsOne countBeautifulSubstringsOne;

    @BeforeEach
    void setup() {
        countBeautifulSubstringsOne = new CountBeautifulSubstringsOne();
    }

    private void test(int output, String s, int k) {
        Assertions.assertEquals(output, countBeautifulSubstringsOne.beautifulSubstrings(s, k));
    }

    @Test
    void test0() {
        test(2, "baeyh", 2);
    }

    @Test
    void test1() {
        test(3, "abba", 1);
    }

    @Test
    void test2() {
        test(0, "bcdf", 1);
    }
}
