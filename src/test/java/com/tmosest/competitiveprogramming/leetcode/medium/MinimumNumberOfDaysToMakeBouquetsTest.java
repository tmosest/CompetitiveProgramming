package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc193")
@DisplayName("LeetCode: 1482. Minimum Number of Days to Make m Bouquets")
class MinimumNumberOfDaysToMakeBouquetsTest {

  private MinimumNumberOfDaysToMakeBouquets minimumNumberOfDaysToMakeBouquets =
      new MinimumNumberOfDaysToMakeBouquets();

  private void test(int[] flowers, int m, int k, int output) {
    Assertions.assertEquals(output, minimumNumberOfDaysToMakeBouquets.minDays(flowers, m, k));
  }

  @Test
  void testCase0() {
    test(new int[] {1,10,3,10,2}, 3, 1, 3);
  }

  @Test
  void testCase1() {
    test(new int[] {1,10,3,10,2}, 3, 2, -1);
  }

  @Test
  void testCase2() {
    test(new int[] {7,7,7,7,12,7,7}, 2, 3, 12);
  }
}
