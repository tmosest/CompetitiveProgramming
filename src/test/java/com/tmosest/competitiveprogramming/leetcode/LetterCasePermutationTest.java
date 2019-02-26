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
@Tag("number")
@DisplayName("LeetCode: 784. Letter Case Permutation")
public class LetterCasePermutationTest {

  LetterCasePermutation letterCasePermutation = new LetterCasePermutation();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] expected = {
        "a1b2", "a1B2", "A1b2", "A1B2"
    };
    List<String> expectedList = Arrays.asList(expected);
    List<String> actual = letterCasePermutation.letterCasePermutation("a1b2");

    Assertions.assertEquals(expectedList.size(), actual.size());

    Collections.sort(expectedList);
    Collections.sort(actual);

    for (int i = 0; i < expectedList.size(); i++) {
      Assertions.assertEquals(expectedList.get(i), actual.get(i));
    }
  }
}
