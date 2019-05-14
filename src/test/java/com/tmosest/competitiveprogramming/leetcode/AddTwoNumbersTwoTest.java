package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("string")
@DisplayName("LeetCode: 445. Add Two Numbers II")
public class AddTwoNumbersTwoTest {

  AddTwoNumbersTwo addTwoNumbersTwo = new AddTwoNumbersTwo();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    ListNode listOne = new ListNode(7);
    listOne.next = new ListNode(2);
    listOne.next.next = new ListNode(4);
    listOne.next.next.next = new ListNode(3);

    ListNode listTwo = new ListNode(5);
    listTwo.next = new ListNode(6);
    listTwo.next.next = new ListNode(4);

    ListNode expected = new ListNode(7);
    expected.next = new ListNode(8);
    expected.next.next = new ListNode(0);
    expected.next.next.next = new ListNode(7);

    ListNode actual = addTwoNumbersTwo.addTwoNumbers(listOne, listTwo);

    while (actual != null && expected != null) {
      Assertions.assertEquals(actual.val, expected.val);
      actual = actual.next;
      expected = expected.next;
    }

    Assertions.assertEquals(expected, actual);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    ListNode listOne = new ListNode(5);
    ListNode expected = new ListNode(1);
    expected.next = new ListNode(0);
    ListNode actual = addTwoNumbersTwo.addTwoNumbers(listOne, listOne);

    while (actual != null && expected != null) {
      Assertions.assertEquals(actual.val, expected.val);
      actual = actual.next;
      expected = expected.next;
    }

    Assertions.assertEquals(expected, actual);
  }
}
