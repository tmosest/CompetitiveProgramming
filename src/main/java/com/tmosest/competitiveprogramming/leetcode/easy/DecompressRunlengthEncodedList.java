package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

class DecompressRunlengthEncodedList {

  int[] decompressRleList(int[] nums) {
    List<Integer> res = new ArrayList<>();

    for (int i = 0; i < nums.length; i += 2) {
      int count = nums[i];
      int val = nums[i + 1];
      for (int j = 0; j < count; j++) {
        res.add(val);
      }
    }

    return res.stream().mapToInt(i -> i).toArray();
  }
}
