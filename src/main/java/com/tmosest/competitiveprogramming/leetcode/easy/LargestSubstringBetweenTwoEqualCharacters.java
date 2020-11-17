package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;

class LargestSubstringBetweenTwoEqualCharacters {

  int maxLengthBetweenEqualCharacters(String str) {
    str = str == null ? "" : str;
    int[] startIndices = new int[26];
    Arrays.fill(startIndices, -1);
    int longest = -1;

    for (int i = 0; i < str.length(); i++) {
      char letter = str.charAt(i);
      if (startIndices[letter - 'a'] == -1) {
        startIndices[letter - 'a'] = i;
      } else {
        longest = Math.max(longest, i - startIndices[letter - 'a'] - 1);
      }
    }

    return longest;
  }
}
