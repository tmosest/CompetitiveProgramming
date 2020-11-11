package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("number")
@Tag("wc214")
@DisplayName("LeetCode: 1646. Get Maximum in Generated Array")
class GetMaximumInGeneratedArrayTest {

  @Test
  void test1() {
    Assertions.assertEquals(3, new GetMaximumInGeneratedArray().getMaximumGenerated(7));
  }
}
