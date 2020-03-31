package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.Arrays;

class FindAllGoodStrings {

  static final int MOD = 1000000007;

  int findGoodStrings(int len, String s1, String s2, String evil) {
    int[] memo = new int[1 << 17]; // Need total 17 bits, can check getKey() function
    Arrays.fill(memo, -1);
    return dfs(0, 0, true, true,
        len, s1.toCharArray(), s2.toCharArray(), evil.toCharArray(), computeLps(evil.toCharArray()),
        memo);
  }

  private int dfs(int index, int evilMatched, boolean leftBound, boolean rightBound,
      int len, char[] s1, char[] s2, char[] evil, int[] lps, int[] memo) {
    if (evilMatched == evil.length) {
      return 0; // contain `evil` as a substring -> not good string
    }
    if (index == len) {
      return 1; // it's a good string
    }
    int key = getKey(index, evilMatched, leftBound, rightBound);
    if (memo[key] != -1) {
      return memo[key];
    }
    char from = leftBound ? s1[index] : 'a';
    char to = rightBound ? s2[index] : 'z';
    int res = 0;
    for (char c = from; c <= to; c++) {
      int tmp = evilMatched;
      while (tmp > 0 && evil[tmp] != c) {
        tmp = lps[tmp - 1];
      }
      if (c == evil[tmp]) {
        tmp++;
      }
      res += dfs(index + 1, tmp, leftBound && (c == from), rightBound && (c == to),
          len, s1, s2, evil, lps, memo);
      res %= MOD;
    }
    return memo[key] = res;
  }

  private int getKey(int one, int two, boolean b1, boolean b2) {
    // Need 9 bits store n (2^9=512), 6 bits store m (2^6=64), 1 bit store b1, 1 bit store b2
    return (one << 8) | (two << 2) | ((b1 ? 1 : 0) << 1) | (b2 ? 1 : 0);
  }

  private int[] computeLps(char[] str) { // Longest Prefix also Suffix
    int len = str.length;
    int[] lps = new int[len];
    for (int i = 1, j = 0; i < len; i++) {
      while (j > 0 && str[i] != str[j]) {
        j = lps[j - 1];
      }
      if (str[i] == str[j]) {
        lps[i] = ++j;
      }
    }
    return lps;
  }
}
