package com.tmosest.competitiveprogramming.leetcode;

public class BaseSeven {

  /**
   * Return the base seven representation of the number.
   * @param num The input number.
   * @return Base seven as a string.
   */
  public String convertToBase7(int num) {
    StringBuilder stringBuilder = new StringBuilder();
    if (num == 0) {
      stringBuilder.append(0);
      return stringBuilder.toString();
    }
    boolean isNegative = num < 0;
    if (isNegative) {
      num *= -1;
    }
    while (num > 0) {
      int digit = num % 7;
      stringBuilder.insert(0, digit);
      num /= 7;
    }
    if (isNegative) {
      stringBuilder.insert(0, '-');
    }
    return stringBuilder.toString();
  }
}
