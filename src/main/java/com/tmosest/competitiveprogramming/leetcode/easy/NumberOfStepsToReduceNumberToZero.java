package com.tmosest.competitiveprogramming.leetcode.easy;

class NumberOfStepsToReduceNumberToZero {

  int numberOfSteps(int num) {
    int steps = 0;

    while (num > 0) {
      ++steps;
      int diff = (num % 2 == 0) ? num / 2 : 1;
      num -= diff;
    }

    return steps;
  }
}
