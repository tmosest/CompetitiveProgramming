package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

class CheckIfAndItsDoubleExist {

  boolean checkIfExist(int[] arr) {
    Set<Integer> set = new HashSet<>();
    for (int x : arr) {
      if (!set.contains(x)) {
        set.add(x + x);
        if (x % 2 == 0) {
          set.add(x / 2);
        }
      } else {
        return true;
      }
    }
    return false;
  }
}
