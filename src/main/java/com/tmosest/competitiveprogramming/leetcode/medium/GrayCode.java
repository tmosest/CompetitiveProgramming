package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

class GrayCode {

  /**
   * Return a valid grey code sequence for a number of bits.
   *
   * @param numBits The number of bits.
   * @return A valid grey code sequence for the number of bits.
   */
  List<Integer> grayCode(int numBits) {
    int len = (int) Math.pow(2, numBits);
    List<Integer> ans = new ArrayList<>(len);
    for (int i = 0; i < len; i++) {
      ans.add(i ^ (i >> 1));
    }
    return ans;
  }
}
