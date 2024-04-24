package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("depthFirstSearch")
@Tag("wc355")
@Tag("tree")
@Tag("bitmask")
@Tag("dynamic")
@DisplayName("LeetCode: 2791. Count Paths That Can Form a Palindrome in a Tree")
class CountPathsThatCanFormPalindromeInTreeTest {
    private CountPathsThatCanFormPalindromeInTree countPathsThatCanFormPalindromeInTree;

    @BeforeEach
    void setup() {
        countPathsThatCanFormPalindromeInTree = new CountPathsThatCanFormPalindromeInTree();
    }

    private void test(long output, List<Integer> parent, String s) {
        Assertions.assertEquals(output, countPathsThatCanFormPalindromeInTree.countPalindromePaths(parent, s));
    }

    @Test
    void test0() {
        test(8, List.of(-1,0,0,1,1,2), "acaabc");
    }
}
