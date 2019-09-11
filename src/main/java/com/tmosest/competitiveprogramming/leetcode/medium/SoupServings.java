package com.tmosest.competitiveprogramming.leetcode.medium;

class SoupServings {

  double soupServings(int servings) {
    servings = servings / 25 + (servings % 25 > 0 ? 1 : 0);
    if (servings >= 500) {
      return 1.0;
    }

    double[][] memo = new double[servings + 1][servings + 1];
    for (int s = 0; s <= 2 * servings; ++s) {
      for (int i = 0; i <= servings; ++i) {
        int temp = s - i;
        if (temp < 0 || temp > servings) {
          continue;
        }
        double ans = 0.0;
        if (i == 0) {
          ans = 1.0;
        }
        if (i == 0 && temp == 0) {
          ans = 0.5;
        }
        if (i > 0 && temp > 0) {
          ans = 0.25 * (memo[toClosestPositive(i - 4)][temp] + memo[toClosestPositive(
              i - 3)][toClosestPositive(temp - 1)]
              + memo[toClosestPositive(i - 2)][toClosestPositive(temp - 2)]
              + memo[toClosestPositive(i - 1)][toClosestPositive(temp - 3)]);
        }
        memo[i][temp] = ans;

      }
    }
    return memo[servings][servings];
  }

  private int toClosestPositive(int num) {
    return Math.max(0, num);
  }
}
