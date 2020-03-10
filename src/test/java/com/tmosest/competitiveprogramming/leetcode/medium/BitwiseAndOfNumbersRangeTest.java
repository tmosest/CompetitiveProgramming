package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 201. Bitwise AND of Numbers Range")
class BitwiseAndOfNumbersRangeTest {

  private BitwiseAndOfNumbersRange bitwiseAndOfNumbersRange =
      new BitwiseAndOfNumbersRange();

  @Test
  void testCase0() {
    Assertions.assertEquals(4, bitwiseAndOfNumbersRange.rangeBitwiseAnd(5,7));
  }
}
