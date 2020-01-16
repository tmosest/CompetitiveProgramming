package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1184. Distance Between Bus Stops")
class DistanceBetweenBusStopsTest {

  @Test
  void testCase0() {
    int[] distances = {1,2,3,4};
    Assertions.assertEquals(1, new DistanceBetweenBusStops().distanceBetweenBusStops(distances, 0, 1));
  }
}
