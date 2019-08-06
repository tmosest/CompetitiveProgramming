package com.tmosest.competitiveprogramming.leetcode.medium;

class NthTribonacciNumber {

  /**
   * Find the nth tribonacci number.
   *
   * @param nth The index.
   * @return The number for that index.
   */
  int tribonacci(int nth) {
    if (nth == 0) {
      return 0;
    }
    if (nth == 1 || nth == 2) {
      return 1;
    }

    int t1 = 0;
    int t2 = 1;
    int t3 = 1;
    int ith = 3;

    while (ith != nth) {
      int temp = t3 + t2 + t1;
      t1 = t2;
      t2 = t3;
      t3 = temp;
      ith++;
    }

    return t1 + t2 + t3;
  }
}
