package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("wc198")
@DisplayName("LeetCode: 1520. Maximum Number of Non-Overlapping Substrings")
class MaximumNumberOfNonoverlappingSubstringsTest {

  private MaximumNumberOfNonoverlappingSubstrings maximumNumberOfNonoverlappingSubstrings =
      new MaximumNumberOfNonoverlappingSubstrings();

  private void test(String input, String[] output) {
    List<String> expected = Arrays.asList(output);
    List<String> actual = maximumNumberOfNonoverlappingSubstrings.maxNumOfSubstrings(input);
    Collections.sort(expected);
    Collections.sort(actual);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void testCase0() {
    test("adefaddaccc", new String[] {"e","f","ccc"});
  }

  @Test
  void testCase1() {
    test("abbaccd", new String[] {"d","bb","cc"});
  }
}
