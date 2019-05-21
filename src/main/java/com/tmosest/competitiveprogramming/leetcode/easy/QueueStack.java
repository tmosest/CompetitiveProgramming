package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

class QueueStack {

  /* Write code here. */
  private Queue<Integer> queue;
  private Queue<Integer> temp;

  /**
   * Initialize your data structure here.
   */
  public QueueStack() {
    queue = new LinkedList<>();
    temp = new LinkedList<>();
  }

  /**
   * Push element x onto stack.
   */
  public void push(int val) {
    while (!queue.isEmpty()) {
      int popped = queue.poll();
      temp.add(popped);
    }
    queue.add(val);
    while (!temp.isEmpty()) {
      int popped = temp.poll();
      queue.add(popped);
    }
  }

  /**
   * Removes the element on top of the stack and returns that element.
   */
  public int pop() {
    return queue.poll();
  }

  /**
   * Get the top element.
   */
  public int top() {
    return queue.peek();
  }

  /**
   * Returns whether the stack is empty.
   */
  public boolean empty() {
    return queue.size() == 0;
  }


}
