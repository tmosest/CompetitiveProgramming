package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 744. Find Smallest Letter Greater Than Target")
public class FindSmallestLetterGreaterThanTargetTest {

  FindSmallestLetterGreaterThanTarget findSmallestLetterGreaterThanTarget = new FindSmallestLetterGreaterThanTarget();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    char[] letters = {'c', 'f', 'j'};
    Assertions.assertEquals('c', findSmallestLetterGreaterThanTarget.nextGreatestLetter(letters, 'a'));
  }
}
