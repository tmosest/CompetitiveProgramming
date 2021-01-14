package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;

class SwappingNodesInLinkedList {

  ListNode swapNodes(ListNode head, int diff) {
    ListNode dummy = new ListNode();
    dummy.next = head;
    ListNode preHeadK = dummy;
    for (int i = 1; i < diff; i++) {
      preHeadK = preHeadK.next;
    }
    ListNode prevTailK = dummy;
    ListNode pointer = preHeadK;
    while (pointer.next != null) {
      pointer = pointer.next;
      if (pointer.next != null) {
        prevTailK = prevTailK.next;
      }
    }
    if (prevTailK != preHeadK) {
      ListNode n1 = preHeadK.next;
      ListNode n1n = n1.next;
      ListNode n2 = prevTailK.next;
      ListNode n2n = n2.next;
      if (n1 == prevTailK) {
        preHeadK.next = n2;
        n2.next = n1;
        n1.next = n2n;
      } else if (n2 == preHeadK) {
        prevTailK.next = n1;
        n1.next = n2;
        n2.next = n1n;
      } else {
        preHeadK.next = n2;
        n2.next = n1n;
        prevTailK.next = n1;
        n1.next = n2n;
      }
    }
    return dummy.next;
  }
}
