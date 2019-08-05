package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 508. Most Frequent Subtree Sum")
class MostFrequentSubtreeSumTest {

  private Codec codec = new Codec();
  private MostFrequentSubtreeSum mostFrequentSubtreeSum = new MostFrequentSubtreeSum();

  @Test
  @DisplayName("Test Case 0")
  void testCae0() {
    mostFrequentSubtreeSum.getSum(codec.deserialize("[1]"));
  }
}
