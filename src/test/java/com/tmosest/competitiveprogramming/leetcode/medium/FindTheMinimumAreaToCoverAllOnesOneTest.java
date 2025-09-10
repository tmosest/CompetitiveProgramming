package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 3195. Find the Minimum Area to Cover All Ones I")
@Tag("wc403")
class FindTheMinimumAreaToCoverAllOnesOneTest {
    private FindTheMinimumAreaToCoverAllOnesOne findTheMinimumAreaToCoverAllOnesOne;

    @BeforeEach
    void setup() {
        findTheMinimumAreaToCoverAllOnesOne = new FindTheMinimumAreaToCoverAllOnesOne();
    }

    private void test(int output, int[][] grid) {
        Assertions.assertEquals(output, findTheMinimumAreaToCoverAllOnesOne.minimumArea(grid));
    }
    /*
     * Example 1
     * Input: grid = [[0,1,0],[1,0,1]]
     * Output: 6
     * null
     */

    @Test
    void test_1() {
        test(6, new int[][] { { 0, 1, 0 }, { 1, 0, 1 } });
    }
    /*
     * Example 2
     * Input: grid = [[1,0],[0,0]]
     * Output: 1
     * null
     */

    @Test
    void test_2() {
        test(1, new int[][] { { 1, 0 }, { 0, 0 } });
    }

}
