package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("orderedSet")
@Tag("wc352")
@Tag("array")
@DisplayName("LeetCode: 2763. Sum of Imbalance Numbers of All Subarrays")
class SumOfImbalanceNumbersOfAllSubarraysTest {
    private SumOfImbalanceNumbersOfAllSubarrays sumOfImbalanceNumbersOfAllSubarrays;

    @BeforeEach
    void setup() {
        sumOfImbalanceNumbersOfAllSubarrays = new SumOfImbalanceNumbersOfAllSubarrays();
    }

    private void test(int output, int[] nums) {
        Assertions.assertEquals(output, sumOfImbalanceNumbersOfAllSubarrays.sumImbalanceNumbers(nums));
    }

    @Test
    void test0() {
        test(3, new int[] { 2, 3, 1, 4 });
    }
}
