package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 187. Repeated DNA Sequences")
class RepeatedDnaSequencesTest {

  private RepeatedDnaSequences repeatedDnaSequences = new RepeatedDnaSequences();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String input = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
    String[] expected = {"AAAAACCCCC", "CCCCCAAAAA"};
    Assertions.assertEquals(Arrays.asList(expected), repeatedDnaSequences.findRepeatedDnaSequences(input));
  }
}
