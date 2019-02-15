package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 605. Can Place Flowers")
public class CanPlaceFlowersTest {

  CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {1,0,0,0,1};
    Assertions.assertTrue(canPlaceFlowers.canPlaceFlowers(input, 1));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] input = {1,0,0,0,1};
    Assertions.assertFalse(canPlaceFlowers.canPlaceFlowers(input, 2));
  }
}
