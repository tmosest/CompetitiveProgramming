package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("wc180")
@DisplayName("LeetCode: 5359. Maximum Performance of a Team")
class MaximumPerformanceOfTeamTest {

  private MaximumPerformanceOfTeam maximumPerformanceOfTeam =
      new MaximumPerformanceOfTeam();

  @Test
  void testCase0() {
    int[] speed = {2,10,3,1,5,8};
    int[] efficiency = {5,4,3,9,7,2};
    Assertions.assertEquals(60, maximumPerformanceOfTeam.maxPerformance(6, speed, efficiency, 2));
  }

  @Test
  void testCase1() {
    int[] speed = {2,10,3,1,5,8};
    int[] efficiency = {5,4,3,9,7,2};
    Assertions.assertEquals(68, maximumPerformanceOfTeam.maxPerformance(6, speed, efficiency, 3));
  }

  @Test
  void testCase2() {
    int[] speed = {2,10,3,1,5,8};
    int[] efficiency = {5,4,3,9,7,2};
    Assertions.assertEquals(72, maximumPerformanceOfTeam.maxPerformance(6, speed, efficiency, 4));
  }

  @Test
  void testCase3() {
    int[] speed = {2,8,2};
    int[] efficiency = {2,7,1};
    Assertions.assertEquals(56, maximumPerformanceOfTeam.maxPerformance(3, speed, efficiency, 2));
  }
}
