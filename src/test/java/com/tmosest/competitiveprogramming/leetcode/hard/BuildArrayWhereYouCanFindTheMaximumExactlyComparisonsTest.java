package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("depthFirstSearch")
@Tag("wc185")
@DisplayName("LeetCode: 1420. Build Array Where You Can Find The Maximum Exactly K Comparisons")
class BuildArrayWhereYouCanFindTheMaximumExactlyComparisonsTest {

  private BuildArrayWhereYouCanFindTheMaximumExactlyComparisons buildArrayWhereYouCanFindTheMaximumExactlyComparisons
      = new BuildArrayWhereYouCanFindTheMaximumExactlyComparisons();

  @Test
  void testCase0() {
    Assertions.assertEquals(6, buildArrayWhereYouCanFindTheMaximumExactlyComparisons.numOfArrays(2, 3, 1));
  }
}
