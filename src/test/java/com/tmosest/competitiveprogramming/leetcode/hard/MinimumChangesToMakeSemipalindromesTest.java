package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("string")
@Tag("depthFirstSearch")
@Tag("dynamic")
@Tag("wc368")
@DisplayName("LeetCode: 2911. Minimum Changes to Make K Semi-palindromes")
class MinimumChangesToMakeSemipalindromesTest {
    private MinimumChangesToMakeSemipalindromes minimumChangesToMakeSemipalindromes;

    @BeforeEach
    void setup() {
        minimumChangesToMakeSemipalindromes = new MinimumChangesToMakeSemipalindromes();
    }

    private void test(int output, String s, int k) {
        Assertions.assertEquals(output, minimumChangesToMakeSemipalindromes.minimumChanges(s, k));
    }

    @Test
    void test0() {
        test(1, "abcac", 2);
    }

    @Test
    void test1() {
        test(2, "abcdef", 2);
    }

    @Test
    void test2() {
        test(0, "aabbaa", 3);
    }
}
