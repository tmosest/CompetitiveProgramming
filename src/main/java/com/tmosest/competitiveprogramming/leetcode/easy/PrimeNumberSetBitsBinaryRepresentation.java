package com.tmosest.competitiveprogramming.leetcode.easy;

class PrimeNumberSetBitsBinaryRepresentation {
  /* Write code here. */

  /**
   * Count prime bits.
   *
   * @param left lower bounds.
   * @param right Upper bounds.
   * @return The number of prime bits.
   */
  public int countPrimeSetBits(int left, int right) {
    int ans = 0;
    for (int num = left; num <= right; ++num) {
      if (isSmallPrime(Integer.bitCount(num))) {
        ans++;
      }
    }
    return ans;
  }

  private boolean isSmallPrime(int num) {
    return (num == 2 || num == 3 || num == 5 || num == 7
        || num == 11 || num == 13 || num == 17 || num == 19);
  }


}
