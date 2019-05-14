package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("matrix")
@DisplayName("LeetCode: 624. Maximum Distance in Arrays")
class MaximumDistanceInArraysTest {
	/* Write code here. */

  MaximumDistanceInArrays maximumDistanceInArrays = new MaximumDistanceInArrays();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Integer[][] input = {
      {1,2,3},
      {4,5},
      {1,2,3}
    };
    List<List<Integer>> lists = new LinkedList<>();
    for (Integer[] array : input) {
      List<Integer> list = Arrays.asList(array);
      lists.add(list);
    }
    Assertions.assertEquals(4, maximumDistanceInArrays.maxDistance(lists));
  }


}
