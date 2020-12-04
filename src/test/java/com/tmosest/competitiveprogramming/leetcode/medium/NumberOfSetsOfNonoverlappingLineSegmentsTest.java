package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("interval")
@Tag("bwc37")
@DisplayName("LeetCode: 1621. Number of Sets of K Non-Overlapping Line Segments")
class NumberOfSetsOfNonoverlappingLineSegmentsTest {

  private NumberOfSetsOfNonoverlappingLineSegments numberOfSetsOfNonoverlappingLineSegments =
      new NumberOfSetsOfNonoverlappingLineSegments();

  @Test
  void test1() {
    Assertions.assertEquals(5, numberOfSetsOfNonoverlappingLineSegments.numberOfSets(
        4, 2
    ));
  }
}
