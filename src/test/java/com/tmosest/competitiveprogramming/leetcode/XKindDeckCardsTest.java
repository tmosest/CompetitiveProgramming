package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 914. X of a Kind in a Deck of Cards")
public class XKindDeckCardsTest {

  XKindDeckCards xKindDeckCards = new XKindDeckCards();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1,2,3,4,4,3,2,1
    };
    Assertions.assertTrue(xKindDeckCards.hasGroupsSizeX(input));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] input = {
        1,1,1,2,2,2,3,3
    };
    Assertions.assertFalse(xKindDeckCards.hasGroupsSizeX(input));
  }
}
