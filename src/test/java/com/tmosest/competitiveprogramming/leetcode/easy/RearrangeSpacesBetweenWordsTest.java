package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("wc208")
@DisplayName("LeetCode: 1592. Rearrange Spaces Between Words")
class RearrangeSpacesBetweenWordsTest {

  private RearrangeSpacesBetweenWords rearrangeSpacesBetweenWords = new RearrangeSpacesBetweenWords();

  @Test
  void test1() {
    Assertions.assertEquals("this   is   a   sentence",
        rearrangeSpacesBetweenWords.reorderSpaces("  this   is  a sentence "));
  }
}
