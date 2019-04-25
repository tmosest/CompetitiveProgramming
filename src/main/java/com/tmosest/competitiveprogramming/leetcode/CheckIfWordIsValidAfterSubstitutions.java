package com.tmosest.competitiveprogramming.leetcode;

class CheckIfWordIsValidAfterSubstitutions {

  /**
   * Determine if this is a valid string.
   * @param str the string to check.
   * @return True if it is valid and false otherwise.
   */
  boolean isValid(String str) {
    while (str.contains("abc")) {
      str = str.replace("abc", "");
      if ("".equals(str)) {
        return true;
      }
    }
    return false;
  }
}
