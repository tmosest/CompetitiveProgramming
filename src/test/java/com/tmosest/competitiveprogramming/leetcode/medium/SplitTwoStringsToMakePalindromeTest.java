package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("wc210")
@DisplayName("LeetCode: 1616. Split Two Strings to Make Palindrome")
class SplitTwoStringsToMakePalindromeTest {


  private SplitTwoStringsToMakePalindrome splitTwoStringsToMakePalindrome =
      new SplitTwoStringsToMakePalindrome();

  private void test(boolean expected, String inputOne, String inputTwo) {
    Assertions.assertEquals(expected,
        splitTwoStringsToMakePalindrome.checkPalindromeFormation(inputOne, inputTwo));
  }

  @Test
  void test1() {
    test(true, "x", "y");
  }
}
