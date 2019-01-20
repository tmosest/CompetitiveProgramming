package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@DisplayName("LeetCode: 978. Longest Turbulent Subarray")
public class LongestTurbulentSubarrayTest {

  LongestTurbulentSubarray longestTurbulentSubarray = new LongestTurbulentSubarray();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {9,4,2,10,7,8,8,1,9};
    Assertions.assertEquals(5, longestTurbulentSubarray.maxTurbulenceSize(input));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] input = {4,8,12,16};
    Assertions.assertEquals(2, longestTurbulentSubarray.maxTurbulenceSize(input));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    int[] input = {100};
    Assertions.assertEquals(1, longestTurbulentSubarray.maxTurbulenceSize(input));
  }

  /*
  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    int[] input = {2,0,2,4,2,5,0,1,2,3};
    Assertions.assertEquals(6, longestTurbulentSubarray.maxTurbulenceSize(input));
  }
  */
}
