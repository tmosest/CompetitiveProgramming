package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("dynamic")
@Tag("binaryTree")
@DisplayName("LeetCode: 787. Cheapest Flights Within K Stops")
class CheapestFlightsWithinStopsTest {

  private CheapestFlightsWithinStops cheapestFlightsWithinStops =
      new CheapestFlightsWithinStops();

  @Test
  void testCase0() {
    Assertions.assertEquals(
        200,
        cheapestFlightsWithinStops.findCheapestPrice(
            3,
            new int[][]{
                {0, 1, 100}, {1, 2, 100}, {0, 2, 500}
            }, 0, 2, 1
        ));
  }
}
