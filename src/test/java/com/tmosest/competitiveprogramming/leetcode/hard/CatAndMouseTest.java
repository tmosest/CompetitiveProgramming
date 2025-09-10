package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@DisplayName("LeetCode: 913. Cat and Mouse")
@Tag("wc104")
class CatAndMouseTest {
    private CatAndMouse catAndMouse;

    @BeforeEach
    void setup() {
        catAndMouse = new CatAndMouse();
    }

    private void test(int output, int[][] graph) {
        Assertions.assertEquals(output, catAndMouse.catMouseGame(graph));
    }
    /*
     * Example 1
     * Input: graph = [[2,5],[3],[0,4,5],[1,4,5],[2,3],[0,2,3]]
     * Output: 0
     * null
     */

    @Test
    void test1() {
        test(0, new int[][] { { 2, 5 }, { 3 }, { 0, 4, 5 }, { 1, 4, 5 }, { 2, 3 }, { 0, 2, 3 } });
    }
    /*
     * Example 2
     * Input: graph = [[1,3],[0],[3],[0,2]]
     * Output: 1
     * null
     */

    @Test
    void test2() {
        test(1, new int[][] { { 1, 3 }, { 0 }, { 3 }, { 0, 2 } });
    }
}
