package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 220. Contains Duplicate III")
class ContainsDuplicateThreeTest {

  private ContainsDuplicateThree containsDuplicateThree = new ContainsDuplicateThree();

  @Test
  void testCase0() {
    int[] nums = {1,2,3,1};
    Assertions.assertTrue(containsDuplicateThree.containsNearbyAlmostDuplicate(nums, 3, 0));
  }
}
