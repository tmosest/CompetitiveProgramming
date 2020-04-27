package com.tmosest.competitiveprogramming.leetcode.medium;

class MinimumNumberOfFrogsCroaking {

  int minNumberOfFrogs(String croakOfFrogs) {
    int count = 0;
    int rem = 0;
    int other = 0;
    int alpha = 0;
    int frogs = 0;
    for (char ch : croakOfFrogs.toCharArray()) {
      if (ch == 'c') {
        count++;
        frogs = frogs > 0 ? frogs - 1 : frogs;
      } else if (ch == 'r') {
        count--;
        rem++;
      } else if (ch == 'o') {
        rem--;
        other++;
      } else if (ch == 'a') {
        other--;
        alpha++;
      } else {
        alpha--;
        frogs++;
      }
      if (count < 0 || rem < 0 || other < 0 || alpha < 0) {
        return -1;
      }
    }
    if (count != 0 || rem != 0 || other != 0 || alpha != 0) {
      return -1;
    }
    return frogs;
  }
}
