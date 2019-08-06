package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

class BeautifulArray {

  private Map<Integer, int[]> memo;

  int[] beautifulArray(int num) {
    memo = new HashMap<>();
    return find(num);
  }

  private int[] find(int num) {
    if (memo.containsKey(num)) {
      return memo.get(num);
    }

    int[] ans = new int[num];
    if (num == 1) {
      ans[0] = 1;
    } else {
      int temp = 0;
      // Odds
      for (int x : find((num + 1) / 2)) {
        ans[temp++] = 2 * x - 1;
      }
      // Evens
      for (int x : find(num / 2)) {
        ans[temp++] = 2 * x;
      }
    }
    memo.put(num, ans);
    return ans;
  }
}
