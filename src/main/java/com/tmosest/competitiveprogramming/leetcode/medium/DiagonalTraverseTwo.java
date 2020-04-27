package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DiagonalTraverseTwo {

  int[] findDiagonalOrder(List<List<Integer>> nums) {
    int num = 0;
    int index = 0;
    int maxKey = 0;

    Map<Integer, List<Integer>> map = new HashMap<>();
    for (int r = nums.size() - 1; r >= 0; --r) {
      for (int c = 0; c < nums.get(r).size(); ++c) {
        map.putIfAbsent(r + c, new ArrayList<>());
        map.get(r + c).add(nums.get(r).get(c));
        maxKey = Math.max(maxKey, r + c);
        num++;
      }
    }

    int[] ans = new int[num];
    for (int key = 0; key <= maxKey; ++key) {
      List<Integer> value = map.get(key);
      if (value == null) {
        continue;
      }
      for (int v : value) {
        ans[index++] = v;
      }
    }
    return ans;
  }
}
