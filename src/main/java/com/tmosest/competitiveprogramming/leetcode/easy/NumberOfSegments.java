package com.tmosest.competitiveprogramming.leetcode.easy;

class NumberOfSegments {
  /* Write code here. */

  /**
   * Determine the number of segments in a sentence.
   *
   * @param str The string we are looking at.
   * @return The number of non-space segments.
   */
  public int countSegments(String str) {
    int result = 0;
    boolean isWord = false;
    for (char c : str.toCharArray()) {
      if (c != ' ') {
        isWord = true;
      } else {
        if (isWord) {
          ++result;
        }
        isWord = false;
      }
    }
    if (isWord) {
      ++result;
    }
    return result;
  }


}
