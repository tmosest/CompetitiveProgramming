package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc200")
@DisplayName("LeetCode: 1534. Count Good Triplets")
class CountGoodTripletsTest {

  private CountGoodTriplets countGoodTriplets = new CountGoodTriplets();

  @Test
  void testCase0() {
    Assertions.assertEquals(4, countGoodTriplets.countGoodTriplets(
        new int[] {3,0,1,1,9,7},
        7, 2, 3
    ));
  }
}
