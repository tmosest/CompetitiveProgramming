package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc218")
@DisplayName("LeetCode: 1680. Concatenation of Consecutive Binary Numbers")
class ConcatenationOfConsecutiveBinaryNumbersTest {

  private ConcatenationOfConsecutiveBinaryNumbers concatenationOfConsecutiveBinaryNumbers =
      new ConcatenationOfConsecutiveBinaryNumbers();

  @Test
  void test1() {
    Assertions.assertEquals(505379714, concatenationOfConsecutiveBinaryNumbers.concatenatedBinary(
        12
    ));
  }
}
