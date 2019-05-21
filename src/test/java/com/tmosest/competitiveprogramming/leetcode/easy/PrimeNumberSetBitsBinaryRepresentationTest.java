package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 762. Prime Number of Set Bits in Binary Representation")
class PrimeNumberSetBitsBinaryRepresentationTest {
	/* Write code here. */

  PrimeNumberSetBitsBinaryRepresentation primeNumberSetBitsBinaryRepresentation = new PrimeNumberSetBitsBinaryRepresentation();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(4, primeNumberSetBitsBinaryRepresentation.countPrimeSetBits(6, 10));
  }


}
