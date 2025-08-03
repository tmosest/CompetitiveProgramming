package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 3638. Maximum Balanced Shipments")
@Tag("wc461")
class MaximumBalancedShipmentsTest {
    private MaximumBalancedShipments maximumBalancedShipments;

    @BeforeEach
    void setup() {
        maximumBalancedShipments = new MaximumBalancedShipments();
    }

    private void test(int output, int[] weight) {
        Assertions.assertEquals(output, maximumBalancedShipments.maxBalancedShipments(weight));
    }
    /*
     * Example 1
     * Input: weight = [2,5,1,4,3]
     * Output: 2
     * null
     */

    @Test
    void test1() {
        test(2, new int[] { 2, 5, 1, 4, 3 });
    }
    /*
     * Example 2
     * Input: weight = [4,4]
     * Output: 0
     * null
     */

    @Test
    void test2() {
        test(0, new int[] { 4, 4 });
    }
}
