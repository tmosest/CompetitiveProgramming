package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.List;

class CombinationSumTwo {

  private CombinationSum combinationSum = new CombinationSum();

  /**
   * Same as CombinationSum but not allowed to duplicate candidates.
   * @param candidates The candidates (not unique).
   * @param target The target to sum to.
   * @return A list of lists which are the individual sums.
   */
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    return combinationSum.combinationSum(candidates, target, false);
  }
}
