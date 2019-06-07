package com.tmosest.competitiveprogramming.leetcode.medium;

class CountNumbersWithUniqueDigits {

  /**
   * Sum all numbers from 1 to num. That are all unique digits.
   *
   * @param numDigits The num to sum to.
   * @return The sum of numbers with unique digits.
   */
  int countNumbersWithUniqueDigits(int numDigits) {
    if (numDigits == 0) {
      return 1;
    }

    int uniqueDigits = 9;
    int res = 10;
    int digitNumber = 1;

    while (digitNumber < numDigits) {
      uniqueDigits = uniqueDigits * (10 - digitNumber);
      res += uniqueDigits;
      digitNumber++;
    }
    return res;
  }
}
