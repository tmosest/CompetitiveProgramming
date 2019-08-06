package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1094. Car Pooling")
class CarPoolingTest {

  private CarPooling carPooling = new CarPooling();

  @Test
  @DisplayName("Test Case 0")
  void testCar0() {
    int[][] input = 
        {{2,1,5},{3,3,7}};
    Assertions.assertFalse(carPooling.carPooling(input, 4));
  }
}
