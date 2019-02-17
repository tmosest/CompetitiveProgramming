package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 657. Robot Return to Origin")
public class RobotReturnToOriginTest {

  RobotReturnToOrigin robotReturnToOrigin = new RobotReturnToOrigin();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertTrue(robotReturnToOrigin.judgeCircle("UD"));
  }
}
