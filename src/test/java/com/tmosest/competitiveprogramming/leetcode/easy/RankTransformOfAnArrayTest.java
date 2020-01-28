package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1331. Rank Transform of an Array")
class RankTransformOfAnArrayTest {

  private RankTransformOfAnArray rankTransformOfAnArray = new RankTransformOfAnArray();

  @Test
  void testCase0() {
    int[] arr = {40, 10, 20, 30};
    int[] expected = {4, 1, 2, 3};
    Assertions.assertArrayEquals(expected, rankTransformOfAnArray.arrayRankTransform(arr));
  }
}
