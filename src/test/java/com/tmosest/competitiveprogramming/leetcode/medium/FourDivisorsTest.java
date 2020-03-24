package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("dynamic")
@Tag("wc181")
@DisplayName("LeetCode: 1390. Four Divisors")
class FourDivisorsTest {

  private FourDivisors fourDivisors = new FourDivisors();

  @Test
  void testCase0() {
    Assertions.assertEquals(32, fourDivisors.sumFourDivisors(
        new int[]{7, 4, 21}
    ));
  }
}
