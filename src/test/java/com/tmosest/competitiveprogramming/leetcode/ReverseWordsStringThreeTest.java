package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 557. Reverse Words in a String III")
public class ReverseWordsStringThreeTest {

  ReverseWordsStringThree reverseWordsStringThree = new ReverseWordsStringThree();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(
        "s'teL ekat edoCteeL tsetnoc",
        reverseWordsStringThree.reverseWords("Let's take LeetCode contest")
    );
  }
}
