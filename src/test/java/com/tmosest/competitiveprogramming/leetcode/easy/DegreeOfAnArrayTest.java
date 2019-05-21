package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 697. Degree of an Array")
class DegreeOfAnArrayTest {
	/* Write code here. */

  DegreeOfAnArray degreeOfAnArray = new DegreeOfAnArray();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {1, 2, 2, 3, 1};
    Assertions.assertEquals(2, degreeOfAnArray.findShortestSubArray(input));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] input = {1,2,2,3,1,4,2};
    Assertions.assertEquals(6, degreeOfAnArray.findShortestSubArray(input));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    int[] input = {1,1,2,2,2,1};
    Assertions.assertEquals(3, degreeOfAnArray.findShortestSubArray(input));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    int[] input = {10,9,9,9,10};
    Assertions.assertEquals(3, degreeOfAnArray.findShortestSubArray(input));
  }

  @Test
  @DisplayName("Test Case 4")
  void testCase4() {
    int[] input = {2,1};
    Assertions.assertEquals(1, degreeOfAnArray.findShortestSubArray(input));
  }


}
