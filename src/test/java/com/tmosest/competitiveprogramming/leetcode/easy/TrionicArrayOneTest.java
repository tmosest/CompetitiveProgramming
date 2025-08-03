package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 3637. Trionic Array I")
@Tag("wc461")
class TrionicArrayOneTest {
    private TrionicArrayOne trionicArrayOne;

    @BeforeEach
    void setup() {
        trionicArrayOne = new TrionicArrayOne();
    }

    private void test(boolean output, int[] nums) {
        Assertions.assertEquals(output, trionicArrayOne.isTrionic(nums));
    }
    /*
     * Example 1
     * Input: nums = [1,3,5,4,2,6]
     * Output: true
     * null
     */

    @Test
    void test1() {
        test(true, new int[] {1,3,5,4,2,6});
    }
    /*
     * Example 2
     * Input: nums = [2,1,3]
     * Output: false
     * null
     */

    @Test
    void test2() {
        test(false, new int[] {2,1,3});
    }
}
