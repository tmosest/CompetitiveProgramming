package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1170. Compare Strings by Frequency of the Smallest Character")
class CompareStringsByFrequencyOfTheSmallestCharacterTest {

  private CompareStringsByFrequencyOfTheSmallestCharacter compareStringsByFrequencyOfTheSmallestCharacter = new CompareStringsByFrequencyOfTheSmallestCharacter();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] queries = {"cbd"};
    String[] words = {"zaaaz"};
    int[] expected = {1};

    Assertions.assertArrayEquals(expected, compareStringsByFrequencyOfTheSmallestCharacter.numSmallerByFrequency(queries, words));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    String[] queries = {"bbb","cc"};
    String[] words = {"a","aa","aaa","aaaa"};
    int[] expected = {1, 2};

    Assertions.assertArrayEquals(expected, compareStringsByFrequencyOfTheSmallestCharacter.numSmallerByFrequency(queries, words));
  }
}
