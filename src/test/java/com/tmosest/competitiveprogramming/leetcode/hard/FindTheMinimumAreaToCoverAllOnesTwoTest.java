package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

@Tag("leetcode")
@Tag("hard")
@DisplayName("LeetCode: 3197. Find the Minimum Area to Cover All Ones II")
@Tag("wc403")
class FindTheMinimumAreaToCoverAllOnesTwoTest {
    private FindTheMinimumAreaToCoverAllOnesTwo findTheMinimumAreaToCoverAllOnesTwo;

    @BeforeEach
    void setup() {
        findTheMinimumAreaToCoverAllOnesTwo = new FindTheMinimumAreaToCoverAllOnesTwo();
    }

    private void test(int output, int[][] grid) {
        Assertions.assertEquals(output, findTheMinimumAreaToCoverAllOnesTwo.minimumSum(grid));
    }
    /*
     * Example 1
     * Input: grid = [[1,0,1],[1,1,1]]
     * Output: 5
     * null
     */

    @Test
    void test_1() {
        test(5, new int[][] { { 1, 0, 1 }, { 1, 1, 1 } });
    }
    /*
     * Example 2
     * Input: grid = [[1,0,1,0],[0,1,0,1]]
     * Output: 5
     * null
     */

    @Test
    void test_2() {
        test(5, new int[][] { { 1, 0, 1, 0 }, { 0, 1, 0, 1 } });
    }

}
