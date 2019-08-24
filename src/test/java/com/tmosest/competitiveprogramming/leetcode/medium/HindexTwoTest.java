package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 275. H-Index II")
class HindexTwoTest {

  private HindexTwo hindexTwo = new HindexTwo();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        0, 1, 3, 5, 6
    };
    Assertions.assertEquals(3, hindexTwo.hindex(input));
  }
}
