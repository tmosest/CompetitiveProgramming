package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1201. Ugly Number III")
class UglyNumberThreeTest {

  private UglyNumberThree uglyNumberThree =
      new UglyNumberThree();

  @Test
  void testCase0() {
    Assertions.assertEquals(4, uglyNumberThree.nthUglyNumber(3, 2, 3, 5));
  }
}
