package com.tmosest.competitiveprogramming.leetcode.medium;

class NumberOfWaysToSplitString {

  // Math combination problem
  int numWays(String str) {

    long len = str.length();
    long mod = (long) Math.pow(10, 9) + 7;

    // Count '1's
    long cnt = 0;

    for (char c : str.toCharArray()) {
      if (c == '1') {
        cnt++;
      }
    }

    // The number of ways of selecting 2 separators in n-1 gaps
    if (cnt == 0) {
      return (int) ((len - 1) * (len - 2) / 2 % mod); // Combination C(n-1, 2)
    }

    if (cnt % 3 != 0) {
      return 0;
    }

    // x1: The number of ways of selecting 1 separators between the first part and the second part
    // x2: The number of ways of selecting 1 separators between the second part and the third part
    // result = x1 * x2
    // firstRight: The lowest right position of the first part
    // secondLeft: The highest left position of the second part
    // secondRight: The lowest right position of the second part
    // thirdLeft: The highest left position of the third part
    long count = cnt / 3;
    long firstRight = 0;
    long secondLeft = 0;
    long secondRight = 0;
    long thirdLeft = 0;
    long index = 0;

    cnt = 0;

    for (char c : str.toCharArray()) {
      if (c == '1') {
        cnt++;

        if (cnt == count) {
          firstRight = index;
        } else if (cnt == count + 1) {
          secondLeft = index;
          secondRight = secondLeft;
        } else if (cnt == count * 2) {
          secondRight = index;
        } else if (cnt == count * 2 + 1) {
          thirdLeft = index;
          break;
        }
      }

      index++;
    }

    return (int) ((secondLeft - firstRight) * (thirdLeft - secondRight) % mod);
  }
}
