package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("matrix")
@Tag("wc222")
@DisplayName("LeetCode: 1710. Maximum Units on a Truck")
class MaximumUnitsOnTruckTest {

  private MaximumUnitsOnTruck maximumUnitsOnTruck;

  @BeforeEach
  void setup() {
    maximumUnitsOnTruck = new MaximumUnitsOnTruck();
  }

  private void test(int output, int[][] boxTypes, int truckSize) {
    Assertions.assertEquals(output, maximumUnitsOnTruck.maximumUnits(boxTypes, truckSize));
  }

  @Test
  void test0() {
    test(8, new int[][]{{1, 3}, {2, 2}, {3, 1}}, 4);
  }

  @Test
  void test1() {
    test(91, new int[][]{{5, 10}, {2, 5}, {4, 7}, {3, 9}}, 10);
  }
}
