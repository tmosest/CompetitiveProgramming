package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("list")
@DisplayName("LeetCode: 1018. Binary Prefix Divisible By 5")
public class NextGreaterNodeInLinkedListTest {

  NextGreaterNodeInLinkedList nextGreaterNodeInLinkedList = new NextGreaterNodeInLinkedList();

  private void test(int[] input, int[] output) {
    ListNode head = new ListNode(input[0]);
    ListNode runner = head;
    for (int i = 1; i < input.length; i++) {
      runner.next = new ListNode(input[i]);
      runner = runner.next;
    }
    Assertions.assertArrayEquals(output, nextGreaterNodeInLinkedList.nextLargerNodes(head));
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        2,1,5
    };
    int[] output = {
        5,5,0
    };
    test(input, output);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] input = {
        2,7,4,3,5
    };
    int[] output = {
        7,0,5,5,0
    };
    test(input, output);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase2() {
    int[] input = {
        1,7,5,1,9,2,5,1
    };
    int[] output = {
        7,9,9,9,0,5,0,0
    };
    test(input, output);
  }
}
