package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Stack;

class SumOfSubarrayMinimums {

  int sumSubarrayMins(int[] arr) {
    int[] dp = new int[arr.length];
    Stack<Integer> stack = new Stack<>();
    final int con = 1000000007;
    int result = 0;

    for (int i = 0; i < arr.length; i++) {
      while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
        stack.pop();
      }
      if (stack.isEmpty()) {
        dp[i] = (arr[i] * (i + 1)) % con;
        result = (result + dp[i]) % con;
      } else {
        dp[i] = ((arr[i] * (i - stack.peek())) % con + dp[stack.peek()]) % con;
        result = (result + dp[i]) % con;
      }
      stack.push(i);
    }
    return result;
  }
}
