package com.tmosest.competitiveprogramming.leetcode.medium;

class WaterAndJugProblem {

  boolean canMeasureWater(int one, int two, int three) {
    return three == 0 || (three <= one + two && three % gcd(one, two) == 0);
  }

  private int gcd(int one, int two) {
    if (one == 0) {
      return two;
    }
    if (two == 0) {
      return one;
    }
    return gcd(two, one % two);
  }
}
