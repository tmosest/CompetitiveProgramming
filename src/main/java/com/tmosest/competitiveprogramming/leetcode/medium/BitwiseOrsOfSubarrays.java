package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

class BitwiseOrsOfSubarrays {

  int subarrayBitwiseORs(int[] arr) {
    Set<Integer> ans = new HashSet<>();
    Set<Integer> cur = new HashSet<>();
    cur.add(0);

    for (int x : arr) {
      Set<Integer> cur2 = new HashSet<>();
      for (int y : cur) {
        cur2.add(x | y);
      }
      cur2.add(x);
      cur = cur2;
      ans.addAll(cur);
    }

    return ans.size();
  }
}
