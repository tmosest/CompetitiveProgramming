package com.tmosest.competitiveprogramming.leetcode.medium;

/**
 * 0 -> 0.
 * 1 -> 1.
 * 2 -> 110 (4 - 2 + 0).
 * 3 -> 111.
 * 4 -> 100.
 * 5 -> 101.
 * 6 -> 11010.
 * 7 -> 11011.
 * 8 -> 11000.
 * 9 -> 11001.
 * 10 -> 11111.
 */
class ConvertToBaseNegativeTwo {

  /**
   * Converts a number to negative base 2.
   *
   * @param num The number to convert over.
   * @return The negative base two string of it.
   */
  public String baseNeg2(int num) {
    return Integer.toBinaryString(1431655765 ^ (1431655765 - num));
  }
}
