package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("string")
@Tag("wc385")
@DisplayName("LeetCode: 3045. Count Prefix and Suffix Pairs II")
class CountPrefixAndSuffixPairsTwoTest {
    private CountPrefixAndSuffixPairsTwo countPrefixAndSuffixPairsTwo;

    @BeforeEach
    void setup() {
        countPrefixAndSuffixPairsTwo = new CountPrefixAndSuffixPairsTwo();
    }

    private void test(long output, String[] words) {
        Assertions.assertEquals(output, countPrefixAndSuffixPairsTwo.countPrefixSuffixPairs(words));
    }

    @Test
    void test0() {
        test(4, new String[] { "a", "aba", "ababa", "aa" });
    }

    @Test
    void test1() {
        test(2, new String[] { "pa", "papa", "ma", "mama" });
    }

    @Test
    void test2() {
        test(0, new String[] { "abab", "ab" });
    }
}
