package com.tmosest.competitiveprogramming.leetcode;

import java.util.LinkedList;
import java.util.List;

public class BinaryPrefixDivisibleByFive {

  /**
   * Determine how many prefixes are divisible by 5.
   * @param arr Array of significant bits.
   * @return List of booleans.
   */
  public List<Boolean> prefixesDivBy5(int[] arr) {
    List<Boolean> result = new LinkedList<>();
    int num = 0;
    for (int digit : arr) {
      num *= 2;
      num += digit;
      num %= 5;
      result.add(num == 0);
    }
    return result;
  }
}
