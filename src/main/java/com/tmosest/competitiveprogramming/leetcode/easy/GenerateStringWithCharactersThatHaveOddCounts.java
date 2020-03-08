package com.tmosest.competitiveprogramming.leetcode.easy;

class GenerateStringWithCharactersThatHaveOddCounts {

  String generateTheString(int num) {
    StringBuilder sb = new StringBuilder();

    boolean even = num % 2 == 0;

    if (even) {
      sb.append('b');
    }

    for (int i = 0; i < (even ? num - 1 : num); i++) {
      sb.append('a');
    }

    return sb.toString();
  }
}
