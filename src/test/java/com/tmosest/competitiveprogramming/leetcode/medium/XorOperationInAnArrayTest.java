package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc194")
@DisplayName("LeetCode: 1486. XOR Operation in an Array")
class XorOperationInAnArrayTest {

  private XorOperationInAnArray xorOperationInAnArray = new XorOperationInAnArray();

  @Test
  void testCase0() {
    Assertions.assertEquals(8, xorOperationInAnArray.xorOperation(5, 0));
  }

  @Test
  void testCase1() {
    Assertions.assertEquals(8, xorOperationInAnArray.xorOperation(4, 3));
  }

  @Test
  void testCase2() {
    Assertions.assertEquals(7, xorOperationInAnArray.xorOperation(1, 7));
  }

  @Test
  void testCase3() {
    Assertions.assertEquals(2, xorOperationInAnArray.xorOperation(10, 5));
  }
}
