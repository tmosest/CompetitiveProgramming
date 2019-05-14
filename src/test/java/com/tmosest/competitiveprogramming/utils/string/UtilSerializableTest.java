package com.tmosest.competitiveprogramming.utils.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Utilities: UtilSerializableTest")
class UtilSerializableTest {

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(5, UtilSerializable.convertFrom(UtilSerializable.convertToString(5).get()).get());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase1() {
    for (int i = 0; i < 100; i++) {
      Assertions.assertEquals(i, UtilSerializable.convertFrom(UtilSerializable.convertToString(i).get()).get());
    }
  }
}
