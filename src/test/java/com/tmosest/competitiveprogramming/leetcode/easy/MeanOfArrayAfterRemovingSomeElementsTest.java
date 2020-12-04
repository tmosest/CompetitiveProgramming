package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("bwc37")
@DisplayName("LeetCode: 1619. Mean of Array After Removing Some Elements")
class MeanOfArrayAfterRemovingSomeElementsTest {

  private MeanOfArrayAfterRemovingSomeElements meanOfArrayAfterRemovingSomeElements =
      new MeanOfArrayAfterRemovingSomeElements();

  @Test
  void test1() {
    double actual = meanOfArrayAfterRemovingSomeElements.trimMean(new int[]{
        1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3
    });
    Assertions.assertTrue(1.9999 < actual && actual < 2.00001);
  }
}
