package com.tmosest.competitiveprogramming.leetcode.medium;

class ConcatenationOfConsecutiveBinaryNumbers {

  int concatenatedBinary(int num) {
    long res = 0;
    long mul = 1;
    int mod = 1_000_000_007;
    for (int i = num; i > 0; --i) {
      int no = i;
      while (no > 0) {
        if (no % 2 == 1) {
          res = (res + mul) % mod;
        }
        no >>= 1;
        mul = (mul << 1) % mod;
      }
    }

    return (int) res;
  }
}
