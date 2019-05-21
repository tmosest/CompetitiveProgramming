package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("point")
@DisplayName("LeetCode: 1037. Valid Boomerang")
class ValidBoomerangTest {

  private ValidBoomerang validBoomerang = new ValidBoomerang();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] points = {
        {1,1},{2,3},{3,2}
    };
    Assertions.assertTrue(validBoomerang.isBoomerang(points));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[][] points = {
        {1,1},{2,2},{3,3}
    };
    Assertions.assertFalse(validBoomerang.isBoomerang(points));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    int[][] points = {
        {0,0},{0,2},{2,1}
    };
    Assertions.assertTrue(validBoomerang.isBoomerang(points));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    int[][] points = {
        {0,1},{0,1},{2,1}
    };
    Assertions.assertFalse(validBoomerang.isBoomerang(points));
  }


}
