package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 575. Distribute Candies")
class DistributeCandiesTest {
	/* Write code here. */

  DistributeCandies distributeCandies = new DistributeCandies();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] candies = {
        1,1,2,2,3,3
    };
    Assertions.assertEquals(3, distributeCandies.distributeCandies(candies));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] candies = {
        1,1,2,3
    };
    Assertions.assertEquals(2, distributeCandies.distributeCandies(candies));
  }


}
