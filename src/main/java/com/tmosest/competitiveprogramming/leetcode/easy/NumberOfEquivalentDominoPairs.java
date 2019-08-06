package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class NumberOfEquivalentDominoPairs {

  /**
   * Determine the number of equivalent dominoes.
   *
   * @param dominoes The domino values.
   * @return The number of equivalent dominoes.
   */
  int numEquivDominoPairs(int[][] dominoes) {
    int sum = 0;
    HashMap<List<Integer>, Integer> cnt = new HashMap<>();
    for (int i = 0; i < dominoes.length; i++) {
      List<Integer> cur = new ArrayList<>();
      cur.add(dominoes[i][0]);
      if (dominoes[i][0] > dominoes[i][1]) {
        cur.add(0, dominoes[i][1]);
      } else {
        cur.add(dominoes[i][1]);
      }
      cnt.put(cur, cnt.getOrDefault(cur, 0) + 1);
    }
    for (int i : cnt.values()) {
      //System.out.println(i);
      sum += i * (i - 1) / 2;
    }
    return sum;
  }
}
