package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.ArrayList;
import java.util.List;

class MaximumPerformanceOfTeam {

  private static final Integer MOD = 1000000007;

  int maxPerformance(int len, int[] speed, int[] efficiency, int count) {
    List<List<Integer>> combinations = new ArrayList<>();

    for (int c = 1; c <= count; c++) {
      for (int i = 0; i < len; i++) {
        generateChoices(
            combinations,
            new ArrayList<>(),
            i,
            c,
            len
        );
      }
    }

    int maxPerformance = 0;
    for (List<Integer> combination : combinations) {
      int speedFactor = 0;
      int productivityFactor = Integer.MAX_VALUE;

      for (Integer id : combination) {
        speedFactor += speed[id];
        speedFactor %= MOD;
        productivityFactor = Math.min(productivityFactor, efficiency[id]);
      }

      long product = speedFactor * productivityFactor;
      product %= MOD;

      maxPerformance = Math.max(maxPerformance, (int) product);
    }

    return maxPerformance;
  }

  void generateChoices(
      List<List<Integer>> results,
      List<Integer> combination,
      int index,
      int count,
      int size
  ) {

    if (index >= size) {
      return;
    }

    combination.add(index);

    if (combination.size() == count) {
      results.add(combination);
      return;
    }

    for (int next = index + 1; next < size; next++) {
      generateChoices(
          results,
          new ArrayList<>(combination),
          next,
          count,
          size
      );
    }
  }
}
