package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("array")
@Tag("binarySearch")
@Tag("slidingWindow")
@Tag("wc395")
@DisplayName("LeetCode: 3134. Find the Median of the Uniqueness Array")
class FindTheMedianOfTheUniquenessArrayTest {
    private FindTheMedianOfTheUniquenessArray findTheMedianOfTheUniquenessArray;

    @BeforeEach
    void setup() {
        findTheMedianOfTheUniquenessArray = new FindTheMedianOfTheUniquenessArray();
    }

    private void test(int output, int[] nums) {
        Assertions.assertEquals(output, findTheMedianOfTheUniquenessArray.medianOfUniquenessArray(nums));
    }

    @Test
    void test0() {
        test(1, new int[] { 1, 2, 3 });
    }

    @Test
    void test1() {
        test(2, new int[] { 3, 4, 3, 4, 5 });
    }
}
