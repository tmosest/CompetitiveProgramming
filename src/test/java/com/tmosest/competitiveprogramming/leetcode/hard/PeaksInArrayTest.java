package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@DisplayName("LeetCode: 3187. Peaks in Array")
@Tag("wc402")
class PeaksInArrayTest {
    private PeaksInArray peaksInArray;

    @BeforeEach
    void setup() {
        peaksInArray = new PeaksInArray();
    }

    private void test(List<Integer> output, int[] nums, int[][] queries) {
        Assertions.assertEquals(output, peaksInArray.countOfPeaks(nums, queries));
    }
    /*
     * Example 1
     * Input: nums = [3,1,4,2,5], queries = [[2,3,4],[1,0,4]]
     * Output: [0]
     * null
     */

    @Test
    void test_1() {
        test(List.of(0), new int[] { 3, 1, 4, 2, 5 }, new int[][] { { 2, 3, 4 }, { 1, 0, 4 } });
    }
    /*
     * Example 2
     * Input: nums = [4,1,4,2,1,5], queries = [[2,2,4],[1,0,2],[1,0,4]]
     * Output: [0,1]
     * null
     */

    @Test
    void test_2() {
        test(List.of(0, 1), new int[] { 4, 1, 4, 2, 1, 5 }, new int[][] { { 2, 2, 4 }, { 1, 0, 2 }, { 1, 0, 4 } });
    }

}
