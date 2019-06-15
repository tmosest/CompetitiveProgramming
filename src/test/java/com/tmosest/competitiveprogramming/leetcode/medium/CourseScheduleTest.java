package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 207. Course Schedule")
class CourseScheduleTest {

  private CourseSchedule courseSchedule = new CourseSchedule();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] input = {
        {1, 0}
    };
    Assertions.assertTrue(courseSchedule.canFinish(2, input));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[][] input = {
        {1, 0},
        {0, 1}
    };
    Assertions.assertFalse(courseSchedule.canFinish(2, input));
  }
}
