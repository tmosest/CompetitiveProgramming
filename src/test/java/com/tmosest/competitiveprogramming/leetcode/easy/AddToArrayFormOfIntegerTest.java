package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("bigInteger")
@DisplayName("LeetCode: 989. Add to Array-Form of Integer")
class AddToArrayFormOfIntegerTest {

  private AddToArrayFormOfInteger addToArrayFormOfInteger = new AddToArrayFormOfInteger();

  private void test(int[] input, int toAdd, Integer[] output) {
    List<Integer> expected = Arrays.asList(output);
    List<Integer> actual = addToArrayFormOfInteger.addToArrayForm(input, toAdd);
    Assertions.assertEquals(expected.size(), actual.size());

    for (int i = 0; i < expected.size(); i++) {
      Assertions.assertEquals(expected.get(i), actual.get(i));
    }
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1,2,0,0
    };
    Integer[] output = {
        1,2,3,4
    };
    test(input, 34, output);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] input = {
        2,1,5
    };
    Integer[] output = {
        1,0,2,1
    };
    test(input, 806, output);
  }
}
