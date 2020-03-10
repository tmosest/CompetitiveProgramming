package com.tmosest.competitiveprogramming.leetcode.medium;

class BitwiseAndOfNumbersRange {

  int rangeBitwiseAnd(int one, int two) {
    int re = 0;
    for (int i = 31; i >= 0; i--) {
      if ((1 << i & two) != 0) {
        if ((1 << i & one & two) == 0) {
          return re;
        } else {
          re |= (1 << i);
        }
      }
    }
    return re;
  }
}
