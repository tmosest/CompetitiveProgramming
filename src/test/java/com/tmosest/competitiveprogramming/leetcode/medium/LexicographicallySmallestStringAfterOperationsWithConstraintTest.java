package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("greedy")
@Tag("string")
@Tag("wc392")
@DisplayName("LeetCode: 3106. Lexicographically Smallest String After Operations With Constraint")
class LexicographicallySmallestStringAfterOperationsWithConstraintTest {
    private LexicographicallySmallestStringAfterOperationsWithConstraint lexicographicallySmallestStringAfterOperationsWithConstraint;

    @BeforeEach
    void setup() {
        lexicographicallySmallestStringAfterOperationsWithConstraint = new LexicographicallySmallestStringAfterOperationsWithConstraint();
    }

    private void test(String output, String s, int k) {
        Assertions.assertEquals(output,
                lexicographicallySmallestStringAfterOperationsWithConstraint.getSmallestString(s, k));
    }

    @Test
    void test0() {
        test("aaaz", "zbbz", 3);
    }

    @Test
    void test1() {
        test("aawcd", "xaxcd", 4);
    }

    @Test
    void test2() {
        test("lol", "lol", 0);
    }
}
