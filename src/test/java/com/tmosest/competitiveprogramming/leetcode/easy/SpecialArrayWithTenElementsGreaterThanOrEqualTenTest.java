package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc170")
@DisplayName("LeetCode: 1608. Special Array With X Elements Greater Than or Equal X")
class SpecialArrayWithTenElementsGreaterThanOrEqualTenTest {

  private SpecialArrayWithTenElementsGreaterThanOrEqualTen specialArrayWithTenElementsGreaterThanOrEqualTen =
      new SpecialArrayWithTenElementsGreaterThanOrEqualTen();

  private void test(int[] nums, int out) {
    Assertions
        .assertEquals(out, specialArrayWithTenElementsGreaterThanOrEqualTen.specialArray(nums));
  }

  @Test
  void testCase0() {
    test(new int[]{3, 5}, 2);
  }
}
