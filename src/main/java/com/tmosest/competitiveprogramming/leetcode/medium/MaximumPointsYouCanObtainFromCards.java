package com.tmosest.competitiveprogramming.leetcode.medium;

class MaximumPointsYouCanObtainFromCards {

  int maxScore(int[] cardPoints, int size) {
    int max = 0;
    int sum = 0;
    for (int i = 0; i < size; i++) {
      sum += cardPoints[i];
    }

    max = sum;
    for (int i = 1; i <= size; i++) {
      sum = sum + cardPoints[cardPoints.length - i] - cardPoints[size - i];
      max = Math.max(max, sum);
    }

    return max;
  }
}
