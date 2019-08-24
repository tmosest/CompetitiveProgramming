package com.tmosest.competitiveprogramming.leetcode.medium;

class IntegerReplacement {

  int integerReplacement(int num) {
    if (num <= 1) {
      return 0;
    }
    if (num % 2 == 0) {
      return 1 + integerReplacement(num / 2);
    }
    return 1 + Math
        .min(1 + integerReplacement(1 + (num - 1) / 2), 1 + integerReplacement((num - 1) / 2));
  }
}
