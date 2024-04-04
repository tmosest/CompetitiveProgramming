package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("string")
@Tag("map")
@Tag("wc373")
@DisplayName("LeetCode: 2949. Count Beautiful Substrings II")
class CountBeautifulSubstringsTwoTest {
    private CountBeautifulSubstringsTwo countBeautifulSubstringsTwo;

    @BeforeEach
    void setup() {
        countBeautifulSubstringsTwo = new CountBeautifulSubstringsTwo();
    }

    private void test(long output, String s, int k) {
        Assertions.assertEquals(output, countBeautifulSubstringsTwo.beautifulSubstrings(s, k));
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
