package com.tmosest.competitiveprogramming.leetcode.hard;

class RegularExpressionMatching {
  /* Write code here. */

  /**
   * Function that performs part of regex matching. '.' Matches any single character. '*' Matches
   * zero or more of the preceding element.
   *
   * @param str The string we are looking at.
   * @param pattern The pattern we are testing.
   * @return True if the pattern matches the string.
   */
  public boolean isMatch(String str, String pattern) {
    if (pattern.isEmpty()) {
      return str.isEmpty();
    }
    boolean firstMatch = !str.isEmpty()
        && (pattern.charAt(0) == str.charAt(0) || pattern.charAt(0) == '.');
    if (pattern.length() >= 2 && pattern.charAt(1) == '*') {
      return isMatch(str, pattern.substring(2))
          || (firstMatch && isMatch(str.substring(1), pattern));
    }
    return firstMatch && isMatch(str.substring(1), pattern.substring(1));
  }


}
