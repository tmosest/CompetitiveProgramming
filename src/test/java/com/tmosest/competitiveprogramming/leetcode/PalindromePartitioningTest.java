package com.tmosest.competitiveprogramming.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@DisplayName("LeetCode: 611. Valid Triangle Number")
public class PalindromePartitioningTest {

  PalindromePartitioning palindromePartitioning = new PalindromePartitioning();

  private void test(String input, String[][] output) {
    List<List<String>> expected = new LinkedList<>();
    for (String[] array : output) {
      expected.add(0, Arrays.asList(array));
    }
    List<List<String>> actual = palindromePartitioning.partition(input);
    Assertions.assertEquals(expected.size(), actual.size());
    for (int i = 0; i < expected.size(); i++) {
      Assertions.assertEquals(expected.get(i).size(), actual.get(i).size());
      for (int j = 0; j < expected.get(i).size(); j++) {
        Assertions.assertEquals(expected.get(i).get(j), actual.get(i).get(j));
      }
    }
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[][] expected = {
        {"aa","b"},
        {"a","a","b"}
    };
    String input = "aab";
    test(input, expected);
  }
}
