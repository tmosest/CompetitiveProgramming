package com.tmosest.competitiveprogramming.leetcode;

public class SmallestIntegerDivisibleBy {

  /**
   * Return the length of the smallest number composed of all ones that is divisible by divisor.
   * @param divisor The divisor we are looking for.
   * @return The length of the smallest number composed of all ones.
   */
  public int smallestRepunitDivByK(int divisor) {
    // Obviously if last digit is 1, then divisor can never be a factor of 2 or 5
    if ((divisor % 2 == 0) || (divisor % 5 == 0)) {
      return -1;
    }
    // Remainder that will be added to next 1
    int rem = 0;
    // keep track of length of 1
    int count = 1;
    int value = 1;
    // Make sure that first number to try divisible should be greater than divisor
    while (value < divisor) {
      value = Integer.parseInt(value + "1");
      ++count;
    }
    // As we know remaining numbers are only odd and not factor of 2 or 5
    // then definitely all other numbers are valid.
    while (value % divisor != 0) {
      rem = value % divisor;
      value = Integer.parseInt(rem + "1");
      ++count;
    }
    return count;
  }
}
