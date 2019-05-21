package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 458. Poor Pigs")
class PoorPigsTest {
	/* Write code here. */

  PoorPigs poorPigs = new PoorPigs();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(5, poorPigs.poorPigs(1000,15,60));
  }


}
