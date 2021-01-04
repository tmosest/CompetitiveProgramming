package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class MinimumOperationsToMakeSubsequence {

  int minOperations(int[] target, int[] arr) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < target.length; ++i) {
      map.put(target[i], i);
    }

    ArrayList<Integer> stack = new ArrayList<>();
    for (int a : arr) {
      if (!map.containsKey(a)) {
        continue;
      }
      if (stack.size() == 0 || map.get(a) > stack.get(stack.size() - 1)) {
        stack.add(map.get(a));
        continue;
      }
      int left = 0;
      int right = stack.size() - 1;
      int mid;
      while (left < right) {
        mid = (left + right) / 2;
        if (stack.get(mid) < map.get(a)) {
          left = mid + 1;
        } else {
          right = mid;
        }
      }
      stack.set(left, map.get(a));
    }
    return target.length - stack.size();
  }


}
