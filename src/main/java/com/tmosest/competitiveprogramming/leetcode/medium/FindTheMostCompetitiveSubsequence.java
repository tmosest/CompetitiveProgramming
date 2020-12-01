package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Stack;

class FindTheMostCompetitiveSubsequence {

  int[] mostCompetitive(int[] nums, int size) {
    Stack<Integer> stack = new Stack<>();
    int[] result = new int[size];
    for (int i = 0; i < nums.length; i++) {
      while (!stack.empty() && nums[i] < nums[stack.peek()]
          && nums.length - i + stack.size() > size) {
        stack.pop();
      }
      if (stack.size() < size) {
        stack.push(i);
      }
    }
    for (int i = size - 1; i >= 0; i--) {
      result[i] = nums[stack.pop()];
    }
    return result;
  }
}
