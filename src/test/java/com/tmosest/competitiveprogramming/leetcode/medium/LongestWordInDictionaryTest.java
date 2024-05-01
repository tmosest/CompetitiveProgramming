package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("trie")
@Tag("wcx")
@Tag("string")
@DisplayName("LeetCode: 720. Longest Word in Dictionary")
class LongestWordInDictionaryTest {
    private LongestWordInDictionary longestWordInDictionary;

    @BeforeEach
    void setup() {
        longestWordInDictionary = new LongestWordInDictionary();
    }

    private void test(String output, String[] words) {
        Assertions.assertEquals(output, longestWordInDictionary.longestWord(words));
    }

    @Test
    void test0() {
        test("world", new String[] { "w", "wo", "wor", "worl", "world" });
    }

    @Test
    void test1() {
        test("apple", new String[] { "a","banana","app","appl","ap","apply","apple" });
    }
}
