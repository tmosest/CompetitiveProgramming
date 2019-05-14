package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@DisplayName("LeetCode: 621. Task Scheduler")
class TaskSchedulerTest {
	/* Write code here. */

  TaskScheduler taskScheduler = new TaskScheduler();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    char[] tasks = {
        'A','A','A','B','B','B'
    };
    Assertions.assertEquals(8, taskScheduler.leastInterval(tasks, 2));
  }


}
