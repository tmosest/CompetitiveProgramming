package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class ReorganizeString {

  /**
   * Rearrange so dupe letters are not adjacent. If cannot be done return an empty string.
   *
   * @param str The input string.
   * @return The rearranged string if possible.
   */
  String reorganizeString(String str) {
    int[] counts = new int[26];
    char[] letters = str.toCharArray();
    for (char letter : letters) {
      counts[letter - 'a'] += 100;
    }
    for (int i = 0; i < 26; ++i) {
      counts[i] += i;
    }
    Arrays.sort(counts);
    char[] ans = new char[letters.length];
    int temp = 1;
    for (int code : counts) {
      int ct = code / 100;
      char ch = (char) ('a' + (code % 100));
      if (ct > (letters.length + 1) / 2) {
        return "";
      }
      for (int i = 0; i < ct; ++i) {
        if (temp >= letters.length) {
          temp = 0;
        }
        ans[temp] = ch;
        temp += 2;
      }
    }
    return String.valueOf(ans);
  }
}
