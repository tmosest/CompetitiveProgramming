package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

class CombinationSumThree {

  private CombinationSum combinationSum = new CombinationSum();

  /**
   * Determine the number of ways to sum to a value.
   *
   * @param size The exact number of numbers allowed to sum.
   * @param num The num we are trying to sum to.
   * @return A list of ways to sum to the num.
   */
  public List<List<Integer>> combinationSum3(int size, int num) {
    int[] candidates = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    List<List<Integer>> allResults = combinationSum.combinationSum(candidates, num, false, false);
    List<List<Integer>> results = new ArrayList<>();
    for (List<Integer> list : allResults) {
      if (list.size() == size) {
        results.add(list);
      }
    }
    return results;
  }
}
