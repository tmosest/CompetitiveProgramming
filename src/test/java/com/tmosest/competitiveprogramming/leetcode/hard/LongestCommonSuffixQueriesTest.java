package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("string")
@Tag("trie")
@Tag("wc390")
@DisplayName("LeetCode: 3093. Longest Common Suffix Queries")
class LongestCommonSuffixQueriesTest {
    private LongestCommonSuffixQueries longestCommonSuffixQueries;

    @BeforeEach
    void setup() {
        longestCommonSuffixQueries = new LongestCommonSuffixQueries();
    }

    private void test(int[] output, String[] wordsContainer, String[] wordsQuery) {
        Assertions.assertArrayEquals(output, longestCommonSuffixQueries.stringIndices(wordsContainer, wordsQuery));
    }

    @Test
    void test0() {
        test(new int[] {1,1,1}, new String[] {"abcd","bcd","xbcd"}, new String[] {"cd","bcd","xyz"});
    }
}
