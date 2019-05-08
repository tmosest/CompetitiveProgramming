package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 938. Range Sum of BST")
class RangeSumOfBstTest {

  private RangeSumOfBst rangeSumOfBst = new RangeSumOfBst();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(0, rangeSumOfBst.rangeSumBst(null, 0, 0));
  }
}
