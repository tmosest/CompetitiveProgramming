package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("matrix")
@Tag("wc385")
@DisplayName("LeetCode: 3042. Count Prefix and Suffix Pairs I")
class CountPrefixAndSuffixPairsOneTest {
    private CountPrefixAndSuffixPairsOne countPrefixAndSuffixPairsOne;

    @BeforeEach
    void setup() {
        countPrefixAndSuffixPairsOne = new CountPrefixAndSuffixPairsOne();
    }

    private void test(int output, String[] words) {
        Assertions.assertEquals(output, countPrefixAndSuffixPairsOne.countPrefixSuffixPairs(words));
    }

    @Test
    void test0() {
        test(4, new String[] {"a","aba","ababa","aa"});
    }

    @Test
    void test1() {
        test(2, new String[] {"pa","papa","ma","mama"});
    }

    @Test
    void test2() {
        test(0, new String[] {"abab","ab"});
    }

    @Test
    void test3() {
        test(0, new String[] {"bb","ab"});
    }
}
