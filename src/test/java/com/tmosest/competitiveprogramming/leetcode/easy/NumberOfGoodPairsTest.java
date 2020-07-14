package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc197")
@DisplayName("LeetCode: 1512. Number of Good Pairs")
class NumberOfGoodPairsTest {

  private NumberOfGoodPairs numberOfGoodPairs = new NumberOfGoodPairs();

  @Test
  void testCase0() {
    Assertions.assertEquals(4, numberOfGoodPairs.numIdenticalPairs(new int[]{
        1, 2, 3, 1, 1, 3
    }));
  }
}
