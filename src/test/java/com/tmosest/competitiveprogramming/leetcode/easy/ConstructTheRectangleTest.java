package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("matrix")
@DisplayName("LeetCode: 492. Construct the Rectangle")
class ConstructTheRectangleTest {
	/* Write code here. */

  ConstructTheRectangle constructTheRectangle = new ConstructTheRectangle();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] expected = {
        2, 2
    };
    Assertions.assertArrayEquals(expected, constructTheRectangle.constructRectangle(4));
  }


}
