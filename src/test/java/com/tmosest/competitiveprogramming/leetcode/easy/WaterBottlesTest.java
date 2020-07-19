package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("number")
@Tag("wc198")
@DisplayName("LeetCode: 1518. Water Bottles")
class WaterBottlesTest {

  private WaterBottles waterBottles = new WaterBottles();

  private void test(int numBottles, int numExchange, int output) {
    Assertions.assertEquals(output, waterBottles.numWaterBottles(numBottles, numExchange));
  }

  @Test
  void testCase0() {
    test(9, 3, 13);
  }

  @Test
  void testCase1() {
    test(15, 4, 19);
  }

  @Test
  void testCase2() {
    test(5, 5, 6);
  }

  @Test
  void testCase3() {
    test(2, 3, 2);
  }

  @Test
  void testCase4() {
    test(15, 8, 17);
  }
}
