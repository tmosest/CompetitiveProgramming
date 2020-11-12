package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("matrix")
@Tag("bwc38")
@DisplayName("LeetCode: 1637. Widest Vertical Area Between Two Points Containing No Points")
class WidestVerticalAreaBetweenTwoPointsContainingNoPointsTest {

  @Test
  void test1() {
    Assertions.assertEquals(1, new WidestVerticalAreaBetweenTwoPointsContainingNoPoints().maxWidthOfVerticalArea(
        new int[][] {{8,7}, {9,9}, {7,4}, {9,7}}
    ));
  }
}
