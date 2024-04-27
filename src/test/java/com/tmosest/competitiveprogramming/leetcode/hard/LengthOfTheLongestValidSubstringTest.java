package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("sort")
@Tag("wc354")
@Tag("set")
@Tag("string")
@Tag("array")
@DisplayName("LeetCode: 2781. Length of the Longest Valid Substring")
class LengthOfTheLongestValidSubstringTest {
    private LengthOfTheLongestValidSubstring lengthOfTheLongestValidSubstring;

    @BeforeEach
    void setup() {
        lengthOfTheLongestValidSubstring = new LengthOfTheLongestValidSubstring();
    }

    private void test(int output, String word, List<String> forbidden) {
        Assertions.assertEquals(output, lengthOfTheLongestValidSubstring.longestValidSubstring(word, forbidden));
    }

    @Test
    void test0() {
        test(4, "cbaaaabc", List.of("aaa", "cb"));
    }

    @Test
    void test1() {
        test(4, "leetcode", List.of("de", "le", "e"));
    }
}
