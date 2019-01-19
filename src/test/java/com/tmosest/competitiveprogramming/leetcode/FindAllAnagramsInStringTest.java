package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("list")
@DisplayName("LeetCode: 438. Find All Anagrams in a String")
public class FindAllAnagramsInStringTest {

  FindAllAnagramsInString findAllAnagramsInString = new FindAllAnagramsInString();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    List<Integer> expected = new ArrayList<>();
    expected.add(0);
    expected.add(6);

    List<Integer> actual = findAllAnagramsInString.findAnagrams("cbaebabacd", "abc");

    Assertions.assertEquals(expected.size(), actual.size());
    Collections.sort(expected);
    Collections.sort(actual);
    for (int i = 0; i < expected.size(); i++) {
      Assertions.assertEquals(expected.get(i), actual.get(i));
    }
  }
}
