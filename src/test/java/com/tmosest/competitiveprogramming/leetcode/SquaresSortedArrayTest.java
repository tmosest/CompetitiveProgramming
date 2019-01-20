package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 977. Squares of a Sorted Array")
public class SquaresSortedArrayTest {

  SquaresSortedArray squaresSortedArray = new SquaresSortedArray();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] inputs = {-4,-1,0,3,10};
    int[] expected = {0,1,9,16,100};
    Assertions.assertArrayEquals(expected, squaresSortedArray.sortedSquares(inputs));
  }
}
