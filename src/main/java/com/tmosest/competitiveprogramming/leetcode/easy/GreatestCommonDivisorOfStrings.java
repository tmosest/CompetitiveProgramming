package com.tmosest.competitiveprogramming.leetcode.easy;

class GreatestCommonDivisorOfStrings {

  /**
   * Determine the GCD of two strings. String T divides S iff S = T + ... + T.
   *
   * @param str1 The first string.
   * @param str2 The second string.
   */
  public String gcdOfStrings(String str1, String str2) {
    if (str1.length() == 0) {
      return str2;
    }
    if (str2.length() == 0) {
      return str1;
    }
    if (str1.equals(str2)) {
      return str1;
    }
    if (str1.length() > str2.length()) {
      for (int i = 0; i < str2.length(); i++) {
        if (str2.charAt(i) != str1.charAt(i)) {
          return "";
        }
      }
      String temp = str1.substring(str2.length());
      return gcdOfStrings(temp, str2);
    }
    if (str2.length() > str1.length()) {
      return gcdOfStrings(str2, str1);
    }
    return "";
  }
}
