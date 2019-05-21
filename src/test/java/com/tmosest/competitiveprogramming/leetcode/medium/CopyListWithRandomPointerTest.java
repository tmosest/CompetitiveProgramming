package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("list")
@Tag("medium")
@DisplayName("LeetCode: 138. Copy List with Random Pointer")
class CopyListWithRandomPointerTest {
	/* Write code here. */

  CopyListWithRandomPointer copyListWithRandomPointer = new CopyListWithRandomPointer();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    CopyListWithRandomPointer.Node head = new CopyListWithRandomPointer.Node();
    head.val = 1;
    CopyListWithRandomPointer.Node next = new CopyListWithRandomPointer.Node();
    next.val = 2;
    head.next = next;
    head.random = next;
    next.random = next;

    CopyListWithRandomPointer.Node newHead = copyListWithRandomPointer.copyRandomList(head);

    while (head != null) {
      Assertions.assertNotEquals(head, newHead);
      Assertions.assertEquals(head.val, newHead.val);
      Assertions.assertNotEquals(head.random, newHead.random);
      if (head.random != null) {
        Assertions.assertEquals(head.random.val, newHead.random.val);
      } else {
        Assertions.assertNull(newHead.random);
      }
      newHead = newHead.next;
      head = head.next;
    }
  }


}
