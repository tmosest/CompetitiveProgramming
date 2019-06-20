package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 86. Partition List")
class PartitionListTest {

  private PartitionList partitionList = new PartitionList();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(4);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(3);
    head.next.next.next.next = new ListNode(2);
    head.next.next.next.next.next = new ListNode(2);

    boolean flipped = false;

    head = partitionList.partition(head, 3);

    while (head != null) {
      int val = head.val;
      if (flipped && val < 3) {
        Assertions.fail("Didn't partition correctly");
      }
      if (val >= 3) {
        flipped = true;
      }
      head = head.next;
    }

    Assertions.assertTrue(true);
  }
}
