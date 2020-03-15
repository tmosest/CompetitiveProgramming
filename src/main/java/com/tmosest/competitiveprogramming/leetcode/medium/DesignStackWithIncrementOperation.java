package com.tmosest.competitiveprogramming.leetcode.medium;

class DesignStackWithIncrementOperation {

  private Integer[] stack;
  private int index = -1;

  DesignStackWithIncrementOperation(int maxSize) {
    stack = new Integer[maxSize];
  }

  void push(int val) {
    if (index >= stack.length - 1) {
      return;
    }
    ++index;
    stack[index] = val;
  }

  int pop() {
    if (index < 0) {
      return -1;
    }
    int val = stack[index];
    stack[index] = null;
    index--;
    return val;
  }

  void increment(int end, int val) {
    if (index < 0) {
      return;
    }
    int limit = Math.min(index + 1, stack.length);
    for (int i = 0; i < Math.min(end, limit); i++) {
      stack[i] += val;
    }
  }
}
