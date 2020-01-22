package com.tmosest.competitiveprogramming.leetcode.easy;

class ConvertIntegerToTheSumOfTwoNozeroIntegers {

  int[] getNoZeroIntegers(int num) {
    int more = 1;
    while (Integer.toString(num - more).contains("0") || Integer.toString(more).contains("0")) {
      more++;
    }
    return new int[]{more, num - more};
  }
}
