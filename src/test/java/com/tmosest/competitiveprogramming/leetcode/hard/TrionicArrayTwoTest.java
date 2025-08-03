package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@DisplayName("LeetCode: 3640. Trionic Array II")
@Tag("wc461")
class TrionicArrayTwoTest {
    private TrionicArrayTwo trionicArrayTwo;

    @BeforeEach
    void setup() {
        trionicArrayTwo = new TrionicArrayTwo();
    }

    private void test(long output, int[] nums) {
        Assertions.assertEquals(output, trionicArrayTwo.maxSumTrionic(nums));
    }
    /*
     * Example 1
     * Input: nums = [0,-2,-1,-3,0,2,-1]
     * Output: -4
     * null
     */

    @Test
    void test1() {
        test(-4, new int[] { 0, -2, -1, -3, 0, 2, -1 });
    }
    /*
     * Example 2
     * Input: nums = [1,4,2,7]
     * Output: 14
     * null
     */

    @Test
    void test2() {
        test(14, new int[] { 1, 4, 2, 7 });
    }

}
