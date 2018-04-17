package com.tmosest.competitiveprogramming.crackingcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Cracking The Code Interview: Arrays: 1.9 String Rotation")
public class StringRotationTest {

  @Test
  void testCase0() {
    Assertions.assertEquals(true, StringRotation.isRotation("erbottlewat", "waterbottle"));
  }

  @Test
  void testCase1() {
    Assertions.assertEquals(false, StringRotation.isRotation("abc", "as"));
  }
}
