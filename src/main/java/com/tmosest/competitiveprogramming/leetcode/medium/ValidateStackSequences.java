package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Stack;

class ValidateStackSequences {

  /**
   * Determine if this is a valid stack sequence.
   *
   * @param pushed The pushed elements.
   * @param popped The popped elements.
   * @return True if this is a correct sequence.
   */
  boolean validateStackSequences(int[] pushed, int[] popped) {
    if (pushed == null && popped == null || pushed.length == 0 && popped.length == 0) {
      return true;
    }
    if (pushed == null || popped == null || pushed.length != popped.length) {
      return false;
    }
    Stack<Integer> stack = new Stack<>();
    int one = 0;
    int two = 0;
    while (one < pushed.length && two < popped.length) {
      if (stack.isEmpty() || !stack.peek().equals(popped[two])) {
        stack.push(pushed[one]);
        one++;
      } else {
        stack.pop();
        two++;
      }
    }
    while (two < popped.length && !stack.isEmpty() && stack.peek().equals(popped[two])) {
      stack.pop();
      two++;
    }
    return (stack.isEmpty() && two == popped.length);
  }
}
