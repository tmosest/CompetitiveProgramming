package com.tmosest.competitiveprogramming.crackingcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringRotationTest {

  @Test
  void test() {
    Assertions.assertEquals(true, StringRotation.isRotation("erbottlewat", "waterbottle"));
  }
}
