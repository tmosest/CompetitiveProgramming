package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.HashMap;
import java.util.Stack;

class NextGreaterElement {
  /* Write code here. */

  /**
   * Determines the next greater element.
   *
   * @param findNums Array to look at.
   * @param nums Array to find next greater in.
   * @return Array of next greater numbers.
   */
  public int[] nextGreaterElement(int[] findNums, int[] nums) {
    Stack<Integer> stack = new Stack<>();
    HashMap<Integer, Integer> map = new HashMap<>();
    int[] res = new int[findNums.length];
    for (int i = 0; i < nums.length; i++) {
      while (!stack.empty() && nums[i] > stack.peek()) {
        map.put(stack.pop(), nums[i]);
      }
      stack.push(nums[i]);
    }
    while (!stack.empty()) {
      map.put(stack.pop(), -1);
    }
    for (int i = 0; i < findNums.length; i++) {
      res[i] = map.get(findNums[i]);
    }
    return res;
  }


}
