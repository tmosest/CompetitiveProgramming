package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class AddToArrayFormOfInteger {
  /* Write code here. */

  /**
   * Add an integer to an an array representation of a number.
   *
   * @param arrayNum The array representation of the number.
   * @param toAdd The integer to add.
   * @return A list representation of the result.
   */
  List<Integer> addToArrayForm(int[] arrayNum, int toAdd) {
    int size = arrayNum.length;
    int cur = toAdd;
    List<Integer> ans = new ArrayList<>(size);

    int index = size;
    while (--index >= 0 || cur > 0) {
      if (index >= 0) {
        cur += arrayNum[index];
      }
      ans.add(cur % 10);
      cur /= 10;
    }

    Collections.reverse(ans);
    return ans;
  }


}
