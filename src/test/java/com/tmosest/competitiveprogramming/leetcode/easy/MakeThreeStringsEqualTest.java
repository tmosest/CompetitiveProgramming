package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("wc372")
@DisplayName("LeetCode: 2937. Make Three Strings Equal")
class MakeThreeStringsEqualTest {
    private MakeThreeStringsEqual makeThreeStringsEqual;

    @BeforeEach
    void setup() {
        makeThreeStringsEqual = new MakeThreeStringsEqual();
    }

    private void test(int output, String s1, String s2, String s3) {
        Assertions.assertEquals(output, makeThreeStringsEqual.findMinimumOperations(s1, s2, s3));
    }

    @Test
    void test0() {
        test(2, "abc", "abb", "ab");
    }

    @Test
    void test1() {
        test(-1, "dac", "bac", "cac");
    }
}
