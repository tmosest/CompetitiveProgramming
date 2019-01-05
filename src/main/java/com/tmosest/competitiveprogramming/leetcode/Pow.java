package com.tmosest.competitiveprogramming.leetcode;

public class Pow {

  /**
   * Function to compute the power of a number.
   * It uses recursion to compute the power in O(lg(power)) instead of using linear time.
   * @param number The number to compute the power of.
   * @param power The power.
   * @return The number to the power.
   */
  public double myPow(double number, int power) {
    if (power == 0) {
      return 1.0;
    }
    if (power < 0) {
      number = 1 / number;
      power *= -1;
    }
    double result = (power % 2 == 0)
        ? myPow(number * number, power / 2)
        : number * myPow(number, power - 1);
    if (Double.isInfinite(result)) {
      result = 0.0;
    }
    result = (double)Math.round(result * 1000d) / 1000d;
    return result;
  }
}
