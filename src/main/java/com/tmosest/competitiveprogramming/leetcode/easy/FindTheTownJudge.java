package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

class FindTheTownJudge {

  /* Write code here. */
  private Set<Integer>[] trusts;
  private Set<Integer>[] trustedBy;

  /**
   * Find the town judge.
   *
   * @param size The size of the town.
   * @param trust Who trusts who as a matrix.
   * @return The guys who is trusted and trusts no one.
   */
  public int findJudge(int size, int[][] trust) {
    trusts = (Set<Integer>[]) new Set[size];
    trustedBy = (Set<Integer>[]) new Set[size];
    for (int i = 0; i < size; i++) {
      trusts[i] = new HashSet<>();
      trustedBy[i] = new HashSet<>();
    }
    for (int[] pair : trust) {
      trusts[pair[0] - 1].add(pair[1] - 1);
      trustedBy[pair[1] - 1].add(pair[0] - 1);
    }
    int result = -1;
    for (int i = 0; i < size; i++) {
      if (trusts[i].size() == 0 && trustedBy[i].size() == size - 1) {
        result = i + 1;
        break;
      }
    }
    return result;
  }


}
