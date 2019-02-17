package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("map")
@Tag("matrix")
@DisplayName("LeetCode: 746. Min Cost Climbing Stairs")
public class NumberOfBoomerangsTest {

  NumberOfBoomerangs numberOfBoomerangs = new NumberOfBoomerangs();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] input = {
        {0,0},
        {1,0},
        {2,0}
    };
    Assertions.assertEquals(2, numberOfBoomerangs.numberOfBoomerangs(input));
  }
}
