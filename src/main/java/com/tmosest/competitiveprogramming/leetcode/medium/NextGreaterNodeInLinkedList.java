package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;

import java.util.LinkedList;

class NextGreaterNodeInLinkedList {
  /* Write code here. */

  /**
   * Return the next greatest value for each node.
   *
   * @param head The head node.
   * @return An array where index i is the next largest value of node i.
   */
  public int[] nextLargerNodes(ListNode head) {
    LinkedList<Integer> nodes = new LinkedList<>();
    for (; head != null; head = head.next) {
      nodes.push(head.val);
    }

    LinkedList<Integer> stack = new LinkedList<>();
    int[] ans = new int[nodes.size()];

    for (int i = nodes.size() - 1; !nodes.isEmpty(); i--) {
      while (!stack.isEmpty() && nodes.peek() >= stack.peek()) {
        stack.pop();
      }
      ans[i] = stack.isEmpty() ? 0 : stack.peek();
      stack.push(nodes.pop());
    }

    return ans;
  }


}
