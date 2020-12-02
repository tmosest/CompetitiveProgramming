package com.tmosest.competitiveprogramming.leetcode.easy;

class MaximumRepeatingSubstring {

  int maxRepeating(String sequence, String word) {
    int repeating = 0;
    StringBuilder sb = new StringBuilder(word);
    while (sequence.contains(sb)) {
      repeating++;
      sb.append(word);
    }
    return repeating;
  }
}
