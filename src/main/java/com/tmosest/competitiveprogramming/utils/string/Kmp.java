package com.tmosest.competitiveprogramming.utils.string;

public class Kmp {

  /**
   * Constructs LPS array from pattern. It represents the longest proper prefix that is a proper
   * suffix for substring 0...i. https://www.geeksforgeeks.org/kmp-algorithm-for-pattern-searching
   *
   * @param pattern The pattern we are searching for.
   * @return LPS array.
   */
  static int[] constructLps(String pattern) {
    assert pattern.length() > 0;

    // length of the previous longest prefix suffix
    int len = 0;
    int idx = 1;

    int[] lps = new int[pattern.length()];
    lps[0] = 0; // lps[0] is always 0

    // the loop calculates lps[i] for i = 1 to M-1
    while (idx < pattern.length()) {
      if (pattern.charAt(idx) == pattern.charAt(len)) {
        len++;
        lps[idx] = len;
        idx++;
      } else {
        if (len != 0) {
          len = lps[len - 1];
        } else {
          lps[idx] = len;
          idx++;
        }
      }
    }

    return lps;
  }
}
