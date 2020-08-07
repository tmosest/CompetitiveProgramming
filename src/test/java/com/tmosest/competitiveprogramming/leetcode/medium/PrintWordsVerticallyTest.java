package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("wc172")
@DisplayName("LeetCode: 1324. Print Words Vertically")
class PrintWordsVerticallyTest {

  private PrintWordsVertically printWordsVertically = new PrintWordsVertically();

  @Test
  void testCase0() {
    Assertions.assertArrayEquals(new String[] {"HAY","ORO","WEU"},
        printWordsVertically.printVertically("HOW ARE YOU").toArray(new String[0])
    );
  }
}
