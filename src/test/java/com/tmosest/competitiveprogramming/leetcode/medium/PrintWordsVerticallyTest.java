package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@DisplayName("LeetCode: 1324. Print Words Vertically")
class PrintWordsVerticallyTest {

  private PrintWordsVertically printWordsVertically =
      new PrintWordsVertically();

  @Test
  void testCase0() {
    Assertions.assertEquals(
        Arrays.asList("HAY","ORO","WEU"),
        printWordsVertically.printVertically("HOW ARE YOU")
    );
  }

  @Test
  void testCase1() {
    Assertions.assertEquals(
        Arrays.asList("TBONTB","OEROOE","   T"),
        printWordsVertically.printVertically("TO BE OR NOT TO BE")
    );
  }

  @Test
  void testCase2() {
    Assertions.assertEquals(
        Arrays.asList("CIC","OSO","N M","T I","E N","S G","T"),
        printWordsVertically.printVertically("CONTEST IS COMING")
    );
  }
}
