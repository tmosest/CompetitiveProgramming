package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class CombinationSum {

  /**
   * Determine all the unique ways to sum to a target.
   * @param candidates The candidates to sum with.
   * @param target The target to sum to.
   * @param dupeCandidatesAllowed Are dupes of the candidates allowed.
   * @return List of list sums.
   */
  public List<List<Integer>> combinationSum(
      int[] candidates,
      int target,
      boolean dupeCandidatesAllowed
  ) {
    Arrays.sort(candidates);
    List<List<Integer>> result = new ArrayList<>();
    for (int i = candidates.length - 1; i > -1; i--) {
      int remainder = target - candidates[i];
      if (remainder < 0) {
        continue;
      }
      int[] remainingCandidates = candidates;
      if (!dupeCandidatesAllowed) {
        remainingCandidates = new int[candidates.length - 1];
        int index = 0;
        for (int j = 0; j < candidates.length; j++) {
          if (i != j) {
            remainingCandidates[index++] = candidates[j];
          }
        }
      }
      List<List<Integer>> remainders = combinationSum(
          remainingCandidates,
          remainder,
          dupeCandidatesAllowed
      );
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

  /**
   * Determine all the unique ways to sum to a target.
   * @param candidates The values we are allowed to sum.
   * @param target The target value we are trying to sum to.
   * @return A list of all the list sums.
   */
  List<List<Integer>> combinationSum(int[] candidates, int target) {
    return combinationSum(candidates, target, true);
  }
}
