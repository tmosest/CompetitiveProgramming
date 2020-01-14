package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;

class FindNumbersWithEvenNumberOfDigits {

  int findNumbers(int[] nums) {
    return (int) Arrays
        .stream(nums).filter(
            (num) -> String.valueOf(num).length() % 2 == 0
        ).count();
  }
}
