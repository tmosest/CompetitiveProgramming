package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("prefix")
@Tag("suffix")
@Tag("wc365")
@DisplayName("LeetCode: 2874. Maximum Value of an Ordered Triplet II")
class MaximumValueOfAnOrderedTripletTwoTest {
    private MaximumValueOfAnOrderedTripletTwo maximumValueOfAnOrderedTripletTwo;

    @BeforeEach
    void setup() {
        maximumValueOfAnOrderedTripletTwo = new MaximumValueOfAnOrderedTripletTwo();
    }

    private void test(long output, int[] nums) {
        Assertions.assertEquals(output, maximumValueOfAnOrderedTripletTwo.maximumTripletValue(nums));
    }

    @Test
    void test0() {
        test(77, new int[] { 12, 6, 1, 2, 7 });
    }
}
