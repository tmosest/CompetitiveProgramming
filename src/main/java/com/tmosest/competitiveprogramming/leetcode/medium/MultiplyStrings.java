package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.utils.number.BigInteger;

class MultiplyStrings {

  /**
   * Multiple two strings into a new string.
   *
   * @param num1 The first string number.
   * @param num2 The second string number.
   * @return The result of multiplication as a string.
   */
  public String multiply(String num1, String num2) {
    return new BigInteger(num1).multiply(new BigInteger(num2)).toString();
  }
}
