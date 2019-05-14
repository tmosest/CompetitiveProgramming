package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

class ContainsDuplicateTwo {
  /* Write code here. */

  /**
   * Determines if there are two duplicates within a given range.
   *
   * @param nums An array of integers.
   * @param distance The max allowed distance between the duplicates.
   * @return True if a dupe was found with the given range difference.
   */
  public boolean containsNearbyDuplicate(int[] nums, int distance) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      Integer index = map.get(nums[i]);
      if (index != null && i - index <= distance) {
        return true;
      }
      map.put(nums[i], i);
    }
    return false;
  }


}
