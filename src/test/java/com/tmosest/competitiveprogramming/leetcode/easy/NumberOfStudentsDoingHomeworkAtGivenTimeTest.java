package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc189")
@DisplayName("LeetCode: 1450. Number of Students Doing Homework at a Given Time")
class NumberOfStudentsDoingHomeworkAtGivenTimeTest {

  private NumberOfStudentsDoingHomeworkAtGivenTime numberOfStudentsDoingHomeworkAtGivenTime =
      new NumberOfStudentsDoingHomeworkAtGivenTime();

  @Test
  void testCase0() {
    Assertions.assertEquals(1, numberOfStudentsDoingHomeworkAtGivenTime.busyStudent(
        new int[]{1, 2, 3}, new int[]{3, 2, 7}, 4
    ));
  }
}
