package com.tmosest.competitiveprogramming.leetcode.easy;

import com.tmosest.competitiveprogramming.utils.number.BigInteger;

import java.util.List;

class AddToArrayFormOfInteger {

  /**
   * Add an integer to an an array representation of a number.
   *
   * @param arrayNum The array representation of the number.
   * @param toAdd The integer to add.
   * @return A list representation of the result.
   */
  List<Integer> addToArrayForm(int[] arrayNum, int toAdd) {
    return new BigInteger(arrayNum).add(new BigInteger(toAdd)).asIntegerList();
  }
}
