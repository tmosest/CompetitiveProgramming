package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("array")
@DisplayName("LeetCode: 890. Find and Replace Pattern")
class FindAndReplacePatternTest {

  private FindAndReplacePattern findAndReplacePattern =
      new FindAndReplacePattern();

  @Test
  void testCase0() {
    List<String> expected = Arrays.asList("mee","aqq");
    Assertions.assertEquals(expected, findAndReplacePattern.findAndReplacePattern(
        new String[] {
            "abc","deq","mee","aqq","dkd","ccc"
        },
        "abb"
    ));
  }
}
