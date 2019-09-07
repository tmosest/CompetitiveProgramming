package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 947. Most Stones Removed with Same Row or Column")
class MostStonesRemovedWithSameRowOrColumnTest {

  private MostStonesRemovedWithSameRowOrColumn mostStonesRemovedWithSameRowOrColumn = new MostStonesRemovedWithSameRowOrColumn();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] input = 
        {{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}};
    Assertions.assertEquals(5, mostStonesRemovedWithSameRowOrColumn.removeStones(input));
  }
}
