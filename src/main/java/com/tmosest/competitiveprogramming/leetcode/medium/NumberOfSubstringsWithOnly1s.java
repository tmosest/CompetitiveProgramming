package com.tmosest.competitiveprogramming.leetcode.medium;

class NumberOfSubstringsWithOnly1s {

  private static int MOD = (int) 1e9 + 7;

  int numSub(String str) {
    int res = 0;
    int count = 0;
    for (int i = 0; i < str.length(); ++i) {
      count = str.charAt(i) == '1' ? count + 1 : 0;
      res = (res + count) % MOD;
    }

    return res;
  }
}
