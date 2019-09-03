package com.tmosest.competitiveprogramming.leetcode.medium;

class DietPlanPerformance {

  /**
   * Determine score for diet.
   *
   * @param calories The calories consumed on the ith day.
   * @param days The running days to total.
   * @param lower The lower limit.
   * @param upper The upper limit.
   * @return The score.
   */
  int dietPlanPerformance(int[] calories, int days, int lower, int upper) {
    int len = calories.length;
    int result = 0;
    int sum = 0;
    for (int i = 0; i < len; i++) {
      sum += calories[i];
      if (i >= days - 1) {
        if (sum < lower) {
          result--;
        } else if (sum > upper) {
          result++;
        }
        sum -= calories[i - days + 1];
      }
    }
    return result;
  }
}
