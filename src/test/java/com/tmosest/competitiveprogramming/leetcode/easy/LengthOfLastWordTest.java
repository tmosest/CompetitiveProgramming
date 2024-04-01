package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("wcx")
@DisplayName("LeetCode: 58. Length of Last Word")
class LengthOfLastWordTest {
    private LengthOfLastWord lengthOfLastWord;

    @BeforeEach
    void setup() {
        lengthOfLastWord = new LengthOfLastWord();
    }

    private void test(int output, String s) {
        Assertions.assertEquals(output, lengthOfLastWord.lengthOfLastWord(s));
    }

    @Test
    void test0() {
        test(5, "Hello World");
    }
}
