package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.PriorityQueue;

class ThirdMaximumNumber {
  /* Write code here. */

  /**
   * Find the third max number.
   *
   * @param nums Array of integers.
   * @return The third max number.
   */
  public int thirdMax(int[] nums) {
    int res = -1;
    int maxSize = 3;
    if (nums.length > 0) {
      res = nums[0];
      PriorityQueue<Integer> que = new PriorityQueue<>();
      for (int num : nums) {
        if (que.size() < maxSize && !que.contains(num)) {
          que.add(num);
        } else if (que.peek() < num && !que.contains(num)) {
          que.poll();
          que.add(num);
        }
      }
      if (que.size() < maxSize) {
        while (que.size() > 1) {
          que.poll();
        }
      }
      if (que.size() > 0) {
        res = que.poll();
      }
    }
    return res;
  }


}
