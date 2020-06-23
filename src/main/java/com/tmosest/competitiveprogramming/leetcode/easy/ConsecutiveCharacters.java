package com.tmosest.competitiveprogramming.leetcode.easy;

class ConsecutiveCharacters {

  int maxPower(String str) {
    int max = 1;
    int temp = 1;
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i - 1) == str.charAt(i)) {
        temp++;
      } else {
        if (temp > max) {
          max = temp;
        }
        temp = 1;
      }
    }
    return max > temp ? max : temp;
  }
}
