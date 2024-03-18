package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("bwc126")
@DisplayName("LeetCode: 3081. Replace Question Marks in String to Minimize Its Value")
class ReplaceQuestionMarksInStringToMinimizeItsValueTest {
    private ReplaceQuestionMarksInStringToMinimizeItsValue replaceQuestionMarksInStringToMinimizeItsValue;

    @BeforeEach
    void setup() {
        replaceQuestionMarksInStringToMinimizeItsValue = new ReplaceQuestionMarksInStringToMinimizeItsValue();
    }

    private void test(String output, String s) {
        Assertions.assertEquals(output, replaceQuestionMarksInStringToMinimizeItsValue.minimizeStringValue(s));
    }

    @Test
    void test0() {
        test("abc", "???");
    }

    @Test
    void test1() {
        test("abac", "a?a?");
    }

    /*
    @Test
    void test2() {
        test("abcdefghijklmnopqrstuvwxyaz", "abcdefghijklmnopqrstuvwxy??");
    }
    */
}
