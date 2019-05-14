package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("binaryTree")
@DisplayName("LeetCode: 904. Fruit Into Baskets")
class FruitIntoBasketsTest {
	/* Write code here. */

  FruitIntoBaskets fruitIntoBaskets = new FruitIntoBaskets();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1,2,1
    };
    Assertions.assertEquals(3, fruitIntoBaskets.totalFruit(input));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] input = {
        0,1,2,2
    };
    Assertions.assertEquals(3, fruitIntoBaskets.totalFruit(input));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    int[] input = {
        1,2,3,2,2
    };
    Assertions.assertEquals(4, fruitIntoBaskets.totalFruit(input));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    int[] input = {
        3,3,3,1,2,1,1,2,3,3,4
    };
    Assertions.assertEquals(5, fruitIntoBaskets.totalFruit(input));
  }

  @Test
  @DisplayName("Test Case 4")
  void testCase4() {
    int[] input = {
        0,0,1,1
    };
    Assertions.assertEquals(4, fruitIntoBaskets.totalFruit(input));
  }


}
