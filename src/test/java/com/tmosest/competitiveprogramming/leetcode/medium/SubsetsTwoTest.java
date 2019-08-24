package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 90. Subsets II")
class SubsetsTwoTest {

  private SubsetsTwo subsetsTwo = new SubsetsTwo();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
      1, 2, 2
    };
    subsetsTwo.subsetsWithDup(input);
  }
}
