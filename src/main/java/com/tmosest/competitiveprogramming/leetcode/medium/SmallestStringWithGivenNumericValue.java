package com.tmosest.competitiveprogramming.leetcode.medium;

class SmallestStringWithGivenNumericValue {

  String getSmallestString(int length, int sum) {
    StringBuilder stringBuilder = new StringBuilder();

    // To make the string lexicographically smallest we construct it in reverse.
    // The goal is have the largest numbers at the end.
    for (int i = 0; i < length; i++) {
      int diff = sum - length;
      int maxVal = diff > 25 ? 25 : diff;
      stringBuilder.insert(0, (char) ('a' + maxVal));
      sum -= maxVal;
    }

    return stringBuilder.toString();
  }
}
