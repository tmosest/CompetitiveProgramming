package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

class CreateTargetArrayInTheGivenOrder {

  int[] createTargetArray(int[] nums, int[] index) {
    List<Integer> sb = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      sb.add(index[i], nums[i]);
    }
    return sb.stream().mapToInt(Integer::valueOf).toArray();
  }
}
