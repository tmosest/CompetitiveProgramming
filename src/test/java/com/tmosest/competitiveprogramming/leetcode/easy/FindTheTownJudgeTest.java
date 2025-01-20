package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("graph")
@Tag("wc125")
@DisplayName("LeetCode: 997. Find the Town Judge")
class FindTheTownJudgeTest {
    private FindTheTownJudge findTheTownJudge;

    @BeforeEach
    void setup() {
        findTheTownJudge = new FindTheTownJudge();
    }

    private void test(int output, int n, int[][] trust) {
        Assertions.assertEquals(output, findTheTownJudge.findJudge(n, trust));
    }

    @Test
    void test0() {
        test(2, 2, new int[][] { { 1, 2 } });
    }

    @Test
    void test1() {
        test(3, 3, new int[][] { { 1, 3 }, { 2, 3 } });
    }

    @Test
    void test2() {
        test(-1, 3, new int[][] { { 1, 3 }, { 2, 3 }, { 3, 1 } });
    }

    @Test
    void test3() {
        test(3, 4, new int[][] { { 1, 3 }, { 1, 4 }, { 2, 3 }, { 2, 4 }, { 4, 3 } });
    }

    @Test
    void test4() {
        test(1, 1, new int[][] {});
    }
}
