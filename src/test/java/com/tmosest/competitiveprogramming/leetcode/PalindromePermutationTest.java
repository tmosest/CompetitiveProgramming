package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 266. Palindrome Permutation")
public class PalindromePermutationTest {

  PalindromePermutation palindromePermutation = new PalindromePermutation();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertFalse(palindromePermutation.canPermutePalindrome("code"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertTrue(palindromePermutation.canPermutePalindrome("aab"));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertTrue(palindromePermutation.canPermutePalindrome("carerac"));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    Assertions.assertFalse(palindromePermutation.canPermutePalindrome("AaBb//a"));
  }
}
