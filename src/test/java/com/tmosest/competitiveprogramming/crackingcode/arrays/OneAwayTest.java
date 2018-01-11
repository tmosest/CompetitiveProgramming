package com.tmosest.competitiveprogramming.crackingcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OneAwayTest {

  @Test
  void testCase0() {
    Assertions.assertEquals(true, OneAway.isOneAway("pale", "pal"));
  }

  @Test
  void testCase1() {
    Assertions.assertEquals(true, OneAway.isOneAway("pales", "pale"));
  }

  @Test
  void testCase2() {
    Assertions.assertEquals(true, OneAway.isOneAway("pale", "bale"));
  }

  @Test
  void testCase3() {
    Assertions.assertEquals(false, OneAway.isOneAway("pale", "bake"));
  }

}
