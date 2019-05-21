package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 485. Max Consecutive Ones")
class MaxConsecutiveOnesTest {
	/* Write code here. */

  MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1,1,0,1,1,1
    };
    Assertions.assertEquals(3, maxConsecutiveOnes.findMaxConsecutiveOnes(input));
  }


}
