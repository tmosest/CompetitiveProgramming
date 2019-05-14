package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("matrix")
@Tag("string")
@DisplayName("LeetCode: 422. Valid Word Square")
class ValidWordSqaureTest {
	/* Write code here. */

  ValidWordSqaure validWordSqaure = new ValidWordSqaure();

  private void test(String[] input, boolean expected) {
    List<String> inputList = Arrays.asList(input);
    Assertions.assertEquals(expected, validWordSqaure.validWordSquare(inputList));
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] input = {
        "abcd",
        "bnrt",
        "crmy",
        "dtye"
    };
    test(input, true);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    String[] input = {
        "abcd",
        "bnrt",
        "crm",
        "dt"
    };
    test(input, true);
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    String[] input = {
        "ball",
        "area",
        "read",
        "lady"
    };
    test(input, false);
  }


}
