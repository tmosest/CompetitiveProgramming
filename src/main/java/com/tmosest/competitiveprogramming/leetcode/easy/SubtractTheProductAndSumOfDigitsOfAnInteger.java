package com.tmosest.competitiveprogramming.leetcode.easy;

class SubtractTheProductAndSumOfDigitsOfAnInteger {

  int subtractProductAndSum(int num) {
    long product = 1;
    long sum = 0;

    while (num > 0) {
      int dig = num % 10;
      product *= dig;
      sum += dig;
      num /= 10;
    }

    return (int) (product - sum);
  }
}
