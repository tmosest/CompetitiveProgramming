package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 916. Word Subsets")
class WordSubsetsTest {

  private WordSubsets wordSubsets = new WordSubsets();

  @Test
  void testCase0() {
    String[] expected = {"facebook", "google", "leetcode"};
    List<String> expectedList = Arrays.asList(expected);

    String[] one = {"facebook","google","leetcode"};
    String[] two = {"e","o"};
    Assertions.assertEquals(expectedList, wordSubsets.wordSubsets(one, two));
  }

  @Test
  void testCase1() {
    String[] expected = {"apple", "google", "leetcode"};
    List<String> expectedList = Arrays.asList(expected);

    String[] one = {"amazon","apple","facebook","google","leetcode"};
    String[] two = {"e","l"};
    Assertions.assertEquals(expectedList, wordSubsets.wordSubsets(one, two));
  }

  @Test
  void testCase2() {
    String[] expected = {"facebook","google"};
    List<String> expectedList = Arrays.asList(expected);

    String[] one = {"amazon","apple","facebook","google","leetcode"};
    String[] two = {"e","oo"};
    Assertions.assertEquals(expectedList, wordSubsets.wordSubsets(one, two));
  }

  @Test
  void testCase3() {
    String[] expected = {"google","leetcode"};
    List<String> expectedList = Arrays.asList(expected);

    String[] one = {"amazon","apple","facebook","google","leetcode"};
    String[] two = {"eo","lo"};
    Assertions.assertEquals(expectedList, wordSubsets.wordSubsets(one, two));
  }
}
