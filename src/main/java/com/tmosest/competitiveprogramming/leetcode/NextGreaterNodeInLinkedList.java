package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import java.util.List;

public class NextGreaterNodeInLinkedList {

  /**
   * Return the next greatest value for each node.
   * @param head The head node.
   * @return An array where index i is the next largest value of node i.
   */
  public int[] nextLargerNodes(ListNode head) {
    List<Integer> list = new ArrayList<>();
    while (head != null) {
      list.add(head.val);
      head = head.next;
    }
    int[] result = new int[list.size()];
    for (int i = 0; i < result.length - 1; i++) {
      int curr = list.get(i);
      for (int j = i + 1; j < result.length; j++) {
        int next = list.get(j);
        if (next > curr) {
          result[i] = next;
          break;
        }
      }
    }
    return result;
  }
}
