package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("wcx")
@DisplayName("LeetCode: 1249. Minimum Remove to Make Valid Parentheses")
class MinimumRemoveToMakeValidParenthesesTest {
    private MinimumRemoveToMakeValidParentheses minimumRemoveToMakeValidParentheses;

    @BeforeEach
    void setup() {
        minimumRemoveToMakeValidParentheses = new MinimumRemoveToMakeValidParentheses();
    }

    private void test(String output, String s) {
        Assertions.assertEquals(output, minimumRemoveToMakeValidParentheses.minRemoveToMakeValid(s));
    }

    @Test
    void test0() {
        test("lee(t(c)o)de", "lee(t(c)o)de)");
    }

    @Test
    void test1() {
        test("ab(c)d", "a)b(c)d");
    }

    @Test
    void test2() {
        test("", "))((");
    }
}
