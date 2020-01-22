package com.tmosest.competitiveprogramming.leetcode.easy;

class MaximumNumberOfBalloons {

  int maxNumberOfBalloons(String text) {
    int[] counts = new int[26];
    for (char ch : text.toCharArray()) {
      counts[ch - 'a'] += 1;
    }
    return Math.min(
        counts[1],
        Math.min(counts[0],
            Math.min(counts[11] / 2,
                Math.min(counts[14] / 2,
                    counts[13]))));
  }
}
