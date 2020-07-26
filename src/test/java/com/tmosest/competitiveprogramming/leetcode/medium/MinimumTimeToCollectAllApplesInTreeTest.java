package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("binaryTree")
@Tag("wc188")
@DisplayName("LeetCode: 1443. Minimum Time to Collect All Apples in a Tree")
class MinimumTimeToCollectAllApplesInTreeTest {

  private MinimumTimeToCollectAllApplesInTree minimumTimeToCollectAllApplesInTree =
      new MinimumTimeToCollectAllApplesInTree();

  @Test
  void testCase0() {
    Boolean[] arr = new Boolean[] {false,false,true,false,true,true,false};
    Assertions.assertEquals(8, minimumTimeToCollectAllApplesInTree.minTime(7,
        new int[][] {{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}},
        Arrays.asList(arr)
    ));
  }
}
