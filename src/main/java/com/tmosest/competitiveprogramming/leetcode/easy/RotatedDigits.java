package com.tmosest.competitiveprogramming.leetcode.easy;

class RotatedDigits {
  /* Write code here. */

  /**
   * The number of digits between 1 and number that cannot be flipped...
   *
   * @param number The top of the range.
   * @return See description.
   */
  public int rotatedDigits(int number) {
    // Count how many n in [1, N] are good.
    int ans = 0;
    for (int n = 1; n <= number; ++n) {
      if (good(n, false)) {
        ans++;
      }
    }
    return ans;
  }

  // Return true if n is good.
  // The flag is true iff we have an occurrence of 2, 5, 6, 9.
  private boolean good(int num, boolean flag) {
    if (num == 0) {
      return flag;
    }

    int digit = num % 10;
    if (digit == 3 || digit == 4 || digit == 7) {
      return false;
    }
    if (digit == 0 || digit == 1 || digit == 8) {
      return good(num / 10, flag);
    }
    return good(num / 10, true);
  }


}
