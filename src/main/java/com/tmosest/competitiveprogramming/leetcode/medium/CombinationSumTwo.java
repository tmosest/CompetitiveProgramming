package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class CombinationSumTwo {

  /**
   * Same as CombinationSum but not allowed to duplicate candidates.
   * @param candidates The candidates (not unique).
   * @param target The target to sum to.
   * @return A list of lists which are the individual sums.
   */
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    Arrays.sort(candidates);
    List<List<Integer>> result = new ArrayList<>();
    for (int i = candidates.length - 1; i > -1; i--) {
      int remainder = target - candidates[i];
      if (remainder < 0) {
        continue;
      }
      int[] remainingCandidates = new int[candidates.length - 1];
      int index = 0;
      for (int j = 0; j < candidates.length; j++) {
        if (i != j) {
          remainingCandidates[index++] = candidates[j];
        }
      }
      List<List<Integer>> remainders = combinationSum2(remainingCandidates, remainder);
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
