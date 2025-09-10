package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 916. Word Subsets")
@Tag("wc104")
class WordSubsetsTest {
    private WordSubsets wordSubsets;

    @BeforeEach
    void setup() {
        wordSubsets = new WordSubsets();
    }

    private void test(List<String> output, String[] words1, String[] words2) {
        Assertions.assertEquals(output, wordSubsets.wordSubsets(words1, words2));
    }
    /*
     * Example 1
     * Input: words1 = ["amazon","apple","facebook","google","leetcode"], words2 =
     * ["e","o"]
     * Output: ["facebook","google","leetcode"]
     * null
     */

    @Test
    void test1() {
        test(List.of("facebook", "google", "leetcode"),
                new String[] { "amazon", "apple", "facebook", "google", "leetcode" }, new String[] { "e", "o" });
    }
    /*
     * Example 2
     * Input: words1 = ["amazon","apple","facebook","google","leetcode"], words2 =
     * ["lc","eo"]
     * Output: ["leetcode"]
     * null
     */

    @Test
    void test2() {
        test(List.of("leetcode"), new String[] { "amazon", "apple", "facebook", "google", "leetcode" },
                new String[] { "lc", "eo" });
    }
    /*
     * Example 3
     * Input: words1 = ["acaac","cccbb","aacbb","caacc","bcbbb"], words2 =
     * ["c","cc","b"]
     * Output: ["cccbb"]
     * null
     */

    @Test
    void test3() {
        test(List.of("cccbb"), new String[] { "acaac", "cccbb", "aacbb", "caacc", "bcbbb" },
                new String[] { "c", "cc", "b" });
    }
}
