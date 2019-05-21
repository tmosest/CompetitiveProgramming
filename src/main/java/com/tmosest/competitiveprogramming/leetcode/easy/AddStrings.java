package com.tmosest.competitiveprogramming.leetcode.easy;

import com.tmosest.competitiveprogramming.utils.number.BigInteger;

class AddStrings {

  /**
   * Function to sum two numbers strings that are numbers.
   *
   * @param num1 The first number string.
   * @param num2 The second number string.
   * @return The sum of the two numbers as strings.
   */
  String addStrings(String num1, String num2) {
    return new BigInteger(num1).add(new BigInteger(num2)).toString();
  }
}
