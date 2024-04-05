package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("graph")
@Tag("wc370")
@DisplayName("LeetCode: 2924. Find Champion II")
class FindChampionTwoTest {
    private FindChampionTwo findChampionTwo;

    @BeforeEach
    void setup() {
        findChampionTwo = new FindChampionTwo();
    }

    private void test(int output, int n, int[][] edges) {
        Assertions.assertEquals(output, findChampionTwo.findChampion(n, edges));
    }

    @Test
    void test0() {
        test(0, 3, new int[][] { { 0, 1 }, { 1, 2 } });
    }

    @Test
    void test1() {
        test(-1, 4, new int[][] { { 0, 2 }, { 1, 3 }, { 1, 2 } });
    }

    @Test
    void test2() {
        test(0, 3, new int[][] { { 0, 1 }, { 1, 2 }, { 0, 2 } });
    }
}
