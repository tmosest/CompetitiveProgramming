package com.tmosest.competitiveprogramming.leetcode.easy;

class MaximumSixtyNineNumber {

  int maximum69Number(int num) {
    char[] vals = String.valueOf(num).toCharArray();

    for (int i = 0; i < vals.length; i++) {
      if (vals[i] == '6') {
        vals[i] = '9';
        break;
      }
    }

    return Integer.valueOf(String.valueOf(vals));
  }
}
