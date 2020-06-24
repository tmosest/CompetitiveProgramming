package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("number")
@DisplayName("LeetCode: 1486. XOR Operation in an Array")
class XorOperationInAnArrayTest {

  private XorOperationInAnArray xorOperationInAnArray = new XorOperationInAnArray();

  @Test
  void testCase0() {
    Assertions.assertEquals(8, xorOperationInAnArray.xorOperation(5, 0));
  }
}
