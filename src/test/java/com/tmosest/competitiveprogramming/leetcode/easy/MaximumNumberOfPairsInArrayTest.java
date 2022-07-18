package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc302")
@DisplayName("LeetCode: 2341. Maximum Number of Pairs in Array")
class MaximumNumberOfPairsInArrayTest {

  private MaximumNumberOfPairsInArray maximumNumberOfPairsInArray;

  @BeforeEach
  void setup() {
    maximumNumberOfPairsInArray = new MaximumNumberOfPairsInArray();
  }

  private void test(int[] output, int[] nums) {
    Assertions.assertArrayEquals(output, maximumNumberOfPairsInArray.numberOfPairs(nums));
  }

  @Test
  void test0() {
    test(new int[] {3,1}, new int[] {1,3,2,1,3,2,2});
  }


}
