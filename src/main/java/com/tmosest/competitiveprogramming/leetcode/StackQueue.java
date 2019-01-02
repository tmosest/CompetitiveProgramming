package com.tmosest.competitiveprogramming.leetcode;

import java.util.Stack;

public class StackQueue {
  Stack<Integer> stack;
  Stack<Integer> temp;

  /** Initialize your data structure here. */
  public StackQueue() {
    stack = new Stack<>();
    temp = new Stack<>();
  }

  /** Push element x to the back of queue. */
  public void push(int val) {
    while (!stack.empty()) {
      temp.push(stack.pop());
    }
    stack.push(val);
    while (!temp.empty()) {
      stack.push(temp.pop());
    }
  }

  /** Removes the element from in front of queue and returns that element. */
  public int pop() {
    return stack.pop();
  }

  /** Get the front element. */
  public int peek() {
    return stack.peek();
  }

  /** Returns whether the queue is empty. */
  public boolean empty() {
    return stack.empty();
  }
}
