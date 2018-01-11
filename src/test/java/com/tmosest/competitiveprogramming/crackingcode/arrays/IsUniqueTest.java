package com.tmosest.competitiveprogramming.crackingcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsUniqueTest {

  @Test
  public void testCase0() {
    Assertions.assertEquals(true, IsUnique.isUnique("abcdefghijklmnop"));
  }

  @Test
  public void testCase1() {
    Assertions.assertEquals(false, IsUnique.isUnique("!!.;'[[]\\+"));
  }
}
