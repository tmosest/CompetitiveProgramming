package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 63. Unique Paths II")
class UniquePathsTwoTest {

  private UniquePathsTwo uniquePathsTwo = new UniquePathsTwo();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] input = {
        {0,0,0},
        {0,1,0},
        {0,0,0}  
    };
    Assertions.assertEquals(2, uniquePathsTwo.uniquePathsWithObstacles(input));
  }
}
