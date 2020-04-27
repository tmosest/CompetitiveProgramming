package com.tmosest.competitiveprogramming.leetcode.easy;

class MaximumScoreAfterSplittingString {

  int maxScore(String str) {
    int max = 0;

    for (int i = 1; i < str.length(); i++) {
      max = Math.max(max, score(str.substring(0, i), str.substring(i)));
    }

    return max;
  }

  private int score(String left, String right) {
    int zero = (int) '0';
    int score = (int) left.chars().filter(letter -> letter == zero).count();

    int one = (int) '1';
    score += right.chars().filter(letter -> letter == one).count();

    return score;
  }
}
