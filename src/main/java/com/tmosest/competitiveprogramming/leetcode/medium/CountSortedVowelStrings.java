package com.tmosest.competitiveprogramming.leetcode.medium;

class CountSortedVowelStrings {

  private int ans;

  int countVowelStrings(int num) {
    ans = 0;
    count(0, num);
    return ans;
  }

  private void count(int src, int num) {
    if (num == 0) {
      ans++;
      return;
    }
    for (int i = src; i < 5; i++) {
      count(i, num - 1);
    }
  }
}
