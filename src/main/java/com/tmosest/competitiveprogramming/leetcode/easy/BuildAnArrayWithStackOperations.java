package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

class BuildAnArrayWithStackOperations {

  List<String> buildArray(int[] target, int num) {
    List<String> res = new ArrayList<>();
    int one = 1;
    int two = 0;
    while (one != num + 1 && two < target.length) {
      if (one == target[two]) {
        res.add("Push");
        two++;
        one++;
      } else {
        res.add("Push");
        res.add("Pop");
        one++;
      }
    }
    return res;
  }
}
