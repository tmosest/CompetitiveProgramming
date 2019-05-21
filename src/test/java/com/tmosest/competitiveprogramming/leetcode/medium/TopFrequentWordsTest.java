package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("string")
@DisplayName("LeetCode: 692. Top K Frequent Words\n")
class TopFrequentWordsTest {
	/* Write code here. */

  TopFrequentWords topFrequentWords = new TopFrequentWords();

  private void test(String[] input, int size, String[] output) {
    List<String> actual = topFrequentWords.topKFrequent(input, size);
    List<String> expected = Arrays.asList(output);
    Assertions.assertEquals(expected.size(), actual.size());
    for (int i = 0; i < expected.size(); i++) {
      Assertions.assertEquals(expected.get(i), actual.get(i));
    }
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] input = {
        "i", "love", "leetcode", "i", "love", "coding"
    };
    String[] output = {
        "i", "love"
    };
    test(input, 2, output);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    String[] input = {
        "the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"
    };
    String[] output = {
        "the", "is", "sunny", "day"
    };
    test(input, 4, output);
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    String[] input = {
        "b", "a", "b", "a"
    };
    String[] output = {
        "a", "b"
    };
    test(input, 2, output);
  }


}
