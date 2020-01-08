package com.tmosest.competitiveprogramming.leetcode.easy;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1290. Convert Binary Number in a Linked List to Integer")
class ConvertBinaryNumberInLinkedListToIntegerTest {

  private ConvertBinaryNumberInLinkedListToInteger convertBinaryNumberInLinkedListToInteger = new ConvertBinaryNumberInLinkedListToInteger();

  @Test
  void testCase0() {
    Assertions.assertEquals(5,
        convertBinaryNumberInLinkedListToInteger.getDecimalValue(ListNode.fromString("[1,0,1]")));
  }
}
