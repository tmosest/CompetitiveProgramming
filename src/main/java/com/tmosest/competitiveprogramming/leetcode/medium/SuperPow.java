package com.tmosest.competitiveprogramming.leetcode.medium;

class SuperPow {

  private int mod = 1337;

  int superPow(int num, int[] pow) {
    num = num % mod;
    int result = 1;
    for (int i : pow) {
      result = pow(result, 10) * pow(num, i) % mod;
    }
    return result;
  }

  private int pow(int num, int two) {
    num = num % mod;
    int pow = 1;
    for (int i = 0; i < two; i++) {
      pow = (pow * num) % mod;
    }
    return pow;
  }
}
