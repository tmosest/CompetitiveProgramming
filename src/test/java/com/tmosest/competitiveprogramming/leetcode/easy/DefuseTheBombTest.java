package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("bwc39")
@DisplayName("LeetCode: 1652. Defuse the Bomb")
class DefuseTheBombTest {

  private DefuseTheBomb defuseTheBomb = new DefuseTheBomb();

  @Test
  void test1() {
    Assertions.assertArrayEquals(new int[]{
        12, 10, 16, 13
    }, defuseTheBomb.decrypt(new int[]{5, 7, 1, 4}, 3));
  }
}
