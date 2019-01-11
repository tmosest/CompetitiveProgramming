package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 824. Goat Latin")
public class GoatLatinTest {

  GoatLatin goatLatin = new GoatLatin();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", goatLatin.toGoatLatin("I speak Goat Latin"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals(
        "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa",
        goatLatin.toGoatLatin(
            "The quick brown fox jumped over the lazy dog"
        )
    );
  }
}
