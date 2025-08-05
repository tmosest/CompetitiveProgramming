package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 3170. Lexicographically Minimum String After Removing Stars")
@Tag("wc400")
class LexicographicallyMinimumStringAfterRemovingStarsTest {
    private LexicographicallyMinimumStringAfterRemovingStars lexicographicallyMinimumStringAfterRemovingStars;

    @BeforeEach
    void setup() {
        lexicographicallyMinimumStringAfterRemovingStars = new LexicographicallyMinimumStringAfterRemovingStars();
    }

    private void test(String output, String s) {
        Assertions.assertEquals(output, lexicographicallyMinimumStringAfterRemovingStars.clearStars(s));
    }
    /*
     * Example 1
     * Input: s = "aaba*"
     * Output: "aab"
     * null
     */

    @Test
    void test1() {
        test("aab", "aaba*");
    }
    /*
     * Example 2
     * Input: s = "abc"
     * Output: "abc"
     * null
     */

    @Test
    void test2() {
        test("abc", "abc");
    }
}
