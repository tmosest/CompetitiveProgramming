package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 5354. Time Needed to Inform All Employees")
class TimeNeededToInformAllEmployeesTest {

  private TimeNeededToInformAllEmployees timeNeededToInformAllEmployees =
      new TimeNeededToInformAllEmployees();

  @Test
  void testCase0() {
    int[] manager = {-1};
    int[] informTime = {0};
    Assertions.assertEquals(0, timeNeededToInformAllEmployees.numOfMinutes(1, 0, manager, informTime));
  }

  @Test
  void testCase1() {
    int[] manager = {2,2,-1,2,2,2};
    int[] informTime = {0,0,1,0,0,0};
    Assertions.assertEquals(1, timeNeededToInformAllEmployees.numOfMinutes(6, 2, manager, informTime));
  }

  @Test
  void testCase2() {
    int[] manager = {1,2,3,4,5,6,-1};
    int[] informTime = {0,6,5,4,3,2,1};
    Assertions.assertEquals(21, timeNeededToInformAllEmployees.numOfMinutes(7, 6, manager, informTime));
  }

  @Test
  void testCase3() {
    int[] manager = {-1,0,0,1,1,2,2,3,3,4,4,5,5,6,6};
    int[] informTime = {1,1,1,1,1,1,1,0,0,0,0,0,0,0,0};
    Assertions.assertEquals(3, timeNeededToInformAllEmployees.numOfMinutes(15, 0, manager, informTime));
  }
}
