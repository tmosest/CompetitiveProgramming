package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 274. H-Index")
class HindexTest {

  private Hindex hindex = new Hindex();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        3, 0, 6, 1, 5
    };
    Assertions.assertEquals(3, hindex.hindex(input));
  }
}
