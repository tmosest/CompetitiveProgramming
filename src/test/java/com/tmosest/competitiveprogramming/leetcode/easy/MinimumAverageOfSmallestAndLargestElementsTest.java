package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 3194. Minimum Average of Smallest and Largest Elements")
@Tag("wc403")
class MinimumAverageOfSmallestAndLargestElementsTest {
    private MinimumAverageOfSmallestAndLargestElements minimumAverageOfSmallestAndLargestElements;

    @BeforeEach
    void setup() {
        minimumAverageOfSmallestAndLargestElements = new MinimumAverageOfSmallestAndLargestElements();
    }

    private void test(double output, int[] nums) {
        Assertions.assertEquals(output, minimumAverageOfSmallestAndLargestElements.minimumAverage(nums));
    }
    /*
     * Example 1
     * Input: nums = [7,8,3,4,15,13,4,1]
     * Output: 5.5
     * null
     */

    @Test
    void test_1() {
        test(5.5, new int[] { 7, 8, 3, 4, 15, 13, 4, 1 });
    }
    /*
     * Example 2
     * Input: nums = [1,9,8,3,10,5]
     * Output: 5.5
     * null
     */

    @Test
    void test_2() {
        test(5.5, new int[] { 1, 9, 8, 3, 10, 5 });
    }
    /*
     * Example 3
     * Input: nums = [1,2,3,7,8,9]
     * Output: 5.0
     * null
     */

    @Test
    void test_3() {
        test(5.0, new int[] { 1, 2, 3, 7, 8, 9 });
    }

}
