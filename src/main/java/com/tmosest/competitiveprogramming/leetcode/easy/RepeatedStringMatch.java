package com.tmosest.competitiveprogramming.leetcode.easy;

class RepeatedStringMatch {
  /* Write code here. */

  /**
   * Determine number of times one string is repeated in another.
   *
   * @param stringOne First string.
   * @param stringTwo Second string.
   * @return Return the number of times.
   */
  public int repeatedStringMatch(String stringOne, String stringTwo) {
    int result = 1;
    StringBuilder stringBuilder = new StringBuilder(stringOne);
    for (; stringBuilder.length() < stringTwo.length(); result++) {
      stringBuilder.append(stringOne);
    }
    if (stringBuilder.indexOf(stringTwo) >= 0) {
      return result;
    }
    if (stringBuilder.append(stringOne).indexOf(stringTwo) >= 0) {
      return result + 1;
    }
    return -1;
  }


}
