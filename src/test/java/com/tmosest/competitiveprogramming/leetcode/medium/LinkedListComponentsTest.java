package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 817. Linked List Components")
class LinkedListComponentsTest {

  private LinkedListComponents linkedListComponents = new LinkedListComponents();

  private void test(String data, int[] components, int expected) {
    ListNode head = ListNode.fromString(data);
    Assertions.assertEquals(expected, linkedListComponents.numComponents(head, components));
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] components = {
        0, 1, 3
    };
    test("[0,1,2,3]", components, 2);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] components = {
        0, 3, 1, 4
    };
    test("[0,1,2,3,4]", components, 2);
  }
}
