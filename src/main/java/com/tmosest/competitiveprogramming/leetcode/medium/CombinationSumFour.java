package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.List;

class CombinationSumFour {

  private CombinationSum combinationSum = new CombinationSum();

  /**
   * Determine number of way to sum to a number with dupes.
   *
   * @param nums The numbers we are allowed to sum with.
   * @param target The target we are aiming for.
   * @return The number of ways to get there.
   */
  public int combinationSum4(int[] nums, int target) {
    List<List<Integer>> results = combinationSum.combinationSum(nums, target, true, true);
    return results.size();
  }
}
