package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CombinationSum {

  /**
   * Determine all the unique ways to sum to a target.
   * @param candidates The values we are allowed to sum.
   * @param target The target value we are trying to sum to.
   * @return A list of all the list sums.
   */
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    for (int i = candidates.length - 1; i > -1; i--) {
      int remainder = target - candidates[i];
      if (remainder < 0) {
        continue;
      }
      List<List<Integer>> remainders = combinationSum(candidates, remainder);
      if (remainder == 0 && remainders.size() == 0) {
        remainders.add(new ArrayList<>());
      }
      for (List<Integer> list : remainders) {
        list.add(candidates[i]);
        Collections.sort(list);
        if (!result.contains(list)) {
          result.add(list);
        }
      }
    }
    return result;
  }
}
