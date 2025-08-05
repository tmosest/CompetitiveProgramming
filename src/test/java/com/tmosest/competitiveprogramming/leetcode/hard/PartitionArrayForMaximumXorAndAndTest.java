package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@DisplayName("LeetCode: 3630. Partition Array for Maximum XOR and AND")
@Tag("wc460")
class PartitionArrayForMaximumXorAndAndTest {
    private PartitionArrayForMaximumXorAndAnd partitionArrayForMaximumXorAndAnd;

    @BeforeEach
    void setup() {
        partitionArrayForMaximumXorAndAnd = new PartitionArrayForMaximumXorAndAnd();
    }

    private void test(long output, int[] nums) {
        Assertions.assertEquals(output, partitionArrayForMaximumXorAndAnd.maximizeXorAndXor(nums));
    }
    /*
     * Example 1
     * Input: nums = [2,3]
     * Output: 5
     * null
     */

    @Test
    void test1() {
        test(5, new int[] { 2, 3 });
    }
    /*
     * Example 2
     * Input: nums = [1,3,2]
     * Output: 6
     * null
     */

    @Test
    void test2() {
        test(6, new int[] { 1, 3, 2 });
    }
    /*
     * Example 3
     * Input: nums = [2,3,6,7]
     * Output: 15
     * null
     */

    @Test
    void test3() {
        test(15, new int[] { 2, 3, 6, 7 });
    }
}
