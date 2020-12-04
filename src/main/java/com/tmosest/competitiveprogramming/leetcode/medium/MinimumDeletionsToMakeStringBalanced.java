package com.tmosest.competitiveprogramming.leetcode.medium;

class MinimumDeletionsToMakeStringBalanced {

  int minimumDeletions(String str) {
    int len = str.length();
    int endA = 0;
    int endB = 0;
    for (int i = 0; i < len; i++) {
      if (str.charAt(i) == 'a') {
        endB++;
      } else {
        endB = Math.min(endA, endB);
        endA++;
      }
    }
    return Math.min(endA, endB);
  }
}
