package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("LeetCode: 677. Map Sum Pairs")
class MapSumTest {
  private MapSum mapSum;

  @BeforeEach
  void setup() {
    mapSum = new MapSum();
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    mapSum.insert("apple", 3);
    Assertions.assertEquals(3, mapSum.sum("ap"));
    mapSum.insert("app", 2);
    Assertions.assertEquals(5, mapSum.sum("ap"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    mapSum.insert("a", 3);
    Assertions.assertEquals(0, mapSum.sum("ap"));
    mapSum.insert("b", 2);
    Assertions.assertEquals(3, mapSum.sum("a"));
  }
}
