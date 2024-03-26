package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("string")
@Tag("wc378")
@DisplayName("LeetCode: 2983. Palindrome Rearrangement Queries")
class PalindromeRearrangementQueriesTest {
    private PalindromeRearrangementQueries palindromeRearrangementQueries;

    @BeforeEach
    void setup() {
        palindromeRearrangementQueries = new PalindromeRearrangementQueries();
    }

    private void test(boolean[] output, String s, int[][] queries) {
        Assertions.assertArrayEquals(output, palindromeRearrangementQueries.canMakePalindromeQueries(s, queries));
    }

    @Test
    void test0() {
        test(new boolean[] { true, true }, "abcabc", new int[][] { { 1, 1, 3, 5 }, { 0, 2, 5, 5 } });
    }
}
