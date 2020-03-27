package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("dynamic")
@DisplayName("LeetCode: 213. House Robber II")
class HouseRobberTwoTest {

  private HouseRobberTwo houseRobberTwo = new HouseRobberTwo();

  @Test
  void testCase0() {
    Assertions.assertEquals(3, houseRobberTwo.rob(
        new int[] {2,3,2}
    ));
  }

  @Test
  void testCase1() {
    Assertions.assertEquals(4, houseRobberTwo.rob(
        new int[] {1,2,3,1}
    ));
  }

  @Test
  void testCase2() {
    Assertions.assertEquals(9, houseRobberTwo.rob(
        new int[] {4,1,1,1,4,1}
    ));
  }
}
