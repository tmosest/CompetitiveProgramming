package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc218")
@DisplayName("LeetCode: 1679. Max Number of K-Sum Pairs")
class MaxNumberOfKsumPairsTest {

  private MaxNumberOfKsumPairs maxNumberOfKsumPairs = new MaxNumberOfKsumPairs();

  @Test
  void test1() {
    Assertions.assertEquals(2, maxNumberOfKsumPairs.maxOperations(
        new int[] {1,2,3,4},
        5
    ));
  }
}
