package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 82. Remove Duplicates from Sorted List II")
class RemoveDuplicatesFromSortedListTwoTest {

  private RemoveDuplicatesFromSortedListTwo removeDuplicatesFromSortedListTwo = new RemoveDuplicatesFromSortedListTwo();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    ListNode input = ListNode.fromString("[1,1,1,2,3]");
    ListNode expected = ListNode.fromString("[2,3]");
    ListNode actual = removeDuplicatesFromSortedListTwo.deleteDuplicates(input);

    while (expected != null) {
      Assertions.assertEquals(expected.val, actual.val);
      expected = expected.next;
      actual = actual.next;
    }
    Assertions.assertEquals(expected, actual);
  }
}
