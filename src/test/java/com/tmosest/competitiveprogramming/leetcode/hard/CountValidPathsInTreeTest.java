package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("primes")
@Tag("tree")
@Tag("wc364")
@DisplayName("LeetCode: 2867. Count Valid Paths in a Tree")
class CountValidPathsInTreeTest {
    private CountValidPathsInTree countValidPathsInTree;

    @BeforeEach
    void setup() {
        countValidPathsInTree = new CountValidPathsInTree();
    }

    private void test(long output, int n, int[][] edges) {
        Assertions.assertEquals(output, countValidPathsInTree.countPaths(n, edges));
    }

    @Test
    void test0() {
        test(4, 5, new int[][] { { 1, 2 }, { 1, 3 }, { 2, 4 }, { 2, 5 } });
    }

    @Test
    void test1() {
        test(6, 6, new int[][] { { 1, 2 }, { 1, 3 }, { 2, 4 }, { 3, 5 }, { 3, 6 } });
    }
}
