package com.tmosest.competitiveprogramming.leetcode;

public class RepeatedSubstringPattern {

  /**
   * Determine if a string could be constructed from a substring.
   * @param str The string.
   * @return True if it could be constructed from repeating a substring.
   */
  public boolean repeatedSubstringPattern(String str) {
    return (str + str).substring(1, 2 * str.length() - 1).contains(str);
  }
}
