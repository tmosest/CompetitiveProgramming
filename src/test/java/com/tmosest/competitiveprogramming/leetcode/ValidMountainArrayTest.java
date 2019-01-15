package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 941. Valid Mountain Array")
public class ValidMountainArrayTest {

  ValidMountainArray validMountainArray = new ValidMountainArray();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] array = {2, 1};
    Assertions.assertFalse(validMountainArray.validMountainArray(array));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] array = {3,5,5};
    Assertions.assertFalse(validMountainArray.validMountainArray(array));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    int[] array = {0,3,2,1};
    Assertions.assertTrue(validMountainArray.validMountainArray(array));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    int[] array = {14,82,89,84,79,70,70,68,67,66,63,60,58,54,44,43,32,28,26,25,22,15,13,12,10,8,7,5,4,3};
    Assertions.assertFalse(validMountainArray.validMountainArray(array));
  }

}
