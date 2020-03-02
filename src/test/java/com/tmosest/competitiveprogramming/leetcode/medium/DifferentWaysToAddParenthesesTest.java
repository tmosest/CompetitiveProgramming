package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 241. Different Ways to Add Parentheses")
class DifferentWaysToAddParenthesesTest {

  private DifferentWaysToAddParentheses differentWaysToAddParentheses =
      new DifferentWaysToAddParentheses();

  @Test
  void testCase0() {
    Integer[] output = {0, 2};
    List<Integer> expected = Arrays.asList(output);
    List<Integer> actual = differentWaysToAddParentheses.diffWaysToCompute("2-1-1");
    Collections.sort(actual);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void testCase1() {
    Integer[] output = {-34, -14, -10, -10, 10};
    List<Integer> expected = Arrays.asList(output);
    List<Integer> actual = differentWaysToAddParentheses.diffWaysToCompute("2*3-4*5");
    Collections.sort(actual);
    Assertions.assertEquals(expected, actual);
  }
}
