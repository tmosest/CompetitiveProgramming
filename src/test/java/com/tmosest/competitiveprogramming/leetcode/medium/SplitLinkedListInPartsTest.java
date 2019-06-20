package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 725. Split Linked List in Parts")
class SplitLinkedListInPartsTest {

  private SplitLinkedListInParts splitLinkedListInParts = new SplitLinkedListInParts();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    ListNode root = new ListNode(1);
    root.next = new ListNode(2);
    root.next = new ListNode(3);

    ListNode[] actual = splitLinkedListInParts.splitListToParts(root, 3);
    Assertions.assertEquals(3, actual.length);
  }
}
