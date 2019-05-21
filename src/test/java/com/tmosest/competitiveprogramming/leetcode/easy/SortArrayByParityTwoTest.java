package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 922. Sort Array By Parity II")
class SortArrayByParityTwoTest {
	/* Write code here. */

  SortArrayByParityTwo sortArrayByParityTwo = new SortArrayByParityTwo();

  private int indexOf(int[] array, int num) {
    int result = -1;
    for (int i = 0; i < array.length; i++) {
      if (num == array[i]) {
        return i;
      }
    }
    return result;
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        4,2,5,7
    };
    int[] actual = sortArrayByParityTwo.sortArrayByParity(input);
    for (int num : input) {
      int index = indexOf(actual, num);
      Assertions.assertNotEquals(-1, index);
      Assertions.assertEquals(num % 2, index % 2);
    }
  }


}
