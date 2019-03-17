package com.tmosest.competitiveprogramming.leetcode;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("list")
@Tag("matrix")
@DisplayName("LeetCode: 54. Spiral Matrix")
public class SpiralMatrixTest {

  SpiralMatrix spiralMatrix = new SpiralMatrix();

  private void test(int[][] input, Integer[] expected) {
    List<Integer> actual = spiralMatrix.spiralOrder(input);
    Assertions.assertEquals(expected.length, actual.size());
    List<Integer> exptedList = Arrays.asList(expected);
    for (int i = 0; i < expected.length; i++) {
      Assertions.assertEquals(exptedList.get(i), actual.get(i));
    }
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] input = {
     { 1, 2, 3 },
     { 4, 5, 6 },
     { 7, 8, 9 }
    };
    Integer[] expected = {
        1,2,3,6,9,8,7,4,5
    };
    test(input, expected);
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase1() {
    int[][] input = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9,10,11,12}
    };
    Integer[] expected = {
        1,2,3,4,8,12,11,10,9,5,6,7
    };
    test(input, expected);
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    int[][] input = {
    };
    Integer[] expected = {};
    test(input, expected);
  }
}
