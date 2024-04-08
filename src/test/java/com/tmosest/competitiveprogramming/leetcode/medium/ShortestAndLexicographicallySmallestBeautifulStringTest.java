package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("wc367")
@DisplayName("LeetCode: 2904. Shortest and Lexicographically Smallest Beautiful String")
class ShortestAndLexicographicallySmallestBeautifulStringTest {
    private ShortestAndLexicographicallySmallestBeautifulString shortestAndLexicographicallySmallestBeautifulString;

    @BeforeEach
    void setup() {
        shortestAndLexicographicallySmallestBeautifulString = new ShortestAndLexicographicallySmallestBeautifulString();
    }

    private void test(String output, String s, int k) {
        Assertions.assertEquals(output,
                shortestAndLexicographicallySmallestBeautifulString.shortestBeautifulSubstring(s, k));
    }

    @Test
    void test0() {
        test("11001", "100011001", 3);
    }

    @Test
    void test1() {
        test("11", "1011", 2);
    }

    @Test
    void test2() {
        test("", "000", 1);
    }
}
