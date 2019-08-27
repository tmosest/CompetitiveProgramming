package com.tmosest.competitiveprogramming.leetcode.easy;

class IsSubsequence {

  /**
   * Determine if search is a sub-sequence of test.
   *
   * @param search Search.
   * @param test Test.
   * @return True if search is a sub-sequence of test.
   */
  boolean isSubsequence(String search, String test) {
    if (search.length() == 0) {
      return true;
    }
    if (search.length() > test.length()) {
      return false;
    }
    int searchIndex = 0;
    int testIndex = 0;
    while (searchIndex < search.length() && testIndex < test.length()) {
      if (search.charAt(searchIndex) == test.charAt(testIndex)) {
        searchIndex++;
      }
      if (searchIndex == search.length()) {
        return true;
      }
      testIndex++;
    }
    return false;
  }
}
