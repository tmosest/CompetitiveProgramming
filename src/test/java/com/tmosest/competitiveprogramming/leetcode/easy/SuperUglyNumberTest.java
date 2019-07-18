package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 313. Super Ugly Number")
class SuperUglyNumberTest {

  private SuperUglyNumber superUglyNumber = new SuperUglyNumber();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] primes = {
        2, 7, 13, 19
    };
    Assertions.assertEquals(32, superUglyNumber.nthSuperUglyNumber(12, primes));
  }
}
