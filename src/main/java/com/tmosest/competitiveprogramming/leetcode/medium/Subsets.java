package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

class Subsets {

  /**
   * Generate all the subsets of a set.
   *
   * @param nums Array containing the numbers.
   * @return A list of all subsets which are lists as well.
   */
  List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    generateSubsets(nums, 0, result);
    return result;
  }

  private void generateSubsets(int[] nums, int index, List<List<Integer>> set) {
    if (index >= nums.length) {
      return;
    }
    int setSize = set.size();
    for (int i = 0; i < setSize; i++) {
      List<Integer> list =  set.get(i);
      List<Integer> copy = new ArrayList<>();
      copy.addAll(list);
      copy.add(nums[index]);
      set.add(copy);
    }
    if (setSize == 0) {
      List<Integer> empty = new ArrayList<>();
      List<Integer> val = new ArrayList<>();
      val.add(nums[index]);
      set.add(empty);
      set.add(val);
    }
    generateSubsets(nums, index + 1, set);
  }
}
