package com.tmosest.competitiveprogramming.leetcode.hard;

class BuildArrayWhereYouCanFindTheMaximumExactlyComparisons {

  private int[][][] cache;
  private int mod = 1000000007;

  int numOfArrays(int one, int two, int three) {
    cache = new int[one + 1][two + 1][three + 1];
    int result = 0;
    for (int i = 1; i <= two; i++) {
      result = (result + dfs(one, i, three)) % mod;
    }
    return result;
  }

  private int dfs(int one, int two, int three) {
    if (two < three || one < three || three < 1) {
      return 0;
    }
    if (two == 1) {
      return 1;
    }
    if (one == 1) {
      return 1;
    }
    if (cache[one][two][three] != 0) {
      return cache[one][two][three];
    }
    int result = 0;
    for (int i = 1; i < two; i++) {
      result = (result + dfs(one - 1, i, three - 1)) % mod;
    }
    result = (int) ((result + ((long) two) * dfs(one - 1, two, three)) % mod);
    cache[one][two][three] = result;
    return result;
  }
}
