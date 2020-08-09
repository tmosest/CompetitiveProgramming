package com.tmosest.competitiveprogramming.leetcode.medium;

class MinimumFlipsToMakeOrEqualTo {

  int minFlips(int one, int two, int sum) {
    int answer = 0;

    while (sum != 0) {
      int bit = sum ^ (sum & (sum - 1));
      sum &= sum - 1;

      if (((one & bit) | (two & bit)) != bit) {
        answer++;
      }

      one &= ~bit;
      two &= ~bit;
    }

    return answer + bitCount(one) + bitCount(two);
  }

  private int bitCount(int num) {
    int answer = 0;

    while (num != 0) {
      answer++;
      num &= num - 1;
    }

    return answer;
  }
}
