package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1176. Diet Plan Performance")
class DietPlanPerformanceTest {

  private DietPlanPerformance dietPlanPerformance = new DietPlanPerformance();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1,2,3,4,5
    };
    Assertions.assertEquals(0, dietPlanPerformance.dietPlanPerformance(input, 1, 3, 3));
  }
}
