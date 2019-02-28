package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 581. Shortest Unsorted Continuous Subarray")
public class ShortestUnsortedContinuousSubarrayTest {
  ShortestUnsortedContinuousSubarray shortestUnsortedContinuousSubarray = new ShortestUnsortedContinuousSubarray();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        2, 6, 4, 8, 10, 9, 15
    };
    Assertions.assertEquals(5, shortestUnsortedContinuousSubarray.findUnsortedSubarray(input));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] input = {
        2, 4, 6, 8, 9, 10, 15
    };
    Assertions.assertEquals(0, shortestUnsortedContinuousSubarray.findUnsortedSubarray(input));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    int[] input = {
        2, 6, 4, 8, 9, 10, 15
    };
    Assertions.assertEquals(2, shortestUnsortedContinuousSubarray.findUnsortedSubarray(input));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    int[] input = {
        1,3,2,2,2
    };
    Assertions.assertEquals(4, shortestUnsortedContinuousSubarray.findUnsortedSubarray(input));
  }
}
