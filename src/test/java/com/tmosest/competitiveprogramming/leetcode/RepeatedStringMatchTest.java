package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 686. Repeated String Match")
public class RepeatedStringMatchTest {

  RepeatedStringMatch repeatedStringMatch = new RepeatedStringMatch();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(3, repeatedStringMatch.repeatedStringMatch("abcd", "cdabcdab"));
  }
}
