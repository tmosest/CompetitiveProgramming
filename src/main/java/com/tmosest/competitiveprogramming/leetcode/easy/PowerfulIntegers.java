package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class PowerfulIntegers {
  /* Write code here. */

  /**
   * Function to compute the powerful integers below a bound. A powerful number is given with left^i
   * + right^j <= bound. For some i and j >= 0.
   *
   * @param left First number.
   * @param right Second number.
   * @param bound The bound for the computed number.
   * @return A list of numbers that meet the criteria.
   */
  public List<Integer> powerfulIntegers(int left, int right, int bound) {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < 18 && Math.pow(left, i) <= bound; i++) {
      for (int j = 0; j < 18 && Math.pow(right, j) <= bound; j++) {
        int check = computePowerfulNumber(left, right, i, j);
        if (check <= bound) {
          set.add(check);
        }
      }
    }
    List<Integer> result = new ArrayList<>();
    result.addAll(set);
    return result;
  }

  private int computePowerfulNumber(int one, int two, int powOne, int powTwo) {
    return (int) Math.pow(one, powOne) + (int) Math.pow(two, powTwo);
  }


}
