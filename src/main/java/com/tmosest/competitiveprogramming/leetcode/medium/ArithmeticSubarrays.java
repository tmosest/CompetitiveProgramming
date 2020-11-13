package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ArithmeticSubarrays {

  List<Boolean> checkArithmeticSubarrays(int[] nums, int[] len, int[] rem) {
    List<Boolean> ans = new ArrayList<>();
    int temp = 0;
    for (int i = 0; i < len.length; i++) {
      List<Integer> store = new ArrayList<>();
      for (int j = len[temp]; j <= rem[temp]; j++) {
        store.add(nums[j]);
      }
      temp++;
      Collections.sort(store);
      int diff = Math.abs(store.get(0) - store.get(1));
      boolean flag = true;
      for (int k = 0; k < store.size() - 1; k++) {
        if (Math.abs(store.get(k) - store.get(k + 1)) != diff) {
          ans.add(false);
          flag = false;
          k = store.size();
        }
      }
      if (flag == true) {
        ans.add(true);
      }
    }
    return ans;
  }
}
