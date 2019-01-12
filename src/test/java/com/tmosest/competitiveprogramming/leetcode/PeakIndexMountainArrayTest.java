package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 852. Peak Index in a Mountain Array")
public class PeakIndexMountainArrayTest {

  PeakIndexMountainArray peakIndexMountainArray = new PeakIndexMountainArray();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {0,1,0};
    Assertions.assertEquals(1, peakIndexMountainArray.peakIndexInMountainArray(input));
  }
}
