package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("matrix")
@DisplayName("LeetCode: 874. Walking Robot Simulation")
public class WalkingRobotSimulationTest {

  WalkingRobotSimulation walkingRobotSimulation = new WalkingRobotSimulation();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] commands = {4,-1,3};
    int[][] obstacles = {};
    Assertions.assertEquals(25, walkingRobotSimulation.robotSim(commands, obstacles));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] commands = {4,-1,4,-2,4};
    int[][] obstacles = {
        {2,4}
    };
    Assertions.assertEquals(65, walkingRobotSimulation.robotSim(commands, obstacles));
  }
}
