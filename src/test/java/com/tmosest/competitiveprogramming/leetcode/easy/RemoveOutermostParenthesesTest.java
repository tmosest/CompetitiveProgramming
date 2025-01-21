package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("wc131")
@DisplayName("LeetCode: 1021. Remove Outermost Parentheses")
class RemoveOutermostParenthesesTest {
    private RemoveOutermostParentheses removeOutermostParentheses;

    @BeforeEach
    void setup() {
        removeOutermostParentheses = new RemoveOutermostParentheses();
    }

    private void test(String output, String s) {
        Assertions.assertEquals(output, removeOutermostParentheses.removeOuterParentheses(s));
    }

    @Test
    void test0() {
        test("()()()", "(()())(())");
    }

    @Test
    void test1() {
        test("()()()()(())", "(()())(())(()(()))");
    }

    @Test
    void test2() {
        test("", "()()");
    }
}
