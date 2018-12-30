package com.tmosest.competitiveprogramming.leetcode;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("LeetCode: 17. Letter Combinations of a Phone Number")
public class LetterCombinationsOfAPhoneNumberTest {
  LetterCombinationsOfAPhoneNumber letterCombinationsOfAPhoneNumber = new LetterCombinationsOfAPhoneNumber();

  @Test
  @DisplayName("Test Case 0")
  public void testCase0() {
    String input = "23";
    String[] expected = {"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"};
    String[] actual = letterCombinationsOfAPhoneNumber.letterCombinations(input).toArray(new String[0]);
    Arrays.sort(expected);
    Arrays.sort(actual);
    Assertions.assertArrayEquals(expected, actual);
  }
}
