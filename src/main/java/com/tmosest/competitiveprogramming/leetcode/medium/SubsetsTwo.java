package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SubsetsTwo {

  /**
   * Generate the power set of a set with no dupes.
   *
   * @param nums An array of values.
   * @return The power set without dupes.
   */
  List<List<Integer>> subsetsWithDup(int[] nums) {

    List<List<Integer>> result = new ArrayList<>();
    if (nums == null || nums.length == 0) {
      return result;
    }

    Arrays.sort(nums);
    List<Integer> subset = new ArrayList<>();
    findAllSubset(nums, result, subset, 0);
    return result;
  }

  private void findAllSubset(int[] nums, List<List<Integer>> result, List<Integer> subset,
      int startIndex) {

    if (!result.contains(subset)) {
      result.add(new ArrayList<>(subset));
    }

    for (int i = startIndex; i < nums.length; i++) {
      subset.add(nums[i]);
      findAllSubset(nums, result, subset, i + 1);
      subset.remove(subset.size() - 1);
    }
  }
}
