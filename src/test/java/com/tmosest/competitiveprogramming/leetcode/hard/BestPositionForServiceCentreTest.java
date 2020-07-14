package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("matrix")
@Tag("wc197")
@DisplayName("LeetCode: 1515. Best Position for a Service Centre")
class BestPositionForServiceCentreTest {

  private BestPositionForServiceCentre bestPositionForServiceCentre = new BestPositionForServiceCentre();

  @Test
  void testCase0() {
    double res = bestPositionForServiceCentre.getMinDistSum(new int[][] {{0,1}, {1,0}, {1,2}, {2,1}});
    Assertions.assertTrue(3.999 <= res && res <= 4.0001);
  }
}
