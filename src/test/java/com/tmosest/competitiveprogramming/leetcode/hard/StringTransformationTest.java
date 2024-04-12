package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("stringMatching")
@Tag("wc362")
@Tag("string")
@Tag("math")
@Tag("dynamic")
@DisplayName("LeetCode: 2851. String Transformation")
class StringTransformationTest {
    private StringTransformation stringTransformation;

    @BeforeEach
    void setup() {
        stringTransformation = new StringTransformation();
    }

    private void test(int output, String s, String t, long k) {
        Assertions.assertEquals(output, stringTransformation.numberOfWays(s, t, k));
    }

    @Test
    void test0() {
        test(2, "abcd", "cdab", 2);
    }

    @Test
    void test1() {
        test(2, "ababab", "ababab", 1);
    }
}
