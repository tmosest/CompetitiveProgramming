package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("list")
@DisplayName("LeetCode: 143. Reorder List")
public class ReorderListTest {

  ReorderList reorderList = new ReorderList();

  private void test(ListNode root, int size) {
    reorderList.reorderList(root);
    int index = 1;
    boolean forwards = true;
    while (root != null) {
      if (forwards) {
        Assertions.assertEquals(index++, root.val);
      } else {
        Assertions.assertEquals(size--, root.val);
      }
      forwards = !forwards;
      root = root.next;
    }
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    ListNode root = new ListNode(1);
    root.next = new ListNode(2);
    root.next.next = new ListNode(3);
    root.next.next.next = new ListNode(4);
    test(root, 4);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    ListNode root = new ListNode(1);
    root.next = new ListNode(2);
    root.next.next = new ListNode(3);
    root.next.next.next = new ListNode(4);
    root.next.next.next.next = new ListNode(5);
    test(root, 5);
  }
}
