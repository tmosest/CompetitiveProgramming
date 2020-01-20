package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1323. Maximum 69 Number")
class MaximumSixtyNineNumberTest {

  @Test
  void maximum69Number_9669_9969() {
    Assertions.assertEquals(9969, new MaximumSixtyNineNumber().maximum69Number(9669));
  }
}
