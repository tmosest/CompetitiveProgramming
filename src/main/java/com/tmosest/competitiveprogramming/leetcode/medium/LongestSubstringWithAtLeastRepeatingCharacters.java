package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

class LongestSubstringWithAtLeastRepeatingCharacters {

  int longestSubstring(String str, int count) {
    return longestSubstringAux(str, count, 0, str.length());
  }

  private int longestSubstringAux(String str, int count, int start, int end) {
    if (start >= end) {
      return 0;
    }

    int[] letter = new int[26];
    for (int i = start; i < end; i++) {
      letter[str.charAt(i) - 'a']++;
    }

    char tc = 'A';
    for (int i = 0; i < 26; i++) {
      if (letter[i] > 0 && letter[i] < count) {
        tc = (char) (i + 'a');
      }
    }

    int max = 0;
    if (tc == 'A') {
      max = end - start;
    } else {
      List<Integer> idxes = find(str, start, end, tc);
      int sidx = 0;
      for (Integer idx : idxes) {
        max = Math.max(max, longestSubstringAux(str, count, sidx, idx));
        sidx = idx + 1;
      }
      max = Math.max(max, longestSubstringAux(str, count, sidx, end));
    }
    return max;
  }

  private List<Integer> find(String str, int start, int end, char letter) {
    List<Integer> row = new ArrayList<>();
    for (int i = start; i < end; i++) {
      if (str.charAt(i) == letter) {
        row.add(i);
      }
    }
    return row;
  }
}
