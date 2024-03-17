package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("wc389")
@DisplayName("LeetCode: 100236. Count Substrings Starting and Ending with Given Character")
class CountSubstringsStartingAndEndingWithGivenCharacterTest {
    private CountSubstringsStartingAndEndingWithGivenCharacter countSubstringsStartingAndEndingWithGivenCharacter;

    @BeforeEach
    void setup() {
        countSubstringsStartingAndEndingWithGivenCharacter = new CountSubstringsStartingAndEndingWithGivenCharacter();
    }

    private void test(long output, String s, char c) {
        Assertions.assertEquals(output, countSubstringsStartingAndEndingWithGivenCharacter.countSubstrings(s, c));
    }

    @Test
    void test0() {
        test(6L, "abada", 'a');
    }

    @Test
    void test1() {
        test(6L, "zzz", 'z');
    }

    @Test
    void test2() {
        test(1L, "ou", 'o');
    }

    @Test
    void test3() {
        test(15L, "eeeee", 'e');
    }
}
