package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;

import java.util.Stack;

public class AddTwoNumbersTwo {

  /**
   * Add two number that are lists.
   * @param listOne The first number.
   * @param listTwo The second number.
   * @return The sum as a list.
   */
  public ListNode addTwoNumbers(ListNode listOne, ListNode listTwo) {
    Stack<Integer> listOneNumbers = listToStack(listOne);
    Stack<Integer> listTwoNumbers = listToStack(listTwo);
    ListNode head = null;
    ListNode prev = null;
    boolean carry = false;
    while (!listOneNumbers.isEmpty() || !listTwoNumbers.isEmpty() || carry) {
      int sum = 0;
      if (!listOneNumbers.isEmpty()) {
        sum += listOneNumbers.pop();
      }
      if (!listTwoNumbers.isEmpty()) {
        sum += listTwoNumbers.pop();
      }
      if (carry) {
        ++sum;
        carry = false;
      }
      if (sum > 9) {
        sum -= 10;
        carry = true;
      }
      ListNode node = new ListNode(sum);
      node.next = prev;
      prev = node;
      head = node;
    }
    return head;
  }

  private Stack<Integer> listToStack(ListNode node) {
    Stack<Integer> stack = new Stack<>();
    while (node != null) {
      stack.push(node.val);
      node = node.next;
    }
    return stack;
  }
}
