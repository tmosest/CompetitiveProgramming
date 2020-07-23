package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("wc190")
@DisplayName("LeetCode: 1456. Maximum Number of Vowels in a Substring of Given Length")
class MaximumNumberOfVowelsInSubstringOfGivenLengthTest {

  private MaximumNumberOfVowelsInSubstringOfGivenLength maximumNumberOfVowelsInSubstringOfGivenLength =
      new MaximumNumberOfVowelsInSubstringOfGivenLength();

  private void test(String word, int len, int out) {
    Assertions
        .assertEquals(out, maximumNumberOfVowelsInSubstringOfGivenLength.maxVowels(word, len));
  }

  @Test
  void testCase0() {
    test("abciiidef", 3, 3);
  }

  @Test
  void testCase1() {
    test("aeiou", 2, 2);
  }

  @Test
  void testCase2() {
    test("leetcode", 3, 2);
  }

  @Test
  void testCase3() {
    test("rhythms", 4, 0);
  }

  @Test
  void testCase4() {
    test("tryhard", 4, 1);
  }
}
