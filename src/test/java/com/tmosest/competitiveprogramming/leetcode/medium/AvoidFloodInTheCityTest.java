package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc194")
@DisplayName("LeetCode: 1488. Avoid Flood in The City")
class AvoidFloodInTheCityTest {

  private AvoidFloodInTheCity avoidFloodInTheCity = new AvoidFloodInTheCity();

  @Test
  void testCase0() {
    Assertions.assertArrayEquals(new int[] {-1,-1,-1,-1}, avoidFloodInTheCity.avoidFlood(new int[] {1,2,3,4}));
  }
}
