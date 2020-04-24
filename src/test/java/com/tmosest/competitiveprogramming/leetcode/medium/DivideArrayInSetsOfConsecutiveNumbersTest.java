package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@DisplayName("LeetCode: 1296. Divide Array in Sets of K Consecutive Numbers")
class DivideArrayInSetsOfConsecutiveNumbersTest {

  private DivideArrayInSetsOfConsecutiveNumbers divideArrayInSetsOfConsecutiveNumbers =
      new DivideArrayInSetsOfConsecutiveNumbers();

  @Test
  void testCase0() {
    Assertions.assertTrue(divideArrayInSetsOfConsecutiveNumbers.isPossibleDivide(
        new int[] {1, 2, 3, 3, 4, 4, 5, 6},
        4
    ));
  }
}
