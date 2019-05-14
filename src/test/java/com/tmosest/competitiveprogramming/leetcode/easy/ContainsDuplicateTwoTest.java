package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 219. Contains Duplicate II")
class ContainsDuplicateTwoTest {
	/* Write code here. */

  ContainsDuplicateTwo containsDuplicateTwo = new ContainsDuplicateTwo();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] nums = {1,2,3,1};
    int k = 3;
    Assertions.assertTrue(containsDuplicateTwo.containsNearbyDuplicate(nums, k));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] nums = {1,0,1,1};
    int k = 1;
    Assertions.assertTrue(containsDuplicateTwo.containsNearbyDuplicate(nums, k));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    int[] nums = {1,2,3,1,2,3};
    int k = 2;
    Assertions.assertFalse(containsDuplicateTwo.containsNearbyDuplicate(nums, k));
  }


}
