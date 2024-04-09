package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc365")
@DisplayName("LeetCode: 2873. Maximum Value of an Ordered Triplet I")
class MaximumValueOfAnOrderedTripletOneTest {
    private MaximumValueOfAnOrderedTripletOne maximumValueOfAnOrderedTripletOne;

    @BeforeEach
    void setup() {
        maximumValueOfAnOrderedTripletOne = new MaximumValueOfAnOrderedTripletOne();
    }

    private void test(long output, int[] nums) {
        Assertions.assertEquals(output, maximumValueOfAnOrderedTripletOne.maximumTripletValue(nums));
    }

    @Test
    void test0() {
        test(77, new int[] { 12, 6, 1, 2, 7 });
    }
}
