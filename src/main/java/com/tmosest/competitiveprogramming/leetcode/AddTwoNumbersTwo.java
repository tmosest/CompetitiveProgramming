package com.tmosest.competitiveprogramming.leetcode;

import java.math.BigInteger;
import java.util.Stack;

public class AddTwoNumbersTwo {

  /**
   * Add two number that are lists.
   * @param listOne The first number.
   * @param listTwo The second number.
   * @return The sum as a list.
   */
  public ListNode addTwoNumbers(ListNode listOne, ListNode listTwo) {
    BigInteger numOne = listToBigInt(listOne);
    BigInteger numTwo = listToBigInt(listTwo);
    return listFromBigInt(numOne.add(numTwo));
  }

  private BigInteger listToBigInt(ListNode listNode) {
    BigInteger sum = BigInteger.ZERO;
    while (listNode != null) {
      sum = sum.multiply(BigInteger.TEN);
      sum = sum.add(BigInteger.valueOf(listNode.val));
      listNode = listNode.next;
    }
    return sum;
  }

  private ListNode listFromBigInt(BigInteger num) {
    Stack<ListNode> stack = new Stack<>();
    while (!num.equals(BigInteger.ZERO)) {
      int val = Integer.valueOf(num.mod(BigInteger.TEN).toString());
      stack.push(new ListNode(val));
      num = num.divide(BigInteger.TEN);
    }
    ListNode head = null;
    ListNode runner = null;
    while (!stack.empty()) {
      ListNode node = stack.pop();
      if (head == null && runner == null) {
        head = node;
        runner = node;
      } else {
        runner.next = node;
        runner = runner.next;
      }
    }
    return head;
  }
}
