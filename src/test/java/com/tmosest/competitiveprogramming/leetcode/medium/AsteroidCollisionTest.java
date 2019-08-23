package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 735. Asteroid Collision")
class AsteroidCollisionTest {

  private AsteroidCollision asteroidCollision = new AsteroidCollision();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        5, 10, -5
    };
    int[] output = {
        5, 10
    };
    Assertions.assertArrayEquals(output, asteroidCollision.asteroidCollision(input));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] input = {
        8, -8
    };
    int[] output = {};
    Assertions.assertArrayEquals(output, asteroidCollision.asteroidCollision(input));
  }
}
