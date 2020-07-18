package com.tmosest.competitiveprogramming.leetcode.medium;

class XorOperationInAnArray {

  int xorOperation(int num, int start) {
    int res = start;

    for (int i = 1; i < num; i++) {
      res ^= (2 * i) + start;
    }

    return res;
  }
}
