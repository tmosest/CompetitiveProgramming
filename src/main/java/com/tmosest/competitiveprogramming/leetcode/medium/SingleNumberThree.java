package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SingleNumberThree {

  int[] singleNumber(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      int count = map.getOrDefault(num, 0);
      map.put(num, count + 1);
    }
    List<Integer> result = new ArrayList<>();
    for (int key : map.keySet()) {
      if (map.get(key) != 2) {
        result.add(key);
      }
    }
    int[] ans = new int[result.size()];
    for (int i = 0; i < ans.length; i++) {
      ans[i] = result.get(i);
    }
    return ans;
  }
}
