package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1200. Minimum Absolute Difference")
class MinimumAbsoluteDifferenceTest {

  private MinimumAbsoluteDifference minimumAbsoluteDifference = new MinimumAbsoluteDifference();

  @Test
  void testCase0() {
    int[] arr = { 1,3,6,10,15 };
    List<List<Integer>> result = minimumAbsoluteDifference.minimumAbsDifference(arr);
    Assertions.assertEquals(1, result.size());
  }
}
