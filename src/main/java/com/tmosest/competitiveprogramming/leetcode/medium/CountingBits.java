package com.tmosest.competitiveprogramming.leetcode.medium;

class CountingBits {

  /**
   * Determine the number of ones in all nums up to num.
   * @param num The num to go to.
   * @return Array containing counts of ones in binary representation.
   */
  int[] countBits(int num) {
    int[] ans = new int[num + 1];
    ans[0] = 0;

    if (num == 0) {
      return ans;
    }

    ans[1] = 1;
    for (int i = 2; i <= num; i++) {
      ans[i] = ans[i / 2] + i % 2;
    }
    return ans;
  }
}
