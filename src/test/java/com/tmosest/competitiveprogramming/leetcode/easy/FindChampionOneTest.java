package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("matrix")
@Tag("wc370")
@DisplayName("LeetCode: 2923. Find Champion I")
class FindChampionOneTest {
    private FindChampionOne findChampionOne;

    @BeforeEach
    void setup() {
        findChampionOne = new FindChampionOne();
    }

    private void test(int output, int[][] grid) {
        Assertions.assertEquals(output, findChampionOne.findChampion(grid));
    }

    @Test
    void test0() {
        test(0, new int[][] { { 0, 1 }, { 0, 0 } });
    }

    @Test
    void test1() {
        test(1, new int[][] { { 0, 0, 1 }, { 1, 0, 1 }, { 0, 0, 0 } });
    }
}
