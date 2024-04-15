package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc361")
@DisplayName("LeetCode: 2845. Count of Interesting Subarrays")
class CountOfInterestingSubarraysTest {
    private CountOfInterestingSubarrays countOfInterestingSubarrays;

    @BeforeEach
    void setup() {
        countOfInterestingSubarrays = new CountOfInterestingSubarrays();
    }

    private void test(long output, List<Integer> nums, int modulo, int k) {
        Assertions.assertEquals(output, countOfInterestingSubarrays.countInterestingSubarrays(nums, modulo, k));
    }

    @Test
    void test0() {
        test(3, List.of(3,2,4), 2, 1);
    }
}
