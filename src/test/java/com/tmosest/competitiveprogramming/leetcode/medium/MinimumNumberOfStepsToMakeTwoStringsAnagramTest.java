package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("wc175")
@DisplayName("LeetCode: 1347. Minimum Number of Steps to Make Two Strings Anagram")
class MinimumNumberOfStepsToMakeTwoStringsAnagramTest {

  private MinimumNumberOfStepsToMakeTwoStringsAnagram minimumNumberOfStepsToMakeTwoStringsAnagram =
      new MinimumNumberOfStepsToMakeTwoStringsAnagram();

  private void test(String one, String two, int output) {
    Assertions.assertEquals(output, minimumNumberOfStepsToMakeTwoStringsAnagram.minSteps(
        one, two
    ));
  }

  @Test
  void testCase0() {
    test("bab", "aba", 1);
  }

  @Test
  void testCase1() {
    test("leetcode", "practice", 5);
  }

  @Test
  void testCase2() {
    test("anagram", "mangaar", 0);
  }

  @Test
  void testCase3() {
    test("xxyyzz", "xxyyzz", 0);
  }

  @Test
  void testCase4() {
    test("friend", "family", 4);
  }
}
