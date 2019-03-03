package com.tmosest.competitiveprogramming.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("string")
@DisplayName("LeetCode: 1002. Find Common Characters")
public class FindCommonCharactersTest {

  FindCommonCharacters findCommonCharacters = new FindCommonCharacters();

  private void test(String[] input, String[] output) {
    List<String> expected = Arrays.asList(output);
    List<String> actual = findCommonCharacters.commonChars(input);
    Assertions.assertEquals(expected.size(), actual.size());
    Collections.sort(expected);
    Collections.sort(actual);
    for (int i = 0; i < expected.size(); i++) {
      Assertions.assertEquals(expected.get(i), actual.get(i));
    }
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] input = {
        "bella","label","roller"
    };
    String[] output = {
        "e","l","l"
    };
    test(input, output);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    String[] input = {
        "cool","lock","cook"
    };
    String[] output = {
        "c","o"
    };
    test(input, output);
  }
}
