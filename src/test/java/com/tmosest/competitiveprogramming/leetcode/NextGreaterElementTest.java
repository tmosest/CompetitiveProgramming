package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 496. Next Greater Element I")
public class NextGreaterElementTest {

  NextGreaterElement nextGreaterElement = new NextGreaterElement();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input1 = {
        4,1,2
    };
    int[] input2 = {
        1,3,4,2
    };
    int[] expected = {
        -1,3,-1
    };
    Assertions.assertArrayEquals(expected, nextGreaterElement.nextGreaterElement(input1, input2));
  }
}
