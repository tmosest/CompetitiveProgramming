package com.tmosest.competitiveprogramming.leetcode.easy;

class ConfusingNumber {

  /**
   * Determine if a number would be confusing if flipped 180 degrees.
   *
   * @param num The number.
   * @return True if confusing.
   */
  public boolean confusingNumber(int num) {
    int flipped = 0;
    int temp = num;
    while (temp > 0) {
      flipped *= 10;
      int digit = temp % 10;
      switch (digit) {
        case 0:
        case 1:
        case 8:
          flipped += digit;
          break;
        case 6:
          flipped += 9;
          break;
        case 9:
          flipped += 6;
          break;
        default:
          return false;
      }
      temp /= 10;
    }
    return flipped != num;
  }
}
